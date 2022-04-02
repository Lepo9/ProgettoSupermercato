package sk.llpc.progettosupermercato;

import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.fxml.FXML;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.paint.Paint;
import javafx.util.Duration;

import java.util.ArrayList;
import java.util.List;

public class SupermercatoController {

    private final int intervalloAggiornamento = 2; //secondi

    public Background rosso;
    public Background verde;


    @FXML
    Button bttCassa0,bttCassa1,bttCassa2,bttCassa3,bttCassa4,bttCassa5,bttCassa6,bttCassa7,bttCassa8,bttCassa9;
    ArrayList <Button> casse;

    //Gestione timeline ---------------
    private Timeline timeline;
    private int contatore;

    private void inizializzaTimeline(){
        //Crea la timeline e lo incrementa.
        timeline = new Timeline(new KeyFrame(
                Duration.seconds(intervalloAggiornamento),
                e -> incrementa()
        ));
        timeline.setCycleCount(Animation.INDEFINITE);
        contatore = 0;
    }
    // ------------------------------


    //Inizializzazione pulsanti ---------------
    public void inizializzaPulsanti(){
        casse = new ArrayList<>();
        casse.add(bttCassa0);
        casse.add(bttCassa1);
        casse.add(bttCassa2);
        casse.add(bttCassa3);
        casse.add(bttCassa4);
        casse.add(bttCassa5);
        casse.add(bttCassa6);
        casse.add(bttCassa7);
        casse.add(bttCassa8);
        casse.add(bttCassa9);
    }
    //-----------------------------------------


    //Metodi chimati al click dei pulsanti-----
    @FXML
    protected void onBttClick0(){
        onBttClick(0);
    }
    @FXML
    protected void onBttClick1(){
        onBttClick(1);
    }
    @FXML
    protected void onBttClick2(){
        onBttClick(2);
    }
    @FXML
    protected void onBttClick3(){
        onBttClick(3);
    }
    @FXML
    protected void onBttClick4(){
        onBttClick(4);
    }
    @FXML
    protected void onBttClick5(){
        onBttClick(5);
    }
    @FXML
    protected void onBttClick6(){
        onBttClick(6);
    }
    @FXML
    protected void onBttClick7(){
        onBttClick(7);
    }
    @FXML
    protected void onBttClick8(){
        onBttClick(8);
    }
    @FXML
    protected void onBttClick9(){
        onBttClick(9);
    }
    //-----------------------------------------

    private void onBttClick(int nBtt){

    }

    private void incrementa(){

    }

    @FXML
    void initialize(){
        inizializzaTimeline();
        inizializzaPulsanti();
        rosso = new Background(new BackgroundFill(Paint.valueOf("red"), new CornerRadii(10), Insets.EMPTY));
        verde = new Background(new BackgroundFill(Paint.valueOf("lime"), new CornerRadii(10), Insets.EMPTY));
        timeline.play(); //Il play dovrà essere integrato con la barra dei menù
    }

    @FXML
    private ArrayList<Button> bttCasse;
    /**
     * Operation onButtonClik
     * Attiva o disattiva la cassa.
     *
     */
    protected void onButtonClik (  ){}
    /**
     * Operation start
     *
     */
    @FXML
    protected void start (  ){}
    /**
     * Operation stop
     *
     */
    @FXML
    protected void stop (  ){}
    /**
     * Operation pause
     *
     */
    @FXML
    protected void pause (  ){}
    /**
     * Operation reset
     *
     */
    @FXML
    protected void reset (  ){}


}

