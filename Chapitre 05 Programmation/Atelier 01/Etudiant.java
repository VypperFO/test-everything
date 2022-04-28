import java.util.ArrayList;

public class Etudiant {
    private String nom, prenom;
    private int age;
    private ArrayList<Integer> notes = new ArrayList<>();

    public Etudiant(String nom, String prenom, int age) {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
    }

    public void addNote(int note) {
        notes.add((Integer)note);
    }
    
    public ArrayList<Integer> getNotes() {
        return notes;
    }

    public double moyenneNotes() {
        double somme = 0;

        for (int i = 0; i < notes.size(); i++) {
            somme += notes.get(i);
        }

        return somme / notes.size();
    }


    @Override
    public String toString() {
        return "Etudiant{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", age=" + age +
                ", notes=" + notes +
                ", moyenne=" + moyenneNotes() +
                '}';
    }
}
