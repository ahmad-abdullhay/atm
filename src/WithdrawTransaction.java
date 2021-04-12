public class WithdrawTransaction  extends Transaction{

    public WithdrawTransaction(int amount, User user) {
        super(amount, user);
    }

    @Override
    void doTransaction() {
        user.removeFromAccountBalance(amount);
        user.addTransaction(this);
    }
}
