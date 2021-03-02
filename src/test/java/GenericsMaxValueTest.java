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
    @Test
    public void givenFirstFloatAsMaxNumber_ShouldReturnFirstFloatAsMaximum() {
        Double max1 = findMax.testMaximumDouble(50.00, 5.00, 10.00);
        Assert.assertEquals((Double) 50.00, max1);
    }

    @Test
    public void givenSecondFloatAsMaxNumber_ShouldReturnSecondFloatAsMaximum() {
        Double max1 = findMax.testMaximumDouble(10.00, 30.00, 20.00);
        Assert.assertEquals((Double) 30.00, max1);
    }
    @Test
    public void givenThirdFloatAsMaxNumber_ShouldReturnThirdFloatAsMaximum() {
        Double max1 = findMax.testMaximumDouble(7.00, 23.00, 40.00);
        Assert.assertEquals((Double) 40.00, max1);
    }
    @Test
    public void givenFirstLetterAsMaximum_ShouldReturnFirstLetterAsMaximum() {
        String max2 = findMax.testMaximumString("dattatraya", "parag", "p");
        Assert.assertEquals((String) "dattatraya", max2);
    }

    @Test
    public void givenSecondLetterAsMaximum_ShouldReturnSecondLetterAsMaximum() {
        String max2 = findMax.testMaximumString("parag", "dattatraya", "p");
        Assert.assertEquals((String) "dattatraya", max2);
    }

    @Test
    public void givenThirdLetterAsMaximum_ShouldReturnThirdLetterAsMaximum() {
        String max2 = findMax.testMaximumString("p", "parag", "dattatraya");
        Assert.assertEquals((String) "dattatraya", max2);
    }


}
