import java.util.ArrayList;

public class GrapheListe implements Graphe{

    private ArrayList<String> noeuds=new ArrayList<>();
    private ArrayList<Arcs> arcs=new ArrayList<>();

    @Override
    public Arcs getAdjacents(String noeud) {
        return this.arcs.get(this.noeuds.indexOf(noeud));
    }

    @Override
    public ArrayList<String> getNoeuds() {
        return this.noeuds;
    }

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
