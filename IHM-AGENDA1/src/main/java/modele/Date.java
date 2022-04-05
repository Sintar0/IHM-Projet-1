package modele;

public class Date{ /* Création de la class Date, on intialise les champs en "protected" afin qu'ils puissent être par DateCalendrier */
    protected int chJour;   /* On oublie pas de "typer les champs à chaque fois" */
    protected int chMois;
    protected int chAnnee; 

/* Tout de suite après avoir crée la class Date, il faut crée son construteur -> champs affectés en aux paramètre */
    Date(int parJour, int parMois, int parAnnee){
        chJour = parJour;
        chMois = parMois;
        chAnnee = parAnnee;
    }
    Date(){
        
    } /* A quoi sert ce constructeur vide ? => il sert à la class DateCalendrier, elle peut ainsi hériter de la class Date */ 

    public String toString() {
        return chJour + "/" + chMois + "/" + chAnnee;
    }
    public static boolean estBissextile(int parAnnee){
        return (parAnnee % 4 == 0 && parAnnee % 100 != 0) || parAnnee % 400 == 0; 
    }

    public static int dernierJourDuMois(int parMois, int parAnnee){ 
        /* Rappel de la syntaxe : public static (en effet, le champs doit seulement être utiliser dans le cadre de cette classe), enfin la méthode retourne un int comme précisé*/
        switch(parMois){
            case 2:
            if (Date.estBissextile(parAnnee))
                return 29;
            else 
                return 28;

            case 4 : case 6 : case 9 : case 11 : return 30; 

            default : return 31;
        }
    }
    

    public boolean estValide(){
        if (chMois > 12 || chMois < 0) 
            return false;
        if (chAnnee < 1583)
            return false;
        if (chJour < 0 || chJour > dernierJourDuMois(chMois,chAnnee))
            return false;
        return true;
    }


    /**
     * comparer 2 dates
     * @param : parDate, date à comparer avec this
     * @return: 
     * -1, si this < parDate
     * 0 si this == parDate
     * 1, si this > parDate
     */
    public int compareTo(Date parDate){
        if (chAnnee < parDate.chAnnee){
            return -1;
        }
        if (chAnnee > parDate.chAnnee){
           return 1;
        }
        if (chMois < parDate.chMois){
            return -1;
        }
        if (chMois > parDate.chMois){
            return 1;
        }
        if (chJour < parDate.chJour){
            return -1;
        }
        if (chJour > parDate.chJour){
            return 1;
        }
        return 0;
    }
    public Date dateLendemain(){
        int jour = chJour +1;
        int mois = chMois;
        int annee = chAnnee;

        if (jour > dernierJourDuMois(mois,annee)){
            jour = 1;
            mois ++;
            if(mois > 12){
                mois = 1;
                annee ++;
            }
        }
        return new Date(jour, mois, annee);
    }

    
    public Date dateVeille(){
        int jour = chJour -1;
        int mois = chMois;
        int annee = chAnnee;

        if (jour < 1){
            mois --;
            if(mois < 1){
                mois = 12;
                annee --;
            }
            jour = dernierJourDuMois(mois,annee);
        }
        return new Date(jour, mois, annee);
    }

    
}
