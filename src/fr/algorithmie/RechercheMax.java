package fr.algorithmie;

public class RechercheMax {

	public static void main(String[] args) {
		
		int[] array = {1,15,-3,0,8,7,4,-2,28,7,-1,17,2,3,0,14,-4};
		
		{
			System.out.println("Recherche de l'élément le plus grand du tableau \n");
			int valMax=0;
			for(int i = 0; i<= array.length-1; i++) {
				if(array[i]>valMax) {
					valMax=array[i];
				}
			}
			System.out.println("La plus grande valeur du tableau est : "+ valMax);
		}

	}

}
