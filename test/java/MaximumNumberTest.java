import com.Generics.MaximumNumber;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class MaximumNumberTest {
    MaximumNumber maximumNumber;



    //uc1
    @Test
    public void givenMaximumIntegerNumber_AtFirstPosition_ShouldReturnSameNumber() {
        Integer max = MaximumNumber.checkMaximum(250, 200, 150,100,50);
        Assertions.assertEquals(250, max);
    }

    @Test
    public void givenMaximumIntegerNumber_AtSecondPosition_ShouldReturnSameNumber() {
        Integer max = MaximumNumber.checkMaximum(200, 250, 150,100,50);
        Assertions.assertEquals(250, max);
    }

    @Test
    public void givenMaximumIntegerNumber_AtThirdPosition_ShouldReturnSameNumber() {
        Integer max = MaximumNumber.checkMaximum(200, 150, 250,100,50);
        Assertions.assertEquals(250, max);
    }

    //uc2
    @Test
    public void givenMaximumFloatNumber_AtFirstPosition_ShouldReturnSameNumber() {
        Float result = maximumNumber.findMaximumNumber(60.2f, 20.2f, 40.2f);
        Assert.assertEquals(Float.valueOf(60.2f), result);
    }

    @Test
    public void givenMaximumFloatNumber_AtSecondNumber_ShouldReturnSameNumber() {
        Float result = maximumNumber.findMaximumNumber(20.f, 60.2f, 40.2f);
        Assert.assertEquals(Float.valueOf(60.2f), result);
    }

    @Test
    public void givenMaximumNumber_AtThirdNumber_ShouldReturnSameNumber() {
        Float result = maximumNumber.findMaximumNumber(40.2f, 20.2f, 60.2f);
        Assert.assertEquals(Float.valueOf(60.2f), result);
    }


    //UC3 string
    @Test
    public void givenStringValue_whenAtFirstPosition_ShouldReturnMaxString() {
        String result = maximumNumber.findMaximumString("Apple", "Peach", "Banana");
        Assert.assertEquals("Peach", result);
    }

    @Test
    public void giveStringValue_whenAtSecondPosition_ShouldReturnMaxString() {
        String result = maximumNumber.findMaximumString("Banana", "Apple", "Peach");
        Assert.assertEquals("Peach", result);
    }

    @Test
    public void givenStringValue_whenAtThirdPosition_ShouldReturnMaxString() {
        String result = maximumNumber.findMaximumString("Peach", "Banana", "Apple");
        Assert.assertEquals("Peach", result);
    }


}
