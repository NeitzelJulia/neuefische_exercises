import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;

public class BankService {

    private final Map<String, Account> accounts = new ConcurrentHashMap<>();
    private final AtomicLong nextAccountNo = new AtomicLong(10000001);

    public String openAccount(List<Client> clients) {
        String accountNo = String.format("%010d", nextAccountNo.getAndIncrement());
        Account account = new Account(accountNo, clients);
        accounts.put(accountNo, account);
        return accountNo;
    }

    public String openAccount(Client client) {
        return openAccount(List.of(client));
    }

    public void transfer(String from, String to, BigDecimal amount) {
        Account fromAcc = accounts.get(from);
        Account toAcc = accounts.get(to);

        if (fromAcc == null || toAcc == null) {
            throw new IllegalArgumentException("invalid account no");
        }

        if (amount.compareTo(BigDecimal.ZERO) <= 0) {
            throw new IllegalArgumentException("invalid amount");
        }

        fromAcc.withdraw(amount);
        toAcc.deposit(amount);
    }

    public List<String> split(String accountNumber) {
        Account account = accounts.get(accountNumber);
        if (account == null) {
            throw new IllegalArgumentException("invalid account no");
        }

        List<Client> clients = account.getClients();

        int count = clients.size();
        if (count < 2) {
            throw new IllegalArgumentException("invalid number of clients");
        }

        BigDecimal total = account.getBalance().setScale(2, RoundingMode.DOWN);
        BigDecimal basis = total.divide(BigDecimal.valueOf(count), 2,  RoundingMode.DOWN);
        BigDecimal remaining = total.subtract(basis.multiply(BigDecimal.valueOf(count)));

        List<String> newAccounts = new ArrayList<>();
        BigDecimal oneCent = BigDecimal.valueOf(1, 2);

        for (Client client : clients) {
            String newAccountNo = openAccount(client);
            BigDecimal amount = basis;
            if (remaining.compareTo(BigDecimal.ZERO) > 0) {
                amount = amount.add(oneCent);
                remaining = remaining.subtract(oneCent);
            }
            accounts.get(newAccountNo).deposit(amount);
            newAccounts.add(newAccountNo);
        }

        accounts.remove(accountNumber);

        return newAccounts;
    }

}
