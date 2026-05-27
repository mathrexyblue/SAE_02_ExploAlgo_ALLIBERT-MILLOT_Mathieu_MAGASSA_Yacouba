public class MainBellmanFord {
    public static void main(String[] args) {
        GrapheListe g=new GrapheListe();
        g.ajoutArc("A","B",12);
        g.ajoutArc("A","D",87);
        g.ajoutArc("B","E",11);
        g.ajoutArc("C","A",19);
        g.ajoutArc("D","B",23);
        g.ajoutArc("D","C",10);
        g.ajoutArc("E","D",43);

        BellmanFord bf=new BellmanFord();
        Valeurs v=bf.resoudre(g,"A");
        System.out.println(v);
        System.out.println(v.calculerChemin("C"));
    }
}
