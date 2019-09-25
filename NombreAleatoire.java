import java.util.Random; /*

public class NombreAleatoire {
    public static void main(String args[]) {

        // génération d'un nombre >= 0 et < 5
        Random r = new Random();
        int n = r.nextInt(5);
        System.out.println(n);    */

	

class NombreAleatoire {
	
	public static void main(String[] args) {
	
		int as=1;
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
    		int rnd = new Random().nextInt(cartes.length);
    		System.out.println(cartes[rnd]);
 	 }


     
  }
