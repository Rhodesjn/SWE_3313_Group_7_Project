import java.util.Date;
import java.util.UUID;
import java.util.Calendar;
public class Income extends FinancialRecord {
    private double amount;

    public Income(double amount, Date date, String userId) {
        super(amount, date, userId);
        this.amount = amount;
    }
    @Override
    public double apply(double balance) {
        return balance + amount;
    }
}
