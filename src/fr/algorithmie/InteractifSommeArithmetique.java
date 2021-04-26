package fr.algorithmie;

import java.util.Scanner;

public class InteractifSommeArithmetique {

	public static void main(String[] args) {
		int somme = 0;
		int i = 0;
		try ( Scanner scanner = new Scanner( System.in ) ) {
            
            System.out.print( "Veuillez saisir un entier : " );
            int a = scanner.nextInt();
            
            
            System.out.printf( "La somme arithmetique de tous les entiers compris de 1 à " + a + " est égale à : " );
            
            while ( i <= a) {
            	somme=somme+i;
            	i++;
            }
            System.out.println(somme);
            
        }

	}

}
