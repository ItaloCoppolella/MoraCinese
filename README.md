# MorraCinese

Un semplice gioco di "Morra Cinese" (Sasso, Carta, Forbice) scritto in Java, utilizzando la programmazione orientata agli oggetti.

## Descrizione

Questo progetto implementa un gioco di Morra Cinese dove l'utente gioca contro il computer. Il gioco continua fino a quando l'utente decide di smettere. Ogni turno, l'utente sceglie tra "Sasso", "Carta" o "Forbice", e il computer genera casualmente una delle tre opzioni. Il vincitore del turno è determinato in base alle regole classiche del gioco.

## Requisiti

- Java Development Kit (JDK) 8 o superiore

## Installazione

1. Clona questa repository:

    ```sh
    git clone https://github.com/tuo-username/MorraCinese.git
    ```

2. Naviga nella directory del progetto:

    ```sh
    cd MorraCinese
    ```

## Utilizzo

1. Compila i file Java:

    ```sh
    javac Main.java MorraCinese.java
    ```

2. Esegui il programma:

    ```sh
    java Main
    ```

## Struttura del Progetto

- `Main.java`: Contiene il metodo `main` che avvia il gioco e gestisce il ciclo principale del gioco.
- `MorraCinese.java`: Definisce la classe `MorraCinese` che contiene la logica del gioco, inclusi i metodi per accogliere l'utente, gestire le scelte dell'utente e del computer, confrontare le scelte e determinare se il gioco continua.

## Funzionalità

- **Benvenuto**: Visualizza un messaggio di benvenuto e le opzioni disponibili per l'utente.
- **DigitaMossa**: Permette all'utente di scegliere una mossa.
- **GeneraMossaCpu**: Genera casualmente una mossa per il computer.
- **StampaScelte**: Stampa le scelte fatte dall'utente e dal computer.
- **ConfrontaScelte**: Confronta le scelte e determina il vincitore del turno.
- **GiochiAncora**: Chiede all'utente se vuole continuare a giocare.

## Contributi

I contributi sono benvenuti! Se hai idee o suggerimenti sentiti libero di aprire una pull request oppure di segnalarmi un problema.
