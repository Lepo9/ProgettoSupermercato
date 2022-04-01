package sk.llpc.progettosupermercato;

import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.fxml.FXML;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.effect.Effect;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.util.Duration;

import java.util.ArrayList;

public class SupermercatoController {

    @FXML
    Button btt;

    //Prova per il background

    public Background rosso;
    public Background verde;

    //Gestione timeline ---------------
    private Timeline timeline;
    private int contatore;


    private void inizializzaTimeline(){
        timeline = new Timeline(new KeyFrame(
                Duration.seconds(2),
                e -> incrementa()
        ));
        timeline.setCycleCount(Animation.INDEFINITE);
        contatore = 0;
    }

    private void incrementa(){
        contatore++;
        if (contatore % 2 == 0)
            btt.setBackground(rosso);
        else
            btt.setBackground(verde);

        System.out.println(contatore);
    }
    // ------------------------------



    @FXML
    void initialize(){
        inizializzaTimeline();
        rosso = new Background(new BackgroundFill(Paint.valueOf("red"), new CornerRadii(10), Insets.EMPTY));
        verde = new Background(new BackgroundFill(Paint.valueOf("lime"), new CornerRadii(10), Insets.EMPTY));
        timeline.play();
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

