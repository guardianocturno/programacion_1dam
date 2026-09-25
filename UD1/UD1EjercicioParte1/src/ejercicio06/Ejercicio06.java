package ejercicio06;

import java.util.Scanner;

public class Ejercicio06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el primer número: ");
        double numero1 = sc.nextDouble();

        System.out.print("Introduce el segundo número: ");
        double numero2 = sc.nextDouble();

        System.out.println("Suma: " + (numero1 + numero2));
        System.out.println("Resta: " + (numero1 - numero2));
        System.out.println("Multiplicación: " + (numero1 * numero2));
        System.out.println("División: " + (numero1 / numero2));
    }
}
