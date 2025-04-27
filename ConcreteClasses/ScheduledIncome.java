package ConcreteClasses;
import AbstractClasses.RecurringRecord;
import java.util.Date; 
import AbstractClasses.UserProfile;
// this class is used to represent a scheduled income in the system. It extends the RecurringRecord class.
public class ScheduledIncome extends RecurringRecord {
    public ScheduledIncome(double amount, Date startDate, int intervalDays, UserProfile userId) {
        super(amount, startDate, intervalDays, userId);
    }

    @Override
    public double apply(double balance) {
        return balance + amount;
    }
}
