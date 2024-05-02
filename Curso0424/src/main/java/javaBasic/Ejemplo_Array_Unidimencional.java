package javaBasic;

public class Ejemplo_Array_Unidimencional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int intArray[];
		
		//declarar array en string

		String[] arr;
		
		//asignar memoria para 5 strings
		arr =new String [5];
		
		arr[0]= "cero";
		arr[1]= "uno";
		arr[2]= "dos";
		arr[3]= "tres";
		arr[4]= "cuatro";
		
		// imprimir 1 elemento del array System.out.println(arr[2]);
		
		// acceder a todos los elemnetos de un array
		
		for (int i=0; i < arr.length; i++ ) {
			System.out.println("Elemento en el indice : " +i + " : " + arr[i]);
			
		}
		
		
	}

}
