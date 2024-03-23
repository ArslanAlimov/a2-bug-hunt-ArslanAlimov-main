import edu.csc413.bugs.Spider;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class SpiderTest {
    Spider spiderTest = new Spider("Test");
    @Test
    public void spiderLegs(){
        assertThat(spiderTest.getNumLegs(),equalTo(8));
    }
    @Test
    public void SpecialTrait(){
        assertThat(spiderTest.specialTrait(),equalTo("webs"));
    }
    @Test
    public void getName(){
        assertThat(spiderTest.getName(),equalTo("Test"));
    }

}
