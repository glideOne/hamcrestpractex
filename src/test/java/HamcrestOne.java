import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.everyItem;
import static org.hamcrest.Matchers.greaterThan;

/**
 * Created by ozakarias on 2/19/2018.
 */
public class HamcrestOne {

    //1. How would you write an assert using a hamcrest matcher to check that a list of integers has every item greater than someNumber?
    @Test
    public void exOne() {
        List<Integer> listOfIntegers = new ArrayList<Integer>();
        listOfIntegers.add(10);
        listOfIntegers.add(7);
        listOfIntegers.add(15);
        listOfIntegers.add(20);

        assertThat(listOfIntegers, everyItem(greaterThan(5)));
    }


}
