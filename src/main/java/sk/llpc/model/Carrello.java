package sk.llpc.model;

import java.util.Random;

/**
 * Classe Carrello:
 * contiene il numero di prodotti e dei metodi per passare i prodotti in cassa e toglierli dal carrello.
 */

public class Carrello {
    private int nProdotti;

    /**
     * Costruttore vuoto: crea un numero randomico di prodotti all'interno di un Carrello.
     */
    public Carrello(){
        this.nProdotti = (int)(Math.random()*3+1); //da 0 a N-1
    }

    /**
     * Toglie prodotti dal Carrello.
     * @param nProdotti parametro che indica quanti elementi devono essere estratti dal carrello.
     * @return boolean false se il carrello è vuoto.
     */
    public boolean togliProdotti(int nProdotti){
        this.nProdotti--;
        if (this.nProdotti <= 0){
            return false;
        }
        else
            return true;
    }
}


