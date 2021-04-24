package fr.algorithmie;

import java.util.Scanner;

public class InteractifChiffresSuivants {

	public static void main(String[] args) {
		
		try ( Scanner scanner = new Scanner( System.in ) ) {
            
            System.out.print( "Veuillez saisir un entier : " );
            int a = scanner.nextInt();
            
            
            System.out.printf( "Les 10 nombres suivants " + a + " sont : \n" );
            
            for (int i=1; i <= 10; i++) {
            	int nb = a+i;
            	System.out.println(nb);
            }
            
        }

	}

}
