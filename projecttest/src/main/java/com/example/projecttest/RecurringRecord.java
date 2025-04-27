package com.example.projecttest;
import java.util.Date;
import java.util.UUID;
import java.util.Calendar;
public abstract class RecurringRecord extends FinancialRecord {
    protected int intervalDays;  // e.g. 7 for weekly, 30 for monthly

    public RecurringRecord(
        double amount, Date startDate,
        String userId, int intervalDays
    ) {
        super(amount, startDate, userId);
        this.intervalDays = intervalDays;
    }

    public int getInterval() { return intervalDays; }

    // Compute next date after 'after'
    public Date nextDate(Date after) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        while (!cal.getTime().after(after)) {
            cal.add(Calendar.DATE, intervalDays);
        }
        return cal.getTime();
    }
}
