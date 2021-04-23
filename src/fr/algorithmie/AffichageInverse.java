package fr.algorithmie;

public class AffichageInverse {

	public static void main(String[] args) {
		int[] array = {1,15,-3,0,8,7,4,-2,28,7,-1,17,2,3,0,14,-4};
		{
			System.out.println("Nous allons afficher dans l'ordre les éléments de notre tableau \n");
			for(int i =0; i<= (array.length-1); i++) {
				System.out.println(array[i]);
			}
			System.out.println("\n");
		}
		
		{
			System.out.println("Nous allons afficher dans l'ordre inverse les éléments de notre tableau \n");
			for(int i=(array.length-1); i>=0; i--) {
				System.out.println(array[i]);
			}
			System.out.println("\n");
		}
		
		{
			System.out.println("Nous allons afficher dans l'ordre les éléments de notre tableau arrayCopy \n");
			int[] arrayCopy = new int[array.length];
			for(int x=0; x<=(array.length-1); x++) {
				for(int i =0; i<= (arrayCopy.length-1); i++) {
					arrayCopy[i]=array[x];					
				}
				System.out.println(arrayCopy[x]);
			}
		}
		
	}

}
