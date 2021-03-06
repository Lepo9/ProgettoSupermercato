package sk.llpc.model;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Classe Supermercato:
 * contiene un ArrayList di Casse, in un numero pari a quello delle casse visualizzate nella GUI.
 */

public class Supermercato {
    private ArrayList<Cassa> casse;
    private final int NUM_CARRELLI = 3; //Va da 2 a N+1

    /**
     * Crea l'ArreyList e costruzione delle casse.
     * @param nCasse Numero di casse presenti nel Supermercato.
     */
    public Supermercato(int nCasse) {
        casse = new ArrayList<>();
        for (int i = 0; i < nCasse; i++) {
            Cassa temp = new Cassa();
            casse.add(temp);
        }
    }

    /**
     * Aggiorna tutte le casse.
     * Si generano da 2 a 4 carrelli accodandoli nelle casse.
     */
    public void aggiorna() {
        int nCarrelli = (int)(Math.random()*NUM_CARRELLI+2);

        for(Cassa i: casse){
            i.aggiorna();
        }

        for(int i= 0; i < nCarrelli; i++){
            ricercaCassaMinore().aggiungiCarrello(new Carrello());
        }
    }

    /**
     * Ricerca della Cassa minore.
     * @return Cassa minore.
     */
    private Cassa ricercaCassaMinore ( ){
        int temp = 2000000000;
        Cassa c = new Cassa();
        for (Cassa item:casse) {
            if(temp > item.getQuanti() && item.isOpen()){
                temp = item.getQuanti();
                c = item;
            }
        }
        return c;
    }

    /**
     * Si occupa di controllare e aprire e chiudere le casse.
     * @param nCassa cassa da aprire/chiudere.
     */
    public void apriChiudiCassa(int nCassa){
        if (casse.get(nCassa).isOpen())
            casse.get(nCassa).chiudi();
        else casse.get(nCassa).apri();
    }

    /**
     * Si occupa di produrre un array di booleani che definisce
     * se le casse sono aperte o chiuse.
     * @return Arraylist di boolean true o false.
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
     * Il metodo fornisce un array di interi.
     * @return L'array definisce quanti carrelli ci sono in coda per ciascuna cassa.
     */
    public ArrayList<Integer>getNCarrelliPerCassa(){
        ArrayList<Integer>t = new ArrayList<>();
        for(Cassa i:casse){
            t.add(i.getQuanti());
        }
        return t;
    }
}

