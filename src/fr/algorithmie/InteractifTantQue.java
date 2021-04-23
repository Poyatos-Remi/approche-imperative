package fr.algorithmie;

import java.util.Scanner;

public class InteractifTantQue {


	public static void main(String[] args) {

		try ( Scanner scanner = new Scanner( System.in ) ) {
            
            System.out.print( "Veuillez saisir un entier entre 1 et 10: " );
            int a = scanner.nextInt();
            
            while((a<1)||(a>10)) {
	            System.out.print( "Veuillez recommencer, vous devez saisir un nombre entier entre 1 et 10 : " );
	             a = scanner.nextInt();
            }
            
            System.out.printf( "Le chiffre :" + a );
            
        }

	}

}
