package fr.algorithmie;

public class AffichagePartiel {

	public static void main(String[] args) {
		
		int[] array = {1,15,-3,0,8,7,4,-2,28,7,-1,17,2,3,0,14,-4};
		
		{
			System.out.println("Nous allons afficher seulements les entiers supérieurs à 3 \n");
			for(int i = 0; i<= array.length-1; i++) {
				if(array[i]>3) {
					System.out.println(array[i]);
				}
			}
			System.out.println("\n");
		}
		
		{
			System.out.println("Nous allons afficher seulements les entiers pairs \n");
			for(int i = 0; i<= array.length-1; i++) {
				if(array[i]%2==0) {
					System.out.println(array[i]);
				}
			}
			System.out.println("\n");
		}
		
		{
			System.out.println("Nous allons afficher seulements les valeurs correspondants aux index pairs \n");
			for(int i = 0; i<= array.length-1; i++) {
				if(i%2==0) {
					System.out.println(array[i]);
				}
			}
		}
		
		{
			System.out.println("Nous allons afficher seulements les entiers impairs \n");
			for(int i = 0; i<= array.length-1; i++) {
				if(array[i]%2==1) {
					System.out.println(array[i]);
				}
			}
			System.out.println("\n");
		}

	}

}
