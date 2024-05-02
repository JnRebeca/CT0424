package javaBasic;

public class Ejemplo_Array_Bidimensional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int arr[][]= {{2,7,9},{3,6,1},{7,4,2}};
		 
		// System.out.println(arr[0][1]);
		 
		 for (int i=0; i<3; i++ ) {
			 for (int j=0; j<3 ;  j++) {
				 
				 System.out.print(arr[i][j] + " "); // print sin ln para imprimir en la misma linea
				 
			 }
			 System.out.println(); //saltamos a la siguiente linea

			 
		 }
	}

}
