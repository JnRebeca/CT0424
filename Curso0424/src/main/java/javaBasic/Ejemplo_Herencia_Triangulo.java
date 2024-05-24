package javaBasic;

public class Ejemplo_Herencia_Triangulo extends Ejemplo_Herencia_2D{
	
	String estilo;
	double area () {
		return base*altura/2;
	}
	
	void mostrarEstilo () {
		System.out.println("El tringulo es " +estilo);
		
	}

}
