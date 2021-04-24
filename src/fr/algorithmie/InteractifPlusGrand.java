package fr.algorithmie;

import java.util.Scanner;

public class InteractifPlusGrand {

	public static void main(String[] args) {
		int valMax=0;
		try ( Scanner scanner = new Scanner( System.in ) ) {
			
            int[] tab = new int[11];
            
            System.out.println("Nous allons vous demander de rentrer 10 entiers \n");
            for (int i=1; i <= 10; i++) {
                System.out.print( "Veuillez saisir un entier : " );
                int a = scanner.nextInt(); 
                tab[i]=a;
                if(a>valMax) {
                	valMax=a;
                }
                
            }
            
            for(int i = 1; i< tab.length; i++){
                System.out.print(tab[i] + " ");
            }
            
            
            
        }
		System.out.println("\nLa valeur la plus grande dans le tableaux est : "+ valMax);
	}

}
