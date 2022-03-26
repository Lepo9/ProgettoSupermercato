package sk.llpc.model;

public class Carrello {
    private int nProducts;

    public Carrello(int nP){
        this.nProducts = nP;
    }

    /**
     * Operation removeProduct
     * Ritorna false se il carrello è vuoto.
     *
     * @paramn nProducts - Prodotti da togliere
     * @return boolean
     */

    public boolean removeProduct(){
        int temp = this.nProducts;
        while (temp != 0){
            nProducts--;
            break;
        }
        if(nProducts < temp){ //nProducts < this.nProducts
            return true;
        }
        else
            return false;
    }
}


