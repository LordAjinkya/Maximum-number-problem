import com.Generics.Maximumnum;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class Maxnumtest {
    Maximumnum maximumNumber;

    @Before
    public void setUp() throws Exception {
        maximumNumber = new Maximumnum();
    }
    //UC1 Integer

    @Test
    public void givenMaximumIntegerNumber_AtFirstPosition_ShouldReturnSameNumber() {
        Assert.assertSame(100, maximumNumber.findMax(100, 70, 30));
    }

    @Test
    public void givenMaximumNumber_AtSecondPosition_ShouldReturnSameNumber() {
        Assert.assertSame(50, maximumNumber.findMax(20, 50, 10));
    }

    @Test
    public void givenMaximumNumber_AtThirdPosition_ShouldReturnSameNumber() {
        Assert.assertSame(80, maximumNumber.findMax(50, 30, 80));
    }

    //UC2 float
    @Test
    public void givenMaximumFloatNumber_whenAtFirstPosition_shouldReturnSameNumber() {
        Float result = maximumNumber.findMaximumNumber(60.2f, 20.2f, 40.2f);
        Assert.assertEquals(Float.valueOf(60.2f), result);
    }

    @Test
    public void givenMaximumFloatNumber_whenAtSecondNumber_shouldReturnSameNumber() {
        Float result = maximumNumber.findMaximumNumber(20.f, 60.2f, 40.2f);
        Assert.assertEquals(Float.valueOf(60.2f), result);
    }

    @Test
    public void givenMaximumNumber_whenAtThirdNumber_shouldReturnSameNumber() {
        Float result = maximumNumber.findMaximumNumber(40.2f, 20.2f, 60.2f);
        Assert.assertEquals(Float.valueOf(60.2f), result);
    }
}
