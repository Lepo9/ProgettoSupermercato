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


    private void apriChiudiCassa(int nCassa){
        if (casse.get(nCassa).isOpen())
            casse.get(nCassa).chiudi();
        else casse.get(nCassa).apri();
    }

}

