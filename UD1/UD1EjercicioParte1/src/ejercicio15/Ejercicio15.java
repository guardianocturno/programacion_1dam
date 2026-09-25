package ejercicio15;

import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final double IVA = 21;

        System.out.print("Introduce el precio: ");
        double precio = sc.nextDouble();

        double precioFinal = precio + (precio * IVA / 100);

        System.out.println("Precio final con IVA: " + precioFinal + " €");
    }
}
