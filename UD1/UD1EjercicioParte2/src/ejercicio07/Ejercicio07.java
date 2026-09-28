package ejercicio07;

// Utiliza la clase Random para generar y mostrar tres valores: un número entero aleatorio entre 1 y 100, un número real aleatorio y un valor booleano aleatorio (true o false)

import java.util.*;

public class Ejercicio07 {

	public static void main(String[] args) {
	// Se utiliza (int) para obligarlo a que sea un int, (Math.random()*101) se pone a 101 para que el ramdon sea hasta 100
	int numero=(int) (Math.random()*101);

	System.out.println(numero);
	// Al no utiliza (int) para obligarlo a que sea un int el numero sera decimal.
	double numero2= Math.random()*101;

	System.out.println(numero2);
    // el <0.5 sirve para que de un true o false
	boolean numero3= Math.random() < 0.5;

	System.out.println(numero3);
	
	}

}
