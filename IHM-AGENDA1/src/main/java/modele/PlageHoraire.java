package modele;
public class PlageHoraire {
    public final static int DUREE_MIN = 60;
    private Horaire chDeb, chFin;

    public PlageHoraire(Horaire parDeb, Horaire parFin){
        chDeb = parDeb;
        chFin = parFin;
    }

    public String toString(){
        return chDeb.toString() + "-" + chFin.toString() + " " + ":" + " " + (durree()/60) + "h" + (durree()%60) + " " +  "minutes" ;
    }
    public boolean plageValide(){
        if ((chFin.toMinutes() - chDeb.toMinutes()) < DUREE_MIN) return false;
        return true;

    }
    
    public int durree(){
        return (chFin.toMinutes() - chDeb.toMinutes());
    }
    public int compareTo(PlageHoraire parPH) {
        if (chFin.toMinutes() < parPH.chDeb.toMinutes())
            return -1;
        if (parPH.chFin.toMinutes() < chDeb.toMinutes())
            return 1;
        return 0;
    }
}





