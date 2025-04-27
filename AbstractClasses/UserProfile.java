package AbstractClasses;
// package AbstractClasses;
import java.util.Date;
import java.util.List;
import java.util.UUID;
import java.util.ArrayList;
import java.util.Calendar;
// 4. UserProfile: shared user settings & info
public abstract class UserProfile extends BaseEntity {
    protected String name;
    protected String email;
    protected String currency;

    // Associations: a user may have several financial records and goals
    protected List<FinancialRecord> records = new ArrayList<>();
    protected List<Goal> goals = new ArrayList<>();

    public UserProfile(String name, String email, String currency) {
        super();
        this.name     = name;
        this.email    = email;
        this.currency = currency;
    }

    public String getName()     { return name;     }
    public String getEmail()    { return email;    }
    public String getCurrency() { return currency; }

    public List<FinancialRecord> getRecords(){return records; }
    public List<Goal> getGoals() { return goals;}

    public void addRecord(FinancialRecord record) {
        records.add(record);
    }
    public void addGoal(Goal goal){
        goals.add(goal);
    }

    // e.g. check email format, name non-empty
    public abstract boolean validate();
}
