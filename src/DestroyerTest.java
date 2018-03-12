import org.junit.Assert;
import org.junit.Test;

public class DestroyerTest {
    @Test
    public void createDestroyerTest() {
        Destroyer des = new Destroyer();
        Assert.assertEquals(des.getSize(), 5);
    }

}