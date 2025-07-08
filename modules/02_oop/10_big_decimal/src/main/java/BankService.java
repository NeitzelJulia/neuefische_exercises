import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

public class BankService {

    private Map<String, Account> accounts = new HashMap<>();
    private final AtomicLong nextAccountNo = new AtomicLong(10000001);

    public String openAccount(Client client) {
        String accountNo = String.format("%010d", nextAccountNo.getAndIncrement());
        Account account = new Account(accountNo, client);
        accounts.put(accountNo, account);
        return accountNo;
    }

    public void transfer(String from, String to, BigDecimal amount) {
        accounts.get(from).withdraw(amount);
        accounts.get(to).deposit(amount);
    }

}
