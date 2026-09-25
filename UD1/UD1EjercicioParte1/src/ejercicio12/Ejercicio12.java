package ejercicio12;

import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce los kilos de manzanas: ");
        double manzanas = sc.nextDouble();

        System.out.print("Introduce los kilos de peras: ");
        double peras = sc.nextDouble();

        double total = manzanas * 2.35 + peras * 1.95;

        System.out.println("Importe total: " + total + " €");
    }
}
