public class Main {

    /**
     * Entry point of the app.
     *
     * @param args Command line arguments
     */
    public static void main(String[] args) {
        Endroit endroit = new Endroit();
        endroit.identifiant = "id1";
        endroit.nom = "endroit";
        endroit.isImmeuble = true;
        System.out.println(endroit);
    }
}
