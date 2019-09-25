import java.util.Random;
import java.util.Scanner;

class Play {
				
	public static void main(String[] args){
		
		// Initialisation des cartes dans un tableau à deux dimensions
		int as=11;
		int deux=2;
		int trois=3;
		int quatre=4;
		int cinq=5;
		int six=6;
		int sept=7;
		int huit=8;
		int neuf=9;
		int dix=10;
		int valet=10;
		int dame=10;
		int roi=10;
		int[] cartes= { as , deux , trois , quatre, cinq , six , sept , huit , neuf , dix , valet, dame , roi };
    		
		// Le dealer génère une carte pour le player
		int cardOneplayer = new Random().nextInt(cartes.length);
		cardOneplayer=cartes[cardOneplayer];
		int scorePlayer=cardOneplayer;
		/*System.out.println("Card One : " +cardOneplayer);*/
		
		// Le dealer génère une deuxieme carte pour le player
		
		int cardTwoPlayer = new Random().nextInt(cartes.length);
		
		/*if (scorePlayer>=10 || scoreDealer) { // l'as prend la valeur 1 
			as = 1; 
		} */
	
    		

    		//System.out.println("Card Two: " + cartes[cardTwoPlayer]);

		scorePlayer=cardOneplayer+cartes[cardTwoPlayer];
		System.out.println("Score Player : " + scorePlayer);

		// Le dealer génère deux cartes pour lui mais n'en affiche qu'une seule
		
		int cardOneDealer = new Random().nextInt(cartes.length);
		cardOneDealer=cartes[cardOneDealer];
		System.out.println("Card One Dealer : " +cardOneDealer);
		
		int cardTwoDealer = new Random().nextInt(cartes.length);
		int scoreDealer=cartes[cardTwoDealer]+cardOneDealer;

		
		
		// demande au player s'il souhaite piocher
		Scanner draw= new Scanner(System.in);
		System.out.println("Draw card ? (type yes or no) ");
		String drawCard= draw.nextLine();
		
		
		if (drawCard.equals("yes")) { // oui l'utilisateur veut piocher
			while (drawCard.equals("yes") && scorePlayer<21) {
				int cardThreePlayer = new Random().nextInt(cartes.length);
    				System.out.println("New card: " + cartes[cardThreePlayer]);
				scorePlayer=scorePlayer+cartes[cardThreePlayer];
				System.out.println("Score player " + scorePlayer);
				if (scorePlayer<21) {
					draw= new Scanner(System.in);
					System.out.println("Draw card ? (type yes or no) ");
					drawCard= draw.nextLine();
				}
			}
			//CONCLUSION 
			if (scorePlayer<=21 && scorePlayer>scoreDealer) {
				System.out.println("Your score : " + scorePlayer);
				System.out.println("Score dealer : " + scoreDealer); 
				System.out.println ("You won :) ! ");
	
			} else if (scorePlayer==scoreDealer && scorePlayer < 21){
				System.out.println("Your score : " + scorePlayer);					
				System.out.println("Score dealer : " + scoreDealer); 
				System.out.println("Egalité");			

			} else {
				System.out.println("Your score : " + scorePlayer);
				System.out.println("Score dealer : " + scoreDealer); 
				System.out.println("You lose :(");
				
			}
			
		} else { // non il ne veut pas piocher
			
			//CONCLUSION 
			if (scorePlayer<=21 && scorePlayer>scoreDealer) {
				System.out.println("Your score : " + scorePlayer);
				System.out.println("Score dealer : " + scoreDealer); 
				System.out.println ("You won :) ! ");
	
			} else if (scorePlayer==scoreDealer && scorePlayer < 21){	
				System.out.println("Your score : " + scorePlayer);
				System.out.println("Score dealer : " + scoreDealer); 								
				System.out.println("Egalité");			

			} else {
				System.out.println("Your score : " + scorePlayer);
				System.out.println("Score dealer : " + scoreDealer); 
				System.out.println("You lose :(");
				
			}
		}
		
	
	}

}
