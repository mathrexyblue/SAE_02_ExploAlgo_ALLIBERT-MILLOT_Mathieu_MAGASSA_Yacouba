/**
 * Représente un arc sortant dans un graphe orienté, avec un poids et un nœud cible.
 */
public class Arc {
    private double poids;
    private String noeud;

    /**
     * Construit un arc vers un nœud cible avec un poids donné.
     *
     * @param cible nom du nœud destination
     * @param poid poids de l'arc
     */
    public Arc(String cible,double poid){
        this.noeud=cible;
        this.poids=poid;
    }

    /**
     * Retourne une représentation textuelle de l’arc.
     *
     * @return chaîne sous la forme "noeud(poids)"
     */
    public String toString(){
        return noeud+"("+poids+") ";
    }

    /**
     * Retourne le poids de l’arc.
     *
     * @return poids
     */
    public double getPoids(){
        return poids;
    }

    /**
     * Retourne le nœud destination.
     *
     * @return nom du nœud
     */
    public String getNoeud(){
        return noeud;
    }
}
