import edu.csc413.bugs.Wasp;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

public class WaspTest {
    Wasp wasp = new Wasp("TestWasp");
    @Test
    public void canFlyTest(){
        assertThat(wasp.canFly(), is(true));//check if canFly() gives us true because wasps can fly
    }
    @Test
    public  void SpecialTraitTest(){//testing if our special trait is mean and not nice!
        assertThat(wasp.specialTrait(),equalTo("mean"));
    }
}
