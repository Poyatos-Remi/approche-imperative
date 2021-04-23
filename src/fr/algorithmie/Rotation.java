package fr.algorithmie;

public class Rotation {

	public static void main(String[] args) {
		

        int [] arr = {0, 1, 2, 3};

        int nbrotation = 1;


        System.out.println("Tableau de base: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }


        for(int i = 0; i < nbrotation; i++){

            int last = arr[arr.length-1];

            for(int j = arr.length-1; j > 0; j--){

                arr[j] = arr[j-1];
            }

            arr[0] = last;
        }

        System.out.println();


        System.out.println("Notre tableau après rotation: ");
        for(int i = 0; i< arr.length; i++){
            System.out.print(arr[i] + " ");
        }
		
	}

}
