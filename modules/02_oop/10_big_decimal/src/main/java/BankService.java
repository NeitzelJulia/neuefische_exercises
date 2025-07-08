import java.math.BigDecimal;
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

}
