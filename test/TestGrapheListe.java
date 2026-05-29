import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestGrapheListe {

    @Test
    public void testAjoutPremierArcCreeNoeud() {
        GrapheListe g = new GrapheListe();
        g.ajoutArc("A", "B", 1.5);

        assertEquals(1, g.getNoeuds().size());
        assertEquals("A", g.getNoeuds().get(0));
        assertTrue(g.getAdjacents("A").contient("B"));
    }

    @Test
    public void testAjoutArcSurNoeudExistant() {
        GrapheListe g = new GrapheListe();
        g.ajoutArc("A", "B", 1.0);
        g.ajoutArc("A", "C", 2.0);

        assertEquals(1, g.getNoeuds().size());
        assertEquals(2, g.getAdjacents("A").getListe().size());
    }

    @Test
    public void testToString() {
        GrapheListe g = new GrapheListe();
        g.ajoutArc("A", "B", 1.0);
        g.ajoutArc("A", "C", 2.0);

        String expected = "A -> B(1.0) C(2.0) \n";
        assertEquals(expected, g.toString());
    }
}
