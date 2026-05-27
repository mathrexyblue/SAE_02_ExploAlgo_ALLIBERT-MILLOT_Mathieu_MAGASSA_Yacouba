import java.util.List;

public class BellmanFord {




    public Valeurs resoudre(Graphe g, String depart){
        int check=0;
        Valeurs v = new Valeurs();
        double calcul=0;
        for (String s:g.getNoeuds()){
            v.setValeur(s,Double.MAX_VALUE);
        }
        v.setValeur(depart,0);
        while(check<2){
            for (String s:g.getNoeuds()){
                for (Arc a:g.getAdjacents(s).getListe()){
                    if(v.getValeur(s)!=Double.MAX_VALUE){
                        calcul=v.getValeur(s)+a.getPoids();
                        if(calcul<v.getValeur(a.getNoeud())){
                            v.setValeur(a.getNoeud(),calcul);
                            v.setParent(a.getNoeud(),s);
                            check=0;
                        }
                    }
                }
            }
            check++;
        }
        return v;
    }
}
