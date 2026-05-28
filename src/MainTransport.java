import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MainTransport {

    public static void main(String[] args)
    {
        if (args.length != 2) {
            System.err.println("Erreur: usage java Main <STATION_DEPART> <STATION_ARRIVEE>");
            System.exit(1);
        }
        else {
            // On retourne un chemin contenant les deux arrêts sélectionnés

            String from  = args[0];
            String to    = args[1];
            try{
                GrapheListe gliste = (GrapheListe) LireReseau.lire(
                        "C:/Users/mathi/Documents/SAE_algo/SAE_02_ExploAlgo_ALLIBERT-MILLOT_Mathieu_MAGASSA_Yacouba/SAE-2.02-GUI/stan.nodes.txt",
                        "C:/Users/mathi/Documents/SAE_algo/SAE_02_ExploAlgo_ALLIBERT-MILLOT_Mathieu_MAGASSA_Yacouba/SAE-2.02-GUI/stan.edges.txt"
                );

                // démarrage chronomètre
                long startTime = System.nanoTime();
                // code Java dont on mesure la complexité en temps
                double log42 = Math.log(42);
                // arrêt du chronomètre
                BellmanFord bellmanFord = new BellmanFord();
                Valeurs v=bellmanFord.resoudre(gliste,from);
                long endTime = System.nanoTime();
                // affichage du temps calculé (dans la sortie d'erreurs)
                System.err.println("Temps exécution pour BellmanFord: " + (endTime - startTime) + " ns");


                // démarrage chronomètre
                startTime = System.nanoTime();
                // code Java dont on mesure la complexité en temps
                log42 = Math.log(42);
                // arrêt du chronomètre
                Dijkstra dijkstra = new Dijkstra();
                v=dijkstra.resoudre(gliste,from);
                endTime = System.nanoTime();
                // affichage du temps calculé (dans la sortie d'erreurs)
                System.err.println("Temps exécution pour Dijkstra: " + (endTime - startTime) + " ns");


                List<String> machin=v.calculerChemin(to);
                String rep="";
                for (int i=0;i<machin.size();i++) {
                    rep+=machin.get(i);
                    if (i!=machin.size()-1){
                        rep+=";";
                    }

                }

                System.out.println(rep);


            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
