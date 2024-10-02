public class Immeuble extends Endroit {

    int nombre_étage;

    Immeuble(int nombre_étage) {
        super("", "", true);
        this.nombre_étage = nombre_étage;
    }

    public void setNombreEtage(int nombre_étage) {
        this.nombre_étage = nombre_étage;
    }

    public int getNombreEtage() {
        return nombre_étage;
    }
}
