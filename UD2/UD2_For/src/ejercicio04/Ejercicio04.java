package ejercicio04;

public class Ejercicio04 {

	public static void main(String[] args) {
		// 4. Diseñar un programa que muestre la suma de los 10 primeros números impares.
		int suma = 0;
		for (int i = 1; i < 20; i+=2) {
			
			suma+=i;	
		}

		System.out.println(suma);

	}

}
