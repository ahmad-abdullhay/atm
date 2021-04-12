public class TransferTransaction extends Transaction {
    User secondUser;

    public TransferTransaction(int amount, User user, User secondUser) {
        super(amount, user);
        this.secondUser = secondUser;
    }

    @Override
    void doTransaction() {
        user.removeFromAccountBalance(amount);
        secondUser.addToAccountBalance(amount);
        user.addTransaction(this);
    }
}
