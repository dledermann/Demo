import static org.junit.Assert.*;
import org.junit.*;

public class DemoTest {
    @Test
    public void subtractTest(){
        assertEquals(4, Demo.subtract(2, 2));
    }
}
