import org.junit.Assert;
import org.junit.Test;

public class CarrierTest {
    @Test
    public void createCarrierTest() {
        Carrier car = new Carrier();
        Assert.assertEquals(car.getSize(), 7);
    }
}
