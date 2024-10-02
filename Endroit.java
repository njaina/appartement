public class Endroit {

    public String identifiant;
    public String nom;
    public Boolean isImmeuble;

    Endroit(String identifiant, String nom, Boolean isImmeuble) {
        this.identifiant = identifiant;
        this.nom = nom;
        this.isImmeuble = isImmeuble;
    }

    public void setIdentifiant(String identifiant) {
        this.identifiant = identifiant;
    }

    public String getIdentifiant() {
        return identifiant;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }

    public void setIsImmeube(Boolean isImmeuble) {
        this.isImmeuble = isImmeuble;
    }

    public String getIsImmeuble() {
        return isImmeuble;
    }
}
