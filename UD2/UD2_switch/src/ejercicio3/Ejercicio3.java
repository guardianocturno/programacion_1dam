package ejercicio3;
import java.util.Scanner;
public class Ejercicio3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        // Pedir los dos números al usuario
        System.out.print("Introduce el primer número: ");
        double numero1 = scanner.nextDouble();

        System.out.print("Introduce el segundo número: ");
        double numero2 = scanner.nextDouble();

        // Mostrar el menú
        System.out.println("\nMenú de opciones:");
        System.out.println("1. SUMAR LOS NÚMEROS");
        System.out.println("2. RESTAR LOS NÚMEROS");
        System.out.println("3. MULTIPLICAR LOS NÚMEROS");
        System.out.println("4. DIVIDIR LOS NÚMEROS");
        
        System.out.print("\nSelecciona una opción (1-4): ");
        int opcion = scanner.nextInt();

        // Realizar la operación basada en la opción elegida
        switch (opcion) {
            case 1:
                double suma = numero1 + numero2;
                System.out.println("El resultado de la suma es: " + suma);
                break;
            case 2:
                double resta = numero1 - numero2;
                System.out.println("El resultado de la resta es: " + resta);
                break;
            case 3:
                double multiplicacion = numero1 * numero2;
                System.out.println("El resultado de la multiplicación es: " + multiplicacion);
                break;
            case 4:
                // Controlar la división por cero
                if (numero2 != 0) {
                    double division = numero1 / numero2;
                    System.out.println("El resultado de la división es: " + division);
                } else {
                    System.out.println("Error: No se puede dividir entre cero.");
                }
                break;
            default:
                // Si elige una opción fuera de 1, 2, 3 o 4
                System.out.println("Opción incorrecta. El programa ha finalizado sin realizar ninguna operación.");
                break;
        }

	}

}
