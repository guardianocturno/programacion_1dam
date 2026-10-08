package ejercicio07;

import java.util.*;

public class Ejercicio07 {

	public static void main(String[] args) {
		// 7. Realiza un programa en java que pida un número entero positivo y nos diga
		// si es primo o no.
		Scanner sc = new Scanner(System.in);
		int numero = sc.nextInt();
		boolean primo = true;

		if (numero < 2) {
			primo = false;
		}

		for (int i = 2; i <= Math.sqrt(numero); i++) {
			if (numero % i == 0) {
				primo = false;
			}

		}
		System.out.println(primo);
		sc.close();
	}
}
