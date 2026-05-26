public class Arc {
    private double poids;
    private String noeud;

    public Arc(String cible,double poid){
        this.noeud=cible;
        this.poids=poid;
    }

    public String toString(){
        return noeud+"("+poids+") ";
    }
}
