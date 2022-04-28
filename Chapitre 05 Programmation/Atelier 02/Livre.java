import java.util.LinkedHashMap;

public class Livre {
    private String titre;
    private String auteur;
    private LinkedHashMap<String, Integer> mapLivre;

    public Livre(String titre, String auteur) {
        this.titre = titre;
        this.auteur = auteur;
        this.mapLivre = new LinkedHashMap<>();
    }

    public void addChapitre(String nom, int nbPage) {
        mapLivre.put(nom, nbPage);
    }


    @Override
    public String toString() {
        return titre + " de " + auteur + " " + mapLivre;
    }
}
