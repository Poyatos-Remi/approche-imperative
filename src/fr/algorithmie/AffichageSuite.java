package fr.algorithmie;

public class AffichageSuite {

	public static void main(String[] args) {
		{
			System.out.println("Voici les nombres de 1 à 10 inclus avec une boucle for : \n");
			for(int i = 1; i<=10; i++) {
				System.out.println(i);
			}
			System.out.println("\n");
		}
		
		{
			System.out.println("Voici tous les nombres pair entre 0 et 10 inclus avec une boucle for : \n");
			for(int i = 0; i<=10; i++) {
				if(i%2==0) {
					System.out.println(i);
				}
			}
			System.out.println("\n");
		}
		
		{
			System.out.println("Voci tous les nombres impair entre 0 et 9 inclus avec une boucle for : \n");
			for(int i = 0; i<=9; i++) {
				if(i%2==1) {
					System.out.println(i);
				}
			}
			System.out.println("\n");
		}
		
		{
			System.out.println("Voici les nombres de 1 à 10 inclus avec une boucle while : \n");
			int i = 1;
			while(i<=10) {
				System.out.println(i);
				i++;
			}
			System.out.println("\n");
		}
		
		{
			System.out.println("Voici tous les nombres pair entre 0 et 10 inclus avec une boucle while : \n");
			int i = 0;
			while(i<=10) {
				if(i%2==0) {
					System.out.println(i);
				}
				i++;
			}
			System.out.println("\n");
		}
		
		{
			System.out.println("Voci tous les nombres impair entre 0 et 9 inclus avec une boucle while : \n");
			int i = 0;
			while(i<=9) {
				if(i%2==1) {
					System.out.println(i);
				}
				i++;
			}
			System.out.println("\n");
		}
	}

}
