
import java.util.Date;
import java.util.UUID;
import java.util.Calendar;
public abstract class FinancialRecord extends BaseEntity {
    protected double amount;
    protected Date   date;
    protected int userId = 1000;
    protected UserProfile user;

    public FinancialRecord(double amount, Date date, UserProfile user) {
        super();
        this.amount = amount;
        this.date   = date;
        this.user = user;
    }

    public double getAmount() { return amount; }
    public Date   getDate()   { return date;   }
    public UserProfile getUser() { return user; }

    // e.g. Income adds, Expense subtracts
    public abstract double apply(double balance);
}
