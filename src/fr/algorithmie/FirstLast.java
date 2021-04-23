package fr.algorithmie;

public class FirstLast {

	public static void main(String[] args) {
		
		int[] tableaux = {6,0,2,6};
		boolean bool = true;
		
		for (int i = 0; i< tableaux.length-1; i++) {
			if((tableaux.length>=1) && (tableaux[0]==tableaux[tableaux.length-1])) {
				bool = true;
			}
			else {
				bool=false;
			}
		}
		
		System.out.println(bool);

	}

}

