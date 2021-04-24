package fr.algorithmie;

import java.util.Scanner;

public class InteractifStockageNombre {

	public static void main(String[] args) {
		
		int longueurTab=4;
		int[] tab = new int[longueurTab];
		
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
	                for(int i = 0; i<tab.length-1; i++) {	                	
	                	
	                	if(tab[i]!=0) {
	                		continue;
	                	} else {
	                		tab[i]=nouveauNb;
	                		break;
	                	}
	                	
	                }
	                System.out.println("\n");
	                System.out.println("Choisissez parmis ces deux options en tapant 1 ou 2:\n");
	        		System.out.println("1. Ajouter un nombre \n");
	        		System.out.println("2. Afficher les nombres existants \n");
	        		System.out.println("3. Quitter \n");
	        		
	        		System.out.print( "Votre choix : " );
	                choix = scanner.nextInt();
	            }
	            
	            if(choix==2) {
	            	for(int i = 0; i<tab.length-1; i++) {
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

}
