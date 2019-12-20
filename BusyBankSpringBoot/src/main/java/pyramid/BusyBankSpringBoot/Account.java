package pyramid.BusyBankSpringBoot;

public class Account {

    private int id;
    private String accountType;
    private float balance;

    public Account(int id, String accountType, float balance) {
        this.id = id;
        this.accountType = accountType;
        this.balance = balance;
    }

    public Account() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }
}
