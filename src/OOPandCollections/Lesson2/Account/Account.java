package OOPandCollections.Lesson2.Account;

public class Account {

    private long balance;
    private String debit;
    private String firstName;
    private String lastName;

    public Account(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getBalance() {
        String balance = "" + this.balance;
        if (balance.length() > 3) {
            for (int i = balance.length() - 3; i > -1; i -= 3) {
                balance = balance.substring(0, i) + " " + balance.substring(i);
            }
        }
        return balance;
    }

    public void setBalance(long balance) {
        if (balance > 0) {
            this.balance = balance;
        }
    }

    public String getDebit() {
        return debit;
    }

    public void setDebit(String debit) {
        this.debit = debit;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }


}
