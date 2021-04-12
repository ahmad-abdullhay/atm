abstract public class Transaction {
int amount;
User user;

    public Transaction(int amount, User user) {
        this.amount = amount;
        this.user = user;
    }

    abstract void doTransaction ();

}
