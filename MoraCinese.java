import java.util.Scanner;

public class MoraCinese {

	private String[] mosse;
	
	private String sceltaTua;
	private String sceltaCpu;
	
	private int nSwitch;
	private int indiceCasuale;
	
	private boolean againPlay;


	private Scanner tastiera;
	
	public MoraCinese() {
		this.tastiera = new Scanner(System.in);
		this.mosse = new String[] {"Sasso", "Carta", "Forbice"};
	}
	

	public void Benvenuto() {
		System.out.println("Benvenuto! Scegli una mossa tra:");
		System.out.println("0: Sasso");
		System.out.println("1: Carta");
		System.out.println("2: Forbice");
	}

	public void DigitaMossa() {
		System.out.print("Digita il numero con la mossa desiderata: ");
		nSwitch = Integer.parseInt(tastiera.nextLine().trim());

		if (nSwitch >= 0 && nSwitch < mosse.length) {
			sceltaTua = mosse[nSwitch];
		} 

		while(nSwitch < 0 || nSwitch > 2) {
			System.out.print("Hai inserito un carattere non valido. Riprova: ");
			nSwitch = Integer.parseInt(tastiera.nextLine().trim());

			if (nSwitch >= 0 && nSwitch < mosse.length) {
				sceltaTua = mosse[nSwitch];
			}
		}

	}


	public void GeneraMossaCpu() {
		indiceCasuale = (int) (Math.random() * mosse.length);
		sceltaCpu = mosse[indiceCasuale];
	}

	public void StampaScelte() {
		System.out.println("Hai scelto: " + sceltaTua + "\n"
				+ "Cpu ha scelto: " + sceltaCpu);
	}

	public void ConfrontaScelte() {
		System.err.flush();

		if (sceltaCpu.equals(sceltaTua)) {
			System.err.println("Avete pareggiato");
		} else {
			if (sceltaTua.equals("Sasso")) {		
				if (sceltaCpu.equals("Forbice")) {
					System.err.println("Hai vinto");
					//	                punteggioCpu++;
				} else {
					System.err.println("Hai perso");
					//	                punteggioTuo++;
				}
			} else if (sceltaTua.equals("Carta")) {		
				if (sceltaCpu.equals("Sasso")) {
					System.err.println("Hai vinto");
					//	                punteggioCpu++;
				} else {
					System.err.println("Hai perso");
					//	                punteggioTuo++;
				}
			} else if (sceltaTua.equals("Forbice")) {		
				if (sceltaCpu.equals("Carta")) {
					System.err.println("Hai vinto");
					//	                punteggioCpu++;
				} else {
					System.err.println("Hai perso");
					//	                punteggioTuo++;
				}
			}
		}
	}

	public boolean GiochiAncora() {
		System.out.print("Vuoi giocare ancora? Scrivi S/N: ");
		String risposta = tastiera.nextLine();

		if (risposta.equalsIgnoreCase("N")) {
			System.out.println("Ok mi stoppo. Grazie per aver giocato");
			againPlay = false;
		} else if (risposta.equalsIgnoreCase("S")) {
			againPlay = true;
		} else {
			System.out.print("Hai inserito un carattere errato, riprova: ");
		}
		return againPlay;

	}

}
