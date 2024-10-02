public class Immeuble extends Endroit {

    int nombre_étage;

    Immeuble(int nombre_étage) {
        super("", "", true);
        this.nombre_étage = nombre_étage;
    }
}
