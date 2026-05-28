import java.util.ArrayList;

public class Arcs {
    private ArrayList<Arc> arcs=new ArrayList();

    public void ajout(Arc arc){
        if (arc!=null){
            this.arcs.add(arc);
        }
    }

    public ArrayList<Arc> getListe(){
        return this.arcs;
    }

    public boolean contient(String noeud){
        for (Arc arc:this.arcs){
            if (arc.getNoeud().equals(noeud)){
                return true;
            }
        }
        return false;
    }

}
