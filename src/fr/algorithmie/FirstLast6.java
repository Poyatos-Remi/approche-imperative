package fr.algorithmie;

public class FirstLast6 {

	public static void main(String[] args) {
		
		int[] tableaux = {6,0,2,4};
		boolean bool = true;
		
		for (int i = 0; i< tableaux.length-1; i++) {
			if((tableaux.length>1) && (tableaux[0]==6) || (tableaux[tableaux.length-1]==6)) {
				bool = true;
			}
			else {
				bool=false;
			}
		}
		
		System.out.println(bool);

	}

}
