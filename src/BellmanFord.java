import java.util.List;
/**
 * Implémentation de l'algorithme de Bellman-Ford permettant de calculer
 * les plus courts chemins depuis un nœud source dans un graphe orienté pondéré.
 */
public class BellmanFord {



    /**
     * Applique l'algorithme de Bellman-Ford sur un graphe donné.
     *
     * @param g      graphe sur lequel effectuer le calcul
     * @param depart nœud source à partir duquel calculer les distances
     * @return un objet Valeurs
     */
    public Valeurs resoudre(Graphe g, String depart){
        int check=0;
        Valeurs v = new Valeurs();
        double calcul=0;
        for (String s:g.getNoeuds()){
            v.setValeur(s,Double.MAX_VALUE);
        }
        v.setValeur(depart,0);
        for (int i=0;i<g.getNoeuds().size()-1;i++){
            for (String s:g.getNoeuds()){
                for (Arc a:g.getAdjacents(s).getListe()){
                    if(v.getValeur(s)!=Double.MAX_VALUE){
                        calcul=v.getValeur(s)+a.getPoids();
                        if(calcul<v.getValeur(a.getNoeud())){
                            v.setValeur(a.getNoeud(),calcul);
                            v.setParent(a.getNoeud(),s);
                        }
                    }
                }
            }
        }
        return v;
    }
}
