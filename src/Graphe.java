import java.util.ArrayList;

public interface Graphe {
    ArrayList<String> noeuds=new ArrayList<>();
    Arcs arcs=new Arcs();

    public ArrayList<String> getNoeuds();

    public Arcs getAdjacents(String noeud);

}
