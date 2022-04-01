package sk.llpc.model;

import java.util.Random;

public class Carrello {
    private int nProducts;

    public Carrello(){
        this.nProducts = (int)(Math.random()*100)+ 1;
    }

    /**
     * Operation removeProduct
     * Ritorna false se il carrello è vuoto.
     *
     * @paramn nProducts - Prodotti contenuti nel carrello
     * @param q - parametro che indica quanti elementi devo essere estratti dal carrello
     * @return boolean false se il carrello è vuoto
     */

    public boolean removeProduct(int q){
        this.nProducts -= q;

        if(this.nProducts <= 0){
            return false;
        }
        else
            return true;
    }
}


