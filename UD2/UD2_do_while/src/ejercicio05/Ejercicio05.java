/*Realiza un programa donde el usuario "piensa" un número del 1 al 100 y el ordenador intenta adivinarlo. 
 * Es decir, el ordenador irá proponiendo números una y otra vez hasta adivinarlo (el usuario deberá indicarle al ordenador si es mayor, 
 * menor o igual al número que ha pensado).*/
package ejercicio05;

import java.util.*;

public class Ejercicio05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("dame un numero: ");

		Integer numero = sc.nextInt();
		// Creamos las variables max y min para que el random sepa hasta que rango coger
		// numero
		Integer min = 1;
		Integer max = 100;
		// numeroAleatorio es donde se almacena el numero Randoms
		Integer numeroAleatorio = null;

		do {
			// Genera un número aleatorio entre min y max
			numeroAleatorio = (int) (Math.random() * (max - min + 1)) + min;

			System.out.println("Tu numero es mayor(M), menor(m) o igual(i) a este numero : " + numeroAleatorio);

			// System.out.println("el numero max es " + max + " y el min ahora es " + min );

			String valor = sc.next();

			if (valor.equals("M")) {
				// Si es mayor, descartamos el número actual sumándole 1 al mínimo
				min = numeroAleatorio + 1;
			} else if (valor.equals("m")) {
				// Si es menor, descartamos el número actual restandole 1 al maximo

				max = numeroAleatorio - 1;
			}

		} while (numeroAleatorio != numero);

		System.out.println("Tu numero es : " + numeroAleatorio);

	}

}
