import javax.sound.sampled.SourceDataLine;

public class Main {
    public static void main(String[] args) {
        Etudiant etu01 = new Etudiant("fliex", "latulip", 18);
        etu01.addNote(12);
        etu01.addNote(45);
        etu01.addNote(535);

        System.out.println(etu01.toString());
    }
}
