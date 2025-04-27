
import java.util.Date;
import java.util.UUID;
import java.util.Calendar;

// 1. BaseEntity: all entities share an ID and timestamps
public abstract class BaseEntity {
    protected String id;
    protected Date created;
    protected Date updated;

    public BaseEntity() {
        this.id      = UUID.randomUUID().toString();
        this.created = new Date();
        this.updated = this.created;
    }

    public String getId()       { return id; }
    public Date   getCreated()  { return created; }
    public Date   getUpdated()  { return updated; }

    public void touch() {
        this.updated = new Date();
    }
}
