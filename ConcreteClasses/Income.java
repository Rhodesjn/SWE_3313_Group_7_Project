package ConcreteClasses;
import AbstractClasses.FinancialRecord;
import AbstractClasses.UserProfile;
import java.util.Date;
import java.util.UUID;
import java.util.Calendar;
public class Income extends FinancialRecord {

    public Income(double amount, Date date, UserProfile user) {
        super(amount, date, user);
    }
    @Override
    public double apply(double balance) {
        return balance + amount;
    }
}
