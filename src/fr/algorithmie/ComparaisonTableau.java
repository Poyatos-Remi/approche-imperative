package fr.algorithmie;

public class ComparaisonTableau {

	public static void main(String[] args) {
		
		int[] array = {1,15,-3,0,8,7,4,-2,28,7,-1,17,2,3,0,14,-4};
		int[] array2 = {3,-8,17,5,-1,4,0,6,2,11,-5,-4,8};
		int elemCommun=0;
		
		for(int i = 0; i<= array.length-1; i++) {
			for (int a=0; a<=array2.length-1; a++) {
				
			
			if(i>array2.length-1) {
				break;
			}
			else{
				if(array[i]==array2[a]) {
					elemCommun=elemCommun+1;
				}
			}
			
		}						
	}
		System.out.println(elemCommun);
	}
}
