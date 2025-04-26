import java.util.Date;
import java.util.UUID;
import java.util.Calendar;
public abstract class FinancialRecord extends BaseEntity {
    protected double amount;
    protected Date   date;
    protected String userId;

    public FinancialRecord(double amount, Date date, String userId) {
        super();
        this.amount = amount;
        this.date   = date;
        this.userId = userId;
    }

    public double getAmount() { return amount; }
    public Date   getDate()   { return date;   }
    public String getUserId() { return userId; }

    // e.g. Income adds, Expense subtracts
    public abstract double apply(double balance);
}