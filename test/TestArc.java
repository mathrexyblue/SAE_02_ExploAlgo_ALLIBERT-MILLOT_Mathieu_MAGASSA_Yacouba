import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestArc {

    @Test
    public void testCreationArc() {
        Arc a = new Arc("B", 3.5);
        assertEquals("B", a.getNoeud());
        assertEquals(3.5, a.getPoids());
    }

    @Test
    public void testToString() {
        Arc a = new Arc("C", 2.0);
        assertEquals("C(2.0) ", a.toString());
    }
}
