import java.util.List;

public class BellmanFord {




    public Valeurs resoudre(Graphe g, String depart){
        boolean check=false;
        Valeurs v = new Valeurs();
        double calcul=0;
        for (String s:g.getNoeuds()){
            v.setValeur(s,Double.MAX_VALUE);
        }
        v.setValeur(depart,0);
        while(!check){
            for (String s:g.getNoeuds()){
                for (Arc a:g.getAdjacents(s).getListe()){
                    calcul=v.getValeur(a.getNoeud())+a.getPoids();
                    if(calcul<v.getValeur(a.getNoeud())){
                        v.setValeur(a.getNoeud(),calcul);
                        v.setParent(s,a.getNoeud());
                        check=true;
                    }
                }
            }
        }
        return v;
    }
}
