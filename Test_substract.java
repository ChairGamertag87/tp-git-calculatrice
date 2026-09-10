import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class Test_substract {

    @Test
    public void testSub() {
        substact s = new substact();

        assertEquals(2, s.sub(5, 3));
        assertEquals(-2, s.sub(3, 5));
        assertEquals(0, s.sub(5, 5));
    }
}
