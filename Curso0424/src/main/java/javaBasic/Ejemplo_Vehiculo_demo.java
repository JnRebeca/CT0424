package javaBasic;

public class Ejemplo_Vehiculo_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ejemplo_Vehiculo minivan = new Ejemplo_Vehiculo();
		
		int rango;
		
		//asignar valor a las variables de minivan
		minivan.pasajeros=9;
		minivan.capacidad=15;
		minivan.kmh=20;
		
		//calcular el rango asumiendo un tanque lleno
		rango=minivan.capacidad*minivan.kmh;
		
		System.out.println("La minivan puede llevar " +minivan.pasajeros +" pasajeros con un rango de " +rango + " kilometros");
	

		Ejemplo_Vehiculo carro=new Ejemplo_Vehiculo();
		carro.pasajeros=4;
		System.out.println("Numeros en pasajeros en carro es " +carro.pasajeros );
		
	}

}
