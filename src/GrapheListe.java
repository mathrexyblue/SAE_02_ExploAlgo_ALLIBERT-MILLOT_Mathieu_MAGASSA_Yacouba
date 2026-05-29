import java.util.ArrayList;

/**
 * Implémentation d'un graphe orienté pondéré sous forme de listes d'adjacence.
 */
public class GrapheListe implements Graphe{

    private ArrayList<String> noeuds=new ArrayList<>();
    private ArrayList<Arcs> arcs=new ArrayList<>();

    /**
     * Retourne la liste des arcs sortants d'un nœud donné.
     *
     * @param noeud nom du nœud
     * @return liste des arcs sortants
     */
    @Override
    public Arcs getAdjacents(String noeud) {
        return this.arcs.get(this.noeuds.indexOf(noeud));
    }

    /**
     * Retourne la liste des nœuds du graphe.
     *
     * @return liste des nœuds
     */
    @Override
    public ArrayList<String> getNoeuds() {
        return this.noeuds;
    }

    /**
     * Ajoute un arc orienté au graphe.
     * Si le nœud source n'existe pas, il est créé.
     *
     * @param source nœud de départ
     * @param destination nœud d'arrivée
     * @param poids poids de l'arc
     */
    public void ajoutArc(String source, String destination, double poids){
        if (!this.noeuds.contains(source)){
            this.noeuds.add(source);
            Arcs ar=new Arcs();
            ar.ajout(new Arc(destination,poids));
            this.arcs.add(ar);
        }else{
            this.getAdjacents(source).ajout(new Arc(destination,poids));
        }
    }

    /**
     * Retourne une représentation textuelle du graphe.
     *
     * @return chaîne listant chaque nœud et ses arcs sortants
     */
    public String toString(){
        String rep="";
        for (int i=0;i<this.noeuds.size();i++){
            rep+=this.noeuds.get(i)+" -> ";
            for (Arc arc:this.getAdjacents(this.noeuds.get(i)).getListe()){
                rep+=arc;
            }
            rep+="\n";
        }
        return rep;
    }
}
