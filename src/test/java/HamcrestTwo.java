import org.hamcrest.BaseMatcher;
import org.hamcrest.Description;
import org.hamcrest.Matcher;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static org.hamcrest.core.Is.is;

/**
 * Created by ozakarias on 2/19/2018.
 */
public class HamcrestTwo {

    @Test
    public void exTwoPointOne() {
        final Employee employee = new Employee(10, "QA", "Junior");
//    a) The employee hasID "someId". E.g. assertThat(employee, hasId(3));
        assertThat(employee, hasId(10));
//    b) The employee hasPosition "someValue". E.g. assertThat(employee, hasPosition("Qa engineer"));
        assertThat(employee, hasPosition("QA"));
//    c) The employee hasSeniority "someValue". E.g. assertThat(employee, hasSeniority("Junior"));
        assertThat(employee, hasSeniority("Junior"));
//    d) The employee has all: hasId "someId", hasPosition "someValue", hasSeniority "someValue". E.g. assertThat(employee, all(hasId(3)).and(hasPosition("Qa engineer")).and(hasSeniority("Junior")));
        assertThat(employee, allOf(hasId(10), hasPosition("QA"), hasSeniority("Junior")));
    }

    @Test
    public void exTwoPointTwo() {
        Employee one = new Employee(5, "QA", "mid");
        Employee two = new Employee(6, "Dev", "junior");
        Employee three = new Employee(5, "QA", "mid");
        Employee four = new Employee(8, "QA Engineer", "junior");
        List<Employee> all = new ArrayList<Employee>();
        all.add(one);
        all.add(two);
        all.add(three);
        all.add(four);

        //    a) Employee has a property called “position”.
        assertThat(one, hasProperty("position"));
//            b) The seniority's value is equal to "Junior".
        assertThat(two, hasProperty("seniority", is("junior")));
        //    c) Two objects created with the same values, have the same property values.
        assertThat(one, samePropertyValuesAs(three));
        //    d) The seniority's value starts with "J".
        assertThat(two, hasProperty("seniority", startsWith("j")));
        //    e) At least one employee has the id greater than 1, position = "QA engineer" and the seniority ends with "or".
        assertThat(all, hasItem(allOf(hasIdGreaterThan(3), hasPosition("QA"), hasSeniority("mid"))));
    }


    //Matchers
    private Matcher<Employee> hasPosition(final String p) {
        return new BaseMatcher<Employee>() {
            @Override
            public boolean matches(final Object item) {
                final Employee employee = (Employee) item;
                return p == employee.getPosition();
            }

            @Override
            public void describeTo(final Description description) {
                description.appendText("getPosition should return: ").appendText(p);
            }
        };
    }

    private Matcher<Employee> hasId(final int i) {
        return new BaseMatcher<Employee>() {
            @Override
            public boolean matches(final Object item) {
                final Employee employee = (Employee) item;
                return i == employee.getId();
            }

            @Override
            public void describeTo(final Description description) {
                description.appendText("getId should return: ").appendValue(i);
            }
        };
    }

    private Matcher<Employee> hasSeniority(final String s) {
        return new BaseMatcher<Employee>() {
            @Override
            public boolean matches(final Object item) {
                final Employee employee = (Employee) item;
                return s == employee.getSeniority();
            }

            @Override
            public void describeTo(final Description description) {
                description.appendText("getSeniority should return: ").appendText(s);
            }
        };
    }

    private Matcher<Employee> hasIdGreaterThan(final int i) {
        return new BaseMatcher<Employee>() {
            @Override
            public boolean matches(final Object item) {
                final Employee employee = (Employee) item;
                return employee.getId() > i;
            }

            @Override
            public void describeTo(final Description description) {
                description.appendText("getId should return: ").appendValue(i);
            }
        };
    }



}
