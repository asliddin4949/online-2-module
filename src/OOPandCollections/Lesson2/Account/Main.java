package OOPandCollections.Lesson2.Account;

public class Main {
    public static void main(String[] args) {
        Account muminov = new Account("Asliddin","Muminov");
        muminov.setDebit("8600312974529170");
        muminov.setBalance(3_333_333_450_000l);
        System.out.println(muminov.getFirstName()+" "+muminov.getLastName());
        System.out.println("Debit: "+muminov.getDebit());
        System.out.println("Balance: "+muminov.getBalance()+" sums");
        muminov.setBalance(2453450);
        System.out.println("Balance: "+muminov.getBalance()+" sums");
    }
}
