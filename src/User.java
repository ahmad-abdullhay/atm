import java.util.LinkedList;

public class User {
   private String userID;
   private String userPin;
   private int accountBalance;
   private LinkedList<Transaction> transactionsHistoryList;
    void addToAccountBalance (int amount){
        accountBalance+=amount;
    }
    void removeFromAccountBalance (int amount){
        accountBalance-=amount;
    }
    void addTransaction (Transaction transaction){
        transactionsHistoryList.add(transaction);
    }
}
