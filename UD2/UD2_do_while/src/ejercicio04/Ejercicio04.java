package ejercicio04;

import java.util.Scanner;

public class Ejercicio04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Integer numero = sc.nextInt();
		Integer multiplicador = 1;
		do {
			System.out.println(numero + " X " + multiplicador + " = " + (numero * multiplicador));
			multiplicador++;
		} while (multiplicador <= 10);
		sc.close();
	}

}
