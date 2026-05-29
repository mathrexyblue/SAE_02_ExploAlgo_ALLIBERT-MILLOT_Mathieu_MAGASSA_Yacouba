import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestBellmanFord {

    private GrapheListe construireGraphe() {
        GrapheListe g = new GrapheListe();
        g.ajoutArc("A","B",12);
        g.ajoutArc("A","D",87);
        g.ajoutArc("B","E",11);
        g.ajoutArc("C","A",19);
        g.ajoutArc("D","B",23);
        g.ajoutArc("D","C",10);
        g.ajoutArc("E","D",43);
        return g;
    }

    @Test
    public void testBellmanFordSimple() {
        GrapheListe g = construireGraphe();
        BellmanFord bf = new BellmanFord();
        Valeurs v = bf.resoudre(g, "A");

        // Distances attendues
        assertEquals(0, v.getValeur("A"));
        assertEquals(12, v.getValeur("B"));
        assertEquals(23, v.getValeur("E"));   // A -> B -> E = 12 + 11
        assertEquals(66, v.getValeur("D"));   // A -> B -> E -> D = 12 + 11 + 43
        assertEquals(76, v.getValeur("C"));   // A -> B -> E -> D -> C = 66 + 10
    }

    @Test
    public void testBellmanFordParents() {
        GrapheListe g = construireGraphe();
        BellmanFord bf = new BellmanFord();
        Valeurs v = bf.resoudre(g, "A");

        assertEquals("A", v.getParent("B"));
        assertEquals("B", v.getParent("E"));
        assertEquals("E", v.getParent("D"));
        assertEquals("D", v.getParent("C"));
    }

    @Test
    public void testBellmanFordChemin() {
        GrapheListe g = construireGraphe();
        BellmanFord bf = new BellmanFord();
        Valeurs v = bf.resoudre(g, "A");

        // Chemin attendu vers C : A → B → E → D → C
        assertEquals(
                java.util.List.of("A", "B", "E", "D", "C"),
                v.calculerChemin("C")
        );
    }
}
