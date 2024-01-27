import java.util.Scanner;

public class Main {

	public static void main(String[] args)  throws InterruptedException{

		MoraCinese moracinese = new MoraCinese();

		Scanner tastiera = new Scanner(System.in);


		do {
		moracinese.Benvenuto();
		
		moracinese.DigitaMossa();
		
		moracinese.GeneraMossaCpu();
		
		moracinese.StampaScelte();
		
		moracinese.ConfrontaScelte();
		
		} while(moracinese.GiochiAncora());
		
		
		
		tastiera.close();

	}
}

//			Thread.sleep(1000); // Ritardo di 1 secondo