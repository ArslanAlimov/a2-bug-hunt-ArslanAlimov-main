import edu.csc413.bugs.Beetle;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

public class BeetleTest {

Beetle testBeetle = new Beetle("TestBeetle");

@Test
    public void TestBeetleName(){ // to test our method get name from another class
    assertThat(testBeetle.getName(),equalTo("TestBeetle")); //testing Beetle Name
}
@Test
    public void FlyTest(){
    assertThat(testBeetle.canFly(), is(true));//check if canFly() gives us true
}
@Test
    public void SpecialTraitTest(){
    assertThat(testBeetle.specialTrait(),equalTo("strong")); //testing Beetle Name
}



}
