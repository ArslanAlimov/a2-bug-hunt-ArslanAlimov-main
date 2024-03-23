import edu.csc413.bugs.Terrarium;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
public class TerrariumTest {

public Terrarium TestTerrarium;
public TerrariumTest(){
    TestTerrarium = new Terrarium();
    TestTerrarium.setUpBugs();    // sets up terrarium with 3bugs
}
    @Test
    public void GetNumTest(){
        assertThat(TestTerrarium.getNumBugs(),equalTo(3)); // testing if the bugs were added to our TestTerrarium
    }

    @Test
    //Test if out of index
    public  void getFirstBug(){
        assertThat(TestTerrarium.getBug(0).getName(),equalTo("Juice"));
    }
    @Test
    //Test if out of index
    public void GetSecondBugTest(){
        assertThat(TestTerrarium.getBug(1).getName(),equalTo("Charlotte"));
    }
    @Test
    //Test if out of index
    public void GetThirdBug(){
        assertThat(TestTerrarium.getBug(2).getName(),equalTo("Boris"));
    }
    @Test
    public void getBugWithNameTest(){
        assertThat(TestTerrarium.getBugWithName("Juice"),is(TestTerrarium.getBug(0)));
        assertThat(TestTerrarium.getBugWithName("Charlotte"),is(TestTerrarium.getBug(1)));
        assertThat(TestTerrarium.getBugWithName("Boris"),is(TestTerrarium.getBug(2)));
    }
    @Test
    //test that it gives us some sort of bug with 8,6 legs
    public void getBugWithLegsTest(){
        Assertions.assertNotNull(TestTerrarium.getBugsWithLegs(8));
        Assertions.assertNotNull(TestTerrarium.getBugsWithLegs(6));
    }



}
