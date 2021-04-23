package fr.algorithmie;

public class CalculMoyenne {

	public static void main(String[] args) {
		
		int[] array = {1,15,-3,0,8,7,4,-2,28,7,-1,17,2,3,0,14,-4};
		
		{
			System.out.println("Calcul de la moyenne du tableau \n");
			float additionValeurs=0F;
			float moyenne=0F;
			for(int i = 0; i<= array.length-1; i++) {
				additionValeurs=(additionValeurs+array[i]);
			}
			moyenne=(additionValeurs/array.length);
			System.out.println("La somme des valeurs du tableau est égale à : "+additionValeurs);
			System.out.println("Le nombre de valeurs dans le tableau est de : "+array.length);
			System.out.println("La moyenne des valeurs du tableau est : "+ moyenne);
		}

	}

}
