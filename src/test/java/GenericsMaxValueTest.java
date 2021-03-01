import org.junit.Assert;
import org.junit.Test;


public class GenericsMaxValueTest {
    GenericsMaxValue findMax = new GenericsMaxValue();

    @Test
    public void givenFirstNumberAsMaxNumber_ShouldReturn_FirstNumberAsMax() {

        Integer maximum = findMax.testMaximumInteger(800, 70, 115);
        Assert.assertEquals((Integer) 800, maximum);
    }

    @Test
    public void givenSecondNumberAsMaXNumber_ShouldReturnSecondNumberAsMaximum() {
        Integer maximum1 = findMax.testMaximumInteger(5, 250, 112);
        Assert.assertEquals((Integer) 250, maximum1);
    }

    @Test
    public void givenThirdNumberAsMaXNumber_ShouldReturnThirdNumberAsMaximum() {
        Integer maximum2 = findMax.testMaximumInteger(109, 200, 999);
        Assert.assertEquals((Integer) 999, maximum2);
    }
}
