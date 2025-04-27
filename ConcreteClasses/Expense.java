package ConcreteClasses;
import java.util.Date;
import AbstractClasses.FinancialRecord;
import AbstractClasses.UserProfile;

public class Expense extends FinancialRecord {
    public Expense(double amount, Date date, UserProfile userId) {
        super(amount, date, userId);
    }

    @Override
    public double apply(double balance) {
        return balance - amount;
    }
}
