import java.math.BigDecimal;
import java.util.List;
import java.util.Objects;

public class Account {

    private final String accountNo;
    private BigDecimal balance;
    private final List<Client> clients;

    Account(String accountNo, List<Client> clients) {
        this.accountNo = accountNo;
        this.clients = List.copyOf(clients);
        balance = BigDecimal.ZERO;
    }

    Account(String accountNo, Client client) {
        this(accountNo, List.of(client));
    }

    public void deposit(BigDecimal amount) {
        Objects.requireNonNull(balance, "balance is null");
        if (amount.compareTo(BigDecimal.ZERO) <= 0) {
            throw new IllegalArgumentException();
        }
        balance = balance.add(amount);
    }

    public void withdraw(BigDecimal amount) {
        Objects.requireNonNull(balance, "balance is null");
        if (amount.compareTo(BigDecimal.ZERO) <= 0) {
            throw new IllegalArgumentException();
        }
        balance = balance.subtract(amount);
    }

    public String getAccountNo() {
        return accountNo;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public List<Client> getClients() {
        return clients;
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountNo='" + accountNo + '\'' +
                ", balance=" + balance +
                ", clients=" + clients +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return Objects.equals(accountNo, account.accountNo) && Objects.equals(balance, account.balance) && Objects.equals(clients, account.clients);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountNo, balance, clients);
    }
}
