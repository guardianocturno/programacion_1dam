package ejercicio06;
import java.util.*;

public class Ejercicio06 {

	public static void main(String[] args) {
		// Pedir 5 calificaciones de alumnos y decir al final si hay algún suspenso.

		Scanner sc = new Scanner(System.in);
		Boolean algunSuspenso=false;
		for (int i = 1; i <= 5; i++) {
			System.out.print("Dame la nota: ");
			
			Integer nota=sc.nextInt();
			
			if (nota<5) {
				algunSuspenso=true;
				break;
			}
		}
		
		System.out.println("¿¿hay algun suspenso??----> " + algunSuspenso);
		sc.close();

	}

}
