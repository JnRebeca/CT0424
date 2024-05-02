package javaBasic;

public class Ejemplo_Ciclo_DoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int b=10;
		
		do { // el codigo dentro del do se imprime incluso si la condicion es falsa
			System.out.println("el valor de B es:"+b);
			b++;
		} while (b<=20);
	}

}
