package sk.llpc.model;

import java.util.Random;

/**
 * Classe Carrello:
 * contiene il numero di prodotti e dei metodi per passare i prodotti in cassa e toglierli dal carrello.
 */

public class Carrello {
    //Con 10 casse attive
    //5 bilanciato e smaltisce
    //6 Non smaltisce e si accumula
    //4 smaltisce
    private int nProdotti;
    final static int PRODOTTI_MAX = 2; //da 1 a N.

    /**
     * Costruttore vuoto: crea un numero randomico di prodotti all'interno di un Carrello.
     */
    public Carrello(){
        this.nProdotti = (int)(Math.random()*PRODOTTI_MAX+1); //da 0 a N-1
    }

    /**
     * Toglie prodotti dal Carrello.
     * @param nProdotti parametro che indica quanti elementi devono essere estratti dal carrello.
     * @return boolean false se il carrello è vuoto.
     */
    public boolean togliProdotti(int nProdotti){
        this.nProdotti -= nProdotti;
        if (this.nProdotti <= 0){
            return true;
        }
        else
            return false;
    }
}


