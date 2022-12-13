package champollion;

import java.util.*;

public class Enseignant extends Personne {


    List<ServicePrevu> servicesPrevus = new ArrayList<>();


    public Enseignant(String nom, String email) {
        super(nom, email);
    }

    /**
     * Calcule le nombre total d'heures prévues pour cet enseignant en "heures équivalent TD" Pour le calcul : 1 heure
     * de cours magistral vaut 1,5 h "équivalent TD" 1 heure de TD vaut 1h "équivalent TD" 1 heure de TP vaut 0,75h
     * "équivalent TD"
     *
     * @return le nombre total d'heures "équivalent TD" prévues pour cet enseignant, arrondi à l'entier le plus proche
     *
     */
    public int heuresPrevues() {
       int equivalentTD = 0;

       for(ServicePrevu service : servicesPrevus){
           equivalentTD += 1.5 * service.getVolumeCM();
           equivalentTD += service.getVolumeTD();
           equivalentTD += 0.75 * service.getVolumeTP();

           Math.round(equivalentTD);
       }
       return equivalentTD;


    }

    /**
     * Calcule le nombre total d'heures prévues pour cet enseignant dans l'UE spécifiée en "heures équivalent TD" Pour
     * le calcul : 1 heure de cours magistral vaut 1,5 h "équivalent TD" 1 heure de TD vaut 1h "équivalent TD" 1 heure
     * de TP vaut 0,75h "équivalent TD"
     *
     * @param ue l'UE concernée
     * @return le nombre total d'heures "équivalent TD" prévues pour cet enseignant, arrondi à l'entier le plus proche
     *
     */
    public int heuresPrevuesPourUE(UE ue) {
     int equivalentTD = 0;

     for(ServicePrevu service : servicesPrevus){
         if(service.getUe() == ue){
             equivalentTD += 1.5 * service.getVolumeCM();
             equivalentTD += service.getVolumeTD();
             equivalentTD += 0.75 * service.getVolumeTP();
             Math.round(equivalentTD);
         }

     }
     return equivalentTD;
    }

    /**
     * Ajoute un enseignement au service prévu pour cet enseignant
     *
     * @param ue l'UE concernée
     * @param volumeCM le volume d'heures de cours magitral
     * @param volumeTD le volume d'heures de TD
     * @param volumeTP le volume d'heures de TP
     */
    public void ajouteEnseignement(UE ue, int volumeCM, int volumeTD, int volumeTP) {
      boolean present = false;
      for(ServicePrevu service : servicesPrevus){
          if(service.getUe().equals(ue)){
              present = true;
              service.setVolumeCM(service.getVolumeCM()+volumeCM);
              service.setVolumeTD(service.getVolumeTD()+volumeTD);
              service.setVolumeTP(service.getVolumeTP()+volumeTP);
          }
      }
      if(!present){
          servicesPrevus.add(new ServicePrevu(ue, volumeCM,volumeTD, volumeTP));


      }
    }

    public void ajouterIntervention(Intervention intervention)

}
