import java.util.ArrayList;

/**
 * Représente une liste d'arcs sortants pour un nœud donné.
 */
public class Arcs {
    private ArrayList<Arc> arcs=new ArrayList<>();

    /**
     * Ajoute un arc à la liste s'il n'est pas nul.
     *
     * @param arc arc à ajouter
     */
    public void ajout(Arc arc){
        if (arc!=null){
            this.arcs.add(arc);
        }
    }

    /**
     * Retourne la liste des arcs.
     *
     * @return liste des arcs
     */
    public ArrayList<Arc> getListe(){
        return this.arcs;
    }

    /**
     * Vérifie si un arc vers un nœud donné existe.
     *
     * @param noeud nom du nœud recherché
     * @return true si un arc mène à ce nœud
     */
    public boolean contient(String noeud){
        for (Arc arc:this.arcs){
            if (arc.getNoeud().equals(noeud)){
                return true;
            }
        }
        return false;
    }
}
