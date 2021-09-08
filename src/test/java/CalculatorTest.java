import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    @Test
    public void testAdd() {
        //GIVE
        int a = 1;
        int b = 2;

        //WHEN
        int result = Calculator.add(a, b);

        //THEN
        Assertions.assertEquals(3, result);
    }

    @Test
    public void testSubtract() {
        //GIVE
        int a = 1;
        int b = 2;

        //WHEN
        int result2 = Calculator.subtract(a, b);

        //THEN
        Assertions.assertEquals(-1, result2);
    }

    @Test
    public void testStringLength() {
        //GIVE
        String s = "Hallo Hallo";

        //WHEN
        boolean lengthOverTwenty = Calculator.stringLength(s);

        //THEN
        Assertions.assertFalse(lengthOverTwenty);
    }

    @Test
    public void testStringContains() {
        //GIVE
        String s = "Hallo, das ist fancy";

        //WHEN
        boolean includesFancy = Calculator.containsFancy(s);

        //THEN
        Assertions.assertTrue(includesFancy);
    }
}
