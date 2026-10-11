package ejercicio04;

import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		Integer suma = 0;

		for (int i = 1; i <= 2; i++) {
			System.out.print("¿Cuánto has sacado en la tirada? (UNO, DOS, TRES, CUATRO, CINCO o SEIS): ");
			// Convertimos a mayúsculas para evitar errores si el usuario escribe en minúsculas
			String tirada1 = scanner.nextLine().toUpperCase();
			
			switch (tirada1) {
			case "UNO":
				suma += 1;
				break;
			case "DOS":
				suma += 2;
				break;
			case "TRES":
				suma += 3;
				break;
			case "CUATRO":
				suma += 4;
				break;
			case "CINCO":
				suma += 5;
				break;
			case "SEIS":
				suma += 6;
				break;
			default:
				System.out.println("Valor no reconocido. No se sumará nada en esta tirada.");
				break;
			}
		}
		
		// Mostramos el resultado final fuera del bucle
		System.out.println("La suma total de los dados es: " + suma);
		
		scanner.close();
	}
}
