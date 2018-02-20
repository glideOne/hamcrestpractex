import lombok.Getter;
import lombok.Setter;

/**
 * Created by ozakarias on 2/19/2018.
 */
public class Employee {

    private final int id;
    private String position;
    private String seniority;

    public Employee(int id, String position, String seniority) {
        this.id = id;
        this.position = position;
        this.seniority = seniority;
    }

    public String getPosition() {
        return position;
    }

    public String getSeniority() {
        return seniority;
    }

    public int getId() {
        return id;
    }

}
