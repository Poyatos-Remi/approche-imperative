package fr.algorithmie;

import java.util.Random;
import java.util.Scanner;

public class Interactif21Batons {

	public static void main(String[] args) {
		
		int nbBatons=21;
		int limite=3;
		int min = 1;
		char joueurActif='J'; // J pour le joueur, C pour l'ordinateur
		Scanner scanner = new Scanner( System.in );
		while(nbBatons>0) {
			
			if(joueurActif=='J') {

				System.out.println("\n");
	            System.out.print( "Veuillez saisir un nombre de batons à retirer entre 1 et 3: " );
	            int a = scanner.nextInt();
	            
	            while((a<1)||(a>limite)) {
		            System.out.print( "Veuillez recommencer, vous devez saisir un nombre entier entre 1 et 3 : " );
		             a = scanner.nextInt();
	            }	
	            nbBatons=nbBatons-a;
	            if (nbBatons<limite) {
					limite=nbBatons;
				}
		        
				
	            System.out.println( "il reste :" + nbBatons + " batons\n");
	            joueurActif='C';
	            continue;
			}
			
			if(joueurActif=='C') {
				System.out.println("\n");
				System.out.println("C'est au tour de l'ordinateur de jouer\n");
				Random random = new Random();
				int value = random.nextInt(limite - min+1)+min ;
				System.out.println("Il retire "+ value+ " batons\n");
				nbBatons=nbBatons-value;
				System.out.printf( "il reste :" + nbBatons + " batons\n" );
	            joueurActif='J';
			}
				
		}
		
		if (nbBatons==0 && joueurActif=='J') {
			System.out.println("Vous avez gagné");
		}else if(nbBatons==0 && joueurActif=='C'){
			System.out.println("Vous avez perdu");
		}

	}


}
