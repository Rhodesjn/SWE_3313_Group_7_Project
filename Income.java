import java.util.Date;

public class Income extends FinancialRecord {
    public Income(double amount, Date date, String userId) {
        super(amount, date, userId);
    }
}

@Override double apply(double balance) {
    return balance + Amount();
}