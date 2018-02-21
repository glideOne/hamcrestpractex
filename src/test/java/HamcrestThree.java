import java.util.HashMap;
import java.util.Map;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

import org.hamcrest.BaseMatcher;
import org.hamcrest.Description;
import org.hamcrest.Matcher;
import org.hamcrest.Matchers;
import org.testng.annotations.Test;

/**
 * Created by zed on 2/20/2018.
 */
public class HamcrestThree {


    @Test
    public void exThreePointOne() {

        //3. How would you write an assert using hamcrest matcher to check that a given map contains an entry which matches the specified key and value?
        Map<String, String> someMap = new HashMap<String, String>()
        {
            {
                put("key1", "value1");
                put("key2", "value2");
            }
        };

        assertThat(someMap, hasEntry("key1", "value1"));

    }

    @Test
    public void exFour() {
        //4. How would you write an assert using hamcrest matcher to check that a given map contains an entry with the key greater than someNumber and the value ends with "o"?
        Map<Integer, String> mapTwo = new HashMap<Integer, String>()
        {
            {
                put(10, "value1");
                put(12, "value2o");
            }
        };

        assertThat(mapTwo, hasEntry(greaterThan(8), endsWith("o")));

    }

    @Test
    public void exFive() {
        //5. How would you write an assert using hamcrest matcher to check that a given map has at least one key which matches the specified value?
        Map<Integer, String> mapThree = new HashMap<Integer, String>()
        {
            {
                put(10, "value1");
                put(12, "value2o");
                put(15, "valueEverything");
            }
        };

        assertThat(mapThree, hasValue("valueEverything"));

    }

    @Test
    public void exSix() {
        //6. How would you write an assert using hamcrest matcher to check that a given map has at least one key which starts with someText?
        Map<String, String> mapThree = new HashMap<String, String>()
        {
            {
                put("key1", "value1");
                put("key2", "value2o");
                put("key3", "value");
            }
        };

        assertThat(mapThree, hasKey(startsWith("ke")));

    }

    @Test
    public void exSeven() {
    //7. How would you write an assert using hamcrest matcher to check that a number matches the specified String value? E.g 4 matches "4".
        Integer i = 5;
        assertThat(i, hasToString("5"));
    }

    @Test public void exEight() {
        //8. How would you write an assert using hamcrest matcher to check that a double number contains some string value? E.g 3.14 contains "." or 3.14 contains "1"
        double d = 3.14;
        String dee = String.valueOf(d);
        String s = ".";
//        assertThat();

    }

    @Test public void exNine() {
        //9. How would you write a custom matches to check that a number is even? E.g. assertThat(5, isEven());
        assertThat(10, isEven());

    }

    @Test public void exTen() {
        //10. How would you write a custom matches to check that a number is divisible by a given number? E.g. assertThat(15, is(divisibleBy(3)));
        assertThat(15, is(divisibleBy(3)));
    }

    //9. isEven
    private Matcher<Integer> isEven() {
        return new BaseMatcher<Integer>() {
            @Override
            public boolean matches(final Object o) {
                final Integer nr = (Integer) o;
                return (nr % 2) == 0;
            }

            @Override
            public void describeTo(final Description description) {
                description.appendText("Even number.");
            }
        };
    }

    //10.
    private Matcher<Integer> divisibleBy(final int i) {
        return new BaseMatcher<Integer>() {
            @Override
            public boolean matches(final Object o) {
                final Integer nr = (Integer) o;
                return (nr % i) == 0;
            }

            @Override
            public void describeTo(final Description description) {
                description.appendText("A number divisible by: ").appendValue(i);
            }
        };
    }

}
