import edu.csc413.bugs.Bug;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

public class BugTest {
    private ArrayList<Bug> TestingBugs;

    Bug bug = new Bug("Testing",10) { //our testing Bug
        @Override
        public String specialTrait() {
            return "Test";
        }
    };

    public BugTest(){
        TestingBugs= new ArrayList<>();
    }

    @Test
    public void LegsAmount(){
        assertThat(bug.getNumLegs(),equalTo(10));//testing case for amount of legs
    }
    @Test
    public void NameTest(){
        assertThat(bug.getName(),equalTo("Testing")); // testing bugs name
    }
    @Test
    public void FlyTest(){
        assertThat(bug.canFly(), is(false));//check if canFly() gives us false
    }
    @Test
    public void SpecialTraitTest(){
        assertThat(bug.specialTrait(),equalTo("Test"));
    }


}
