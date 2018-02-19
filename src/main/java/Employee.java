import lombok.Getter;
import lombok.Setter;

/**
 * Created by ozakarias on 2/19/2018.
 */
@Getter
@Setter
public class Employee {

    private final long id;
    private String position;
    private String seniority;

    public Employee(long id, String position, String seniority) {
        this.id = id;
        this.position = position;
        this.seniority = seniority;
    }

}
