import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestArcs {

    @Test
    public void testAjoutArc() {
        Arcs arcs = new Arcs();
        Arc a = new Arc("B", 1.0);
        arcs.ajout(a);

        assertEquals(1, arcs.getListe().size());
        assertTrue(arcs.contient("B"));
    }

    @Test
    public void testContientFalse() {
        Arcs arcs = new Arcs();
        arcs.ajout(new Arc("C", 2.0));

        assertFalse(arcs.contient("A"));
    }
}
