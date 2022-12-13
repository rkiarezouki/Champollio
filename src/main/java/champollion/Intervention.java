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

    public Intervention(Date debut, int duree, boolean annulee, int heureDebut, Salle lieu, TypeIntervention type, Enseignant intervenant, UE ue){
        this.debut = debut;
        this.duree = duree;
        this.annulee = annulee;
        this.heureDebut = heureDebut;
        this.lieu = lieu;
        this.type =type;
        this.intervenant = intervenant;
        this.ue = ue;



}
public Date getDebut(){
        return (Date) this.debut.clone();

}

   public void setDebut(Date debut){
        this.debut = debut;
   }
   public int getDuree(){
        return this.duree;
   }

   public void setDuree(int duree){
        this.duree = duree;

   }

   public boolean isAnnulee(){
        return this.annulee;

   }
   public void setAnnulee(boolean annulee){
        this.annulee = annulee;
   }

   public int getheureDebut(){
        return this.heureDebut;

    }
    public void setHeureDebut(int heureDebut){
        this.heureDebut = heureDebut;
    }
    public Salle getLieu(){
        return this.lieu;
    }
    public void setLieu(Salle lieu){
        this.lieu = lieu;
    }

    public TypeIntervention getType(){
        return this.type;
    }

    public void setType(TypeIntervention type){
        this.type = type;
    }
    public Enseignant getIntervenant(){
        return this.intervenant;
    }
    public void setIntervenant(Enseignant intervenant){
        this.intervenant = intervenant;
    }
    public UE getUE(){
        return this.ue;
    }

    public void setUE(UE ue){
        this.ue = ue;
    }
}