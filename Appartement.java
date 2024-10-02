public class Appartement {

    String identifiant;
    String titre;
    String description;
    String Loyer_mensuel;
    STATUS Status;
    Endroit endroit;

    Appartement(
        String identifiant,
        String titre,
        String description,
        String Loyer_mensuel
    ) {
        this.identifiant = identifiant;
        this.titre = titre;
        this.description = description;
        this.Loyer_mensuel = Loyer_mensuel;
    }

    enum STATUS {
        Libre,
        Occupé,
        EnCoursDeLibération,
    }
}
