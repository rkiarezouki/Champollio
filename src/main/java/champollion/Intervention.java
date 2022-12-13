package champollion;
import java.util.Date;
public class Intervention {

    private Date debut;
    private int duree;
    private boolean annulee = false;
    private int heureDebut;
    private Salle lieu;
    private TypeIntervention type;
    private Enseignant intervenant;
    private UE ue;

    public Intervention(Date debut, int duree, boolean annulee, int heureDebut, Salle salle, TypeIntervention type, Enseignant intervenant, UE ue){
        this.debut = debut;
        this.duree = duree;
        this.annulee = annulee;
        this.heureDebut = heureDebut;
        this.salle = salle;

}
}