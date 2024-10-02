import java.util.ArrayList;
import java.util.List;

public class Quartier extends Endroit {

    List<Immeuble> immeubles;

    Quartier(List<Immeuble> immeubles) {
        super("", "", false);
        this.immeubles = immeubles;
    }
}
