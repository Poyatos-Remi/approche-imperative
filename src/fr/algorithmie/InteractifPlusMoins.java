package fr.algorithmie;

import java.util.Random;
import java.util.Scanner;

public class InteractifPlusMoins {

	public static void main(String[] args) {
		
		int min = 1;
		int max = 100;
		int nbTentative=1;

		Random random = new Random();

		int value = random.nextInt(max - min) + min;
		

			try ( Scanner scanner = new Scanner( System.in ) ) {
				
	            
	                System.out.print( "Veuillez saisir un entier : " );
	                int a = scanner.nextInt();
	                
	                while(a!=value) {
	                	
	                	if(a<value) {
	                		System.out.println("Vous êtes en dessous");
	                		nbTentative++;
	                	}
	                	
	                	if(a>value) {
	                		System.out.println("Vous êtes au dessus");
	                		nbTentative++;
	                	}
	                	
	                	System.out.print( "Veuillez saisir un entier : " );
		                a = scanner.nextInt();
	                }
	                
	                if(a==value) {
	                	System.out.println("Bravo vous avez trouvé " + value + " en "+ nbTentative+ " coups !");
	                }
	        }
		
	}

}
