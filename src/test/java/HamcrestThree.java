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
    public void exThree() {

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

}
