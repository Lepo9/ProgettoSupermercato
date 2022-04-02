package sk.llpc.model;

import java.util.ArrayList;

public class Supermercato {

    private ArrayList<Cassa> casse;

    /**
     * Operation Supermercato
     * Crea l'ArreyList e costruzione delle casse.
     *
     * @param nCasse - 
     * @return 
     */
    public Supermercato ( int nCasse ){}


    /**
     * Operation aggiorna
     * Aggiorna tutte le casse.
    Si generano da 1 a 4 carrelli accodandoli nelle casse 
     *
     */
    public void aggiorna (  ){}


    /**
     * Operation ricercaCassaMinore
     *
     * @return Cassa
     */
    private Cassa ricercaCassaMinore (  ){
        return null;
    }


    /**
     * Si occupa di controllare e aprire e chiudere le casse
     * @param nCassa cassa da aprire/chiudere
     */
    public void apriChiudiCassa(int nCassa){
        if (casse.get(nCassa).isOpen())
            casse.get(nCassa).chiudi();
        else casse.get(nCassa).apri();
    }

    /**
     * Si occupa di produrre un array di booleani che definisce
     * se le casse sono aperte 0 chiuse
     * @return arraylist di boolean true o false
     */
    public ArrayList<Boolean> getCasseAperte(){
        ArrayList<Boolean> aperte = new ArrayList<>();

        for(Cassa i: casse){
            if(i.isOpen())
                aperte.add(true);
            else aperte.add(false);
        }

        return aperte;
    }

    /**
     * Il metodo fornisce un array di interi
     * @return L'array definisce quanti carrelli ci sono in coda per ciascuna cassa
     */
    public ArrayList<Integer>getNCarrelliPerCassa(){
        ArrayList<Integer>t = new ArrayList<>();
        for(Cassa i:casse){
            t.add(i.getQuanti());
        }
        return t;
    }

}

