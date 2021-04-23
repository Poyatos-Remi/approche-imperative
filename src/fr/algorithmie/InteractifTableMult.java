package fr.algorithmie;

import java.util.Scanner;

public class InteractifTableMult {

	public static void main(String[] args) {
		
		try ( Scanner scanner = new Scanner( System.in ) ) {
            
            System.out.print( "Veuillez saisir un entier entre 1 et 10: " );
            int a = scanner.nextInt();
            
            while((a<1)||(a>10)) {
	            System.out.print( "Veuillez recommencer, vous devez saisir un nombre entier entre 1 et 10 : " );
	             a = scanner.nextInt();
            }
            
            System.out.printf( "La table de multiplication de " + a + " est : \n" );
            
            for (int i=1; i <= 10; i++) {
            	int nb = a*i;
            	System.out.println(a + "x" + i +" est égal à : "+ nb);
            }
            
        }

	}

}
