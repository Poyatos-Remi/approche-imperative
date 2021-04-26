package fr.algorithmie;

import java.util.Iterator;
import java.util.Scanner;

public class InteractifStockageNombre {

	public static void main(String[] args) {
		
//		int longueurTab=4;
//		int[] tab = new int[longueurTab];
		int[] tab = new int[0];
		
		System.out.println("Choisissez parmis ces deux options en tapant 1 ou 2:\n");
		System.out.println("1. Ajouter un nombre \n");
		System.out.println("2. Afficher les nombres existants \n");
		System.out.println("3. Quitter \n");
		
		try ( Scanner scanner = new Scanner( System.in ) ) {
			
            
            System.out.print( "Votre choix : " );
            int choix = scanner.nextInt();
            
            while(choix!=3) {
            	
	            if(choix==1) {
	            	System.out.print( "Entrez un nombre supérieur à 0 a stocker dans le tableau : " );
	                int nouveauNb = scanner.nextInt();
	                
	                tab = push(tab,nouveauNb);
	                	
	                
	                System.out.println("\n");
	                System.out.println("Choisissez parmis ces deux options en tapant 1 ou 2:\n");
	        		System.out.println("1. Ajouter un nombre \n");
	        		System.out.println("2. Afficher les nombres existants \n");
	        		System.out.println("3. Quitter \n");
	        		
	        		System.out.print( "Votre choix : " );
	                choix = scanner.nextInt();
	            }
	            
	            if(choix==2) {
	            	for(int i = 0; i<tab.length; i++) {
	            		System.out.print(tab[i] + " ");
	            	}
	            	System.out.println("\n");
	                System.out.println("Choisissez parmis ces deux options en tapant 1 ou 2:\n");
	        		System.out.println("1. Ajouter un nombre \n");
	        		System.out.println("2. Afficher les nombres existants \n");
	        		System.out.println("3. Quitter \n");
	        		
	        		System.out.print( "Votre choix : " );
	                choix = scanner.nextInt();
	            }
	            
            }
            
    		System.out.println("À bientôt!");
            
		}

	}
	
	public static int[] push(int[] array, int elem) {
		int[] arrayCopy = new int[array.length+1];
		
		for (int i = 0; i < array.length; i++) {
			arrayCopy[i] = array[i];
		}
		
		arrayCopy[arrayCopy.length-1] = elem;
		return arrayCopy;
	}

}
