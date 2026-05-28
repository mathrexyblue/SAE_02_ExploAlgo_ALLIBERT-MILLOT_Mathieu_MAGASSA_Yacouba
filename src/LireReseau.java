import java.io.*;

public class LireReseau {


    public static Graphe lire(String fichier_stations, String fichier_connexions)throws IOException{
        GrapheListe gliste=new GrapheListe();
        try{
            Reader r=new FileReader(fichier_connexions);
            BufferedReader br =new BufferedReader(r);
            String line= br.readLine();
            while(line!=null){
                String[] edges=line.split(";");
                gliste.ajoutArc(edges[0],edges[1],Double.parseDouble(edges[2]));
                gliste.ajoutArc(edges[1],edges[0],Double.parseDouble(edges[2]));
                line=br.readLine();
            }
        }catch(FileNotFoundException e){
            System.out.println("File not found");
        }
        return gliste;
    }
}
