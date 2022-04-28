public class Main {
    public static void main(String[] args) {
        Livre livre01 = new Livre("BlockChain", "Laurent Leloup");
        Livre livre02 = new Livre("Player One", "Ernet Cline");

        livre01.addChapitre("1 Le blockchain c'est quoi?", 25);
        livre01.addChapitre("2 Le blockchain aujourd'hui", 50);
        livre01.addChapitre("3 Le blockchain demain", 22);

        livre02.addChapitre("0010", 11);
        livre02.addChapitre("0006", 10);
        livre02.addChapitre("0007", 33);
        livre02.addChapitre("0004", 27);

        System.out.println(livre02.toString());
        System.out.println(livre01.toString());
    }
}
