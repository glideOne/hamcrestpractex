import org.hamcrest.Matcher;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static org.hamcrest.core.Is.is;

/**
 * Created by ozakarias on 2/19/2018.
 */
public class HamcrestTwo {

//    Write tests using your own custom matchers that ensures that:
//    a) The employee hasID "someId". E.g. assertThat(employee, hasId(3));
//    b) The employee hasPosition "someValue". E.g. assertThat(employee, hasPosition("Qa engineer"));
//    c) The employee hasSeniority "someValue". E.g. assertThat(employee, hasSeniority("Junior"));
//    d) The employee has all: hasId "someId", hasPosition "someValue", hasSeniority "someValue". E.g. assertThat(employee, all(hasId(3)).and(hasPosition("Qa engineer")).and(hasSeniority("Junior")));
//
//    Write tests that ensure that:

    @Test
    public void exTwo() {
        Employee one = new Employee(1, "QA", "mid");
        Employee two = new Employee(2, "Dev", "junior");
        Employee three = new Employee(1, "QA", "mid");
        Employee four = new Employee(3, "QA Engineer", "junior");
        List<Employee> all = new ArrayList<Employee>();
        all.add(one);
        all.add(two);
        all.add(three);
        all.add(four);

        //    a) Employee has a property called “position”.
        assertThat(one, hasProperty("position"));
        //    b) The seniority's value is equal to "Junior".
        assertThat(two, hasProperty("seniority", is("junior")));
        //    c) Two objects created with the same values, have the same property values.
        assertThat(one, samePropertyValuesAs(three));
        //    d) The seniority's value starts with "J".
        assertThat(two, hasProperty("seniority", startsWith("j")));
        //    e) At least one employee has the id greather than 1, position = "QA engineer" and the seniority ends with "or".
        List<org.hamcrest.Matcher<? super Employee>> matchers = new ArrayList<>();

    }



}
