import org.junit.Assert;
import org.junit.Test;

public class FrigateTest {
    @Test
    public void createFrigateTest() {
        Frigate frig = new Frigate();
        Assert.assertEquals(frig.getSize(), 3);
    }
}