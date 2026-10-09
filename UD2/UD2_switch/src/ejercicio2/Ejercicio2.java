package ejercicio2;

import java.util.*;

public class Ejercicio2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Integer dia = sc.nextInt();

		switch (dia) {
		case 1:
			System.out.println("lunes ");
			break;

		case 2:
			System.out.println("martes ");
			break;

		case 3:
			System.out.println("miercoles ");
			break;

		case 4:

			System.out.println("jueve ");
			break;

		case 5:
			System.out.println("viernes ");
			break;

		case 6:
			System.out.println("sabado ");
			break;

		case 7:
			System.out.println("domingo ");
			break;

		}

	}
}