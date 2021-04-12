public class DepositTransaction extends Transaction {
    public DepositTransaction(int amount, User user) {
        super(amount, user);
    }

    @Override
    void doTransaction() {
        user.addToAccountBalance(amount);
        user.addTransaction(this);
    }
}
