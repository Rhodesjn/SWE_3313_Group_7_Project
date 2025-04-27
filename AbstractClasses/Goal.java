
// 5. Goal: tracking a target amount by a due date
import java.util.Date;
import java.util.UUID;
import java.util.Calendar;
public abstract class Goal extends BaseEntity {
    protected double target;
    protected Date dueDate;
    protected UserProfile user;

    public Goal(double target, Date dueDate, UserProfile user) {
        super();
        this.target  = target;
        this.dueDate = dueDate;
        this.user  = user;
    }

    public double getTarget() { return target;  }
    public Date   getDue()    { return dueDate; }
    public UserProfile getUser()   { return user;  }

    // e.g. 50.0 means 50% of target reached
    public double progress(double current) {
        return (current / target) * 100;
    }
}


