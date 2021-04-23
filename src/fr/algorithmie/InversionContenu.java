package fr.algorithmie;

public class InversionContenu {

	public static void main(String[] args) {
		int[] array = {1,15,-3,0,8,7,4,-2,28,7,-1,17,2,3,0,14,-4};
		{
			System.out.println("Nous allons afficher les éléments de notre tableau arrayCopy \n");
			int[] arrayCopy = new int[array.length];
			for(int x=(array.length-1); x>=0; x--) {
				for(int i =0; i<= (arrayCopy.length-1); i++) {
					arrayCopy[i]=array[x];
				}
				System.out.println(arrayCopy[x]);
			}
			System.out.println("\n");
			System.out.println("Nous allons afficher les éléments de notre tableau array \n");
			for(int a = 0; a<=(array.length-1); a++) {
				System.out.println(array[a]);
			}
		}
		
	}

}
