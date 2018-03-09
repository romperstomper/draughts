import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class DestroyerTest {
    @Test
    public void createDestroyerWithCorrectAttributes() {
        Destroyer testdes = new Destroyer();

        Assert.assertEquals(testdes.hits, 5);
    }
}