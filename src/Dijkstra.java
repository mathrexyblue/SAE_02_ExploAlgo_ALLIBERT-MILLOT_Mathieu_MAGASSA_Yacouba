import java.util.ArrayList;

public class Dijkstra {


    public Valeurs resoudre(Graphe g, String depart){
        ArrayList<String> nonvisite=new ArrayList<>();
        Valeurs v=new Valeurs();
        for (String s:g.getNoeuds()){
            v.setValeur(s,Double.MAX_VALUE);
            nonvisite.add(s);
        }
        double calcul=0;
        v.setValeur(depart,0);
        String actuelle="";
        while(!nonvisite.isEmpty()){
            double min=Double.MAX_VALUE;
            for(String s:nonvisite){
                if(v.getValeur(s) <= min){
                    min=v.getValeur(s);
                    actuelle=s;
                }
            }
            nonvisite.remove(actuelle);
            for (Arc a:g.getAdjacents(actuelle).getListe()){
                calcul=v.getValeur(actuelle)+a.getPoids();
                if(calcul<v.getValeur(a.getNoeud())){
                    v.setValeur(a.getNoeud(),calcul);
                    v.setParent(a.getNoeud(),actuelle);
                }
            }
        }
        return v;
    }
}
