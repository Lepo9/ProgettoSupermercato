`#19/03

##Progettazione

Progettazione collettiva delle classi del modello tramite 
il programma dia. Ogni componente è consapevole delle meccaniche
che regolano il programma. Si decide di non creare un progetto
troppo complesso ma comunque che differisce dalla proposta
dell'insegnante. Si pensa che il livello di complessità sia
adatto al gruppo.

##Scelte progettuali

###Interfaccia
Questa è composta da una barra dei menù con all'interno il
sottomenù che apre i pulsanti start, pause e reset. Le casse
sono rappresentate da dei tasti: cliccandoli è possibile aprire o 
chiudere una cassa.

Quando il programma è in pausa le casse non processano prodotti
e non vengono aggiunti carrelli. Quando una cassa è chiusa,
ma il programma è in esecuzione, questa processa comunque i
carrelli che erano in coda.

###Generazione dei carrelli e processo di questi
Viene utilizzata un solo oggetto di tipo  Timeline non 
rispecchiando il modello proposto dal'insegnante. La scelta nasce
dal fatto che, nel nostro programma, ad ogni intervallo viene
processato un prodotto per cassa e viene creato un numero casuale
di carrelli con un un numero casuale di prodotti. Avere un
solo prodotto processato alla volta permette di gestire e di
regolare meglio il flusso di carrelli. (Non si espone il numero
di prodotti ma solo il numero di carrelli).

###Gestione tasti
Dato il numero ridotto di tasti si decide di creare metodi e nomi
separati per ogni tasto. Si creerà un metodo che avrà come 
parametro il numero del pulsante cliccato. Questo sarà
chiamato dai 10 metodi dei pulsanti. Nel metodo initialize verrà
creato un ArrayList di Button che farà riferimento ai 10 bottoni.


#26/03

##Completamento della progettazione
Sempre in modo collettivo viene terminata la progettazione

##Parte di programmazione

Con l'aiuto del professore, dal diagramma uml commentato si creano
le classi con i metodi.
Ci si suddivide i compiti:
- Pasini e Leporati cominciano la parte del controller e fxml
- Cadelli crea la classe Carrello
- Loda crea la classe Cassa

Ci si accorge che è un grosso problema scambiarsi il codice in modo
comodo. Si sceglie GitHub per programmare in modo tale che ognuno
possa programmare in autonomia e che tutti abbiano il codice 
aggiornato. L'impostazione iniziale è più lenta del previsto e si 
conclude la lezione.


#02/04

##Completamento del codice
Oggi tutti hanno le macchine impostate e funzionanti, sanno cosa
fare e tramite GitHub si lavora spediti. Si lavora in modo parallelo
in modo da massimizzare il tempo.

Di seguito viene elencato per ogni componente del gruppo i vari 
contributi. E' doveroso sottolineare che il codice è stato 
ripreso e rivisto più volte da tutti i componenti del gruppo.
Se compare più volte la stessa voce su persone diverse significa che 
si stava lavorando insieme sulla stessa macchina oppure che il codice
è stato rivisto.
Terminato un metodo o una funzione se ne sceglieva un'altra
e la si cominciava decidendo man mano che metodi scrivere (ovviamente
segnalandolo al gruppo per non scrivere cose uguali).

####Leporati
- Supervisione generare
- Metodo getNCarrelliPerCassa() [Supermrcato]
- Metodo getCasseAperte() [Supermrcato]
- Metodo apriChiudiCassa() [Supermrcato]
- Creazione del file fxml
- Metodo inizializzazioneTimeline() [SupermercatoController]
- Metodo inizializzazionePulsanti() [SupermercatoController]
- Metodo aggiornaGrafica() [SupermercatoController]
- Metodo incrementa() [SupermercatoController]
- Metodo inizializzazioneColori() [SupermercatoController]
- Metodo inizializzaSupermercato() [SupermercatoController]
- Metodo initialize() [SupermercatoController]
- Metodo start() [SupermercatoController]
- Metodo pause() [SupermercatoController]
- Metodo reset() [SupermercatoController]


####Pasini
- Classe carrello
- Metodo getNCarrelliPerCassa() [Supermrcato]
- Metodo getCasseAperte() [Supermrcato]
- Metodo apriChiudiCassa() [Supermrcato]
- Metodo aggiorna() [Supermercato]
- Creazione del file fxml
- Metodo onBttClick(int nBtt) [SupermercatoController]
- Metodo inizializzazioneTimeline() [SupermercatoController]
- Metodo aggiornaGrafica() [SupermercatoController]
- Metodo incrementa() [SupermercatoController]
- Metodo inizializzaSupermercato() [SupermercatoController]
- Metodo initialize() [SupermercatoController]
- Metodo start() [SupermercatoController]
- Metodo pause() [SupermercatoController]
- Metodo reset() [SupermercatoController]


####Cadenelli
- Classe carrello
- Metodo ricercaCassaMinore() [Supermercato]
- Metodo aggiorna() [Supermercato]
- Costruttore Supermercato() [Supermercato]

####Loda
- Classe cassa
- Completamento e indentazione generale del commento del programma
- Metodo ricercaCassaMinore() [Supermercato]
- Metodo aggiorna() [Supermercato]
- Costruttore Supermercato() [Supermercato]


Pasini e Leporati hanno lavorato di più sulla parte del controller
mentre Cadenelli e Loda sulla parte del modello.

#Dal 04/04 al 08/04 

##Revisone generale del codice
Tutti i componenti hanno provato il codice e corretto eventuali
piccoli bugs. Sono stati eseguiti dei test per capire e regolare
il flusso di carrelli. Il commento è stato completato.

##Idee ulteriori
Sono emerse delle idee da implementare (non devono esserlo, se si 
avrà più tempo si cercherà di implementarle)
- Nel menù oscurare run qunado è in pausa e vicevesa
- Inserire il tasto per chiudere e aprire tutte le casse insieme
- Se nessuna cassa è aperta, salvare quanti carrelli stanno aspettando
- Se la differenza tra due casse è maggiore di 5 si spostano i carrelli.`
