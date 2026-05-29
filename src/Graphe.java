import java.util.ArrayList;

/**
 * Interface représentant un graphe orienté pondéré.
 */
public interface Graphe {

    /**
     * Retourne la liste des nœuds du graphe.
     *
     * @return une liste contenant les noms des nœuds
     */
    ArrayList<String> getNoeuds();

    /**
     * Retourne la liste des arcs sortants d'un nœud donné.
     *
     * @param noeud nom du nœud dont on veut obtenir les arcs sortants
     * @return un objet {@link Arcs} contenant les arcs sortants du nœud
     */
    Arcs getAdjacents(String noeud);
}
