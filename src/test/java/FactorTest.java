import org.testng.annotations.Test;

import static org.testng.Assert.*;

@Test(description = "Check expected, actual")
public class FactorTest {


    public void testFaktorial() {
    Factor factor = new Factor();
    int actual = factor.faktorial(7);
    int expected = 5040;
    assertEquals(expected, actual);

    }
}