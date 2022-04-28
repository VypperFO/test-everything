import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static ArrayList<Jeux> jeux = new ArrayList<Jeux>();
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        readFileObject("jeux.dat");
        System.out.println(jeux.toString());
    }

    public static void writeFileObject(String fileName) throws IOException{
        ObjectOutputStream sortie = new ObjectOutputStream(new FileOutputStream(fileName));

        sortie.write(jeux.size());
        for (int i = 0; i < jeux.size(); i++) {
            sortie.writeObject(i);
        }

        sortie.close();
    }

    public static void readFileObject(String fileName) throws IOException, ClassNotFoundException{
        try{
            ObjectInputStream entree = new ObjectInputStream(new FileInputStream(fileName));

            jeux.clear();

            int nb = entree.read();
            for (int i = 0; i < nb; i++) {
                jeux.add((Jeux)entree.readObject());
            }

            entree.close();
        } catch(FileNotFoundException e){
            System.out.println("aucun fichier charger");
        }
    }
}
