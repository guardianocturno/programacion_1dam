package ejercicio05;

import java.util.*;

public class Ejercicio05 {

	public static void main(String[] args) {
		/*
		 * Pedir un número y calcular su factorial. Por ejemplo, el factorial de 5 se
		 * denota 5! y es igual a 5x4x3x2x1 = 120.
		 */

		Scanner sc = new Scanner(System.in);
		
		System.out.print("dame un numero: ");
		Integer n = sc.nextInt();
		Integer x = 1;
		
		for (int i = 1; i <= n; i++) {
			x *= i;
		}
		
		System.out.println("El factoraial de " + n + "! es igual a " + x);
		
		sc.close();
	}

}
