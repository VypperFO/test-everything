import java.io.Serializable;
import java.time.Year;

public class Jeux implements Serializable {
    private String nom, categorie;
    private int releaseDate;

    public Jeux(String nom, String categorie, int releaseDate) {
        this.nom = nom;
        this.categorie = categorie;
        this.releaseDate = releaseDate;
    }

    private int getAge(){
        return Year.now().getValue() - releaseDate;
    }


    @Override
    public String toString() {
        return nom  + ", " + categorie + ", Année de sortie " + releaseDate + getAge() + " ans";
    }
}
