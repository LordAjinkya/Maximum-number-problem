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
}
