// 5. Goal: tracking a target amount by a due date
public abstract class Goal extends BaseEntity {
    protected double target;
    protected Date   dueDate;
    protected String userId;

    public Goal(double target, Date dueDate, String userId) {
        super();
        this.target  = target;
        this.dueDate = dueDate;
        this.userId  = userId;
    }

    public double getTarget() { return target;  }
    public Date   getDue()    { return dueDate; }
    public String getUser()   { return userId;  }

    // e.g. 50.0 means 50% of target reached
    public double progress(double current) {
        return (current / target) * 100;
    }
}


