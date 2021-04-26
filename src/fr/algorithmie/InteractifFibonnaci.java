package fr.algorithmie;

import java.util.Scanner;

public class InteractifFibonnaci {

	public static void main(String[] args) {
				
		try ( Scanner scanner = new Scanner( System.in ) ) {
            
            System.out.print( "Veuillez saisir un rang : " );
            int n = scanner.nextInt();
            
            if (n == 1)
                System.out.println("F1 : " + 1);
            
            else if (n == 2)
                System.out.println("F2 : " + 1);
            else {
                int fImoins1 = 1;  // u1
                int fI = 2;        // u2
                for (int i =3; i < n; i++) {
                    int temp = fI;
                    fI = fI + fImoins1;                    
                    fImoins1 = temp;
                }
                
                System.out.printf("F" +  n + " = " + fI);
            }
            
        }

	}

}
