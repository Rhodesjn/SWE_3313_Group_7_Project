import java.util.Date;
import java.util.UUID;
import java.util.Calendar;
// 4. UserProfile: shared user settings & info
public abstract class UserProfile extends BaseEntity {
    protected String name;
    protected String email;
    protected String currency;

    public UserProfile(String name, String email, String currency) {
        super();
        this.name     = name;
        this.email    = email;
        this.currency = currency;
    }

    public String getName()     { return name;     }
    public String getEmail()    { return email;    }
    public String getCurrency() { return currency; }

    // e.g. check email format, name non-empty
    public abstract boolean validate();
}
