public class Livre {
    private String titre;
    private String auteur;
    private float prix;
    private static int nbLivre;

    
    public Livre(String titre, String auteur, float prix) {
        this.titre = titre;
        this.auteur = auteur;
        this.prix = prix;
        
        nbLivre++;
    }
    
    public static int getNbLivre() {
        return nbLivre;
    }
    
    @java.lang.Override
    public java.lang.String toString() {
        return "Livre{" +
                "titre='" + titre + '\'' +
                ", auteur='" + auteur + '\'' +
                ", prix=" + prix +
                '}';
    }

}
