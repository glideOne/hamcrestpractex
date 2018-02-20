import java.util.HashMap;
import java.util.Map;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
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

}
