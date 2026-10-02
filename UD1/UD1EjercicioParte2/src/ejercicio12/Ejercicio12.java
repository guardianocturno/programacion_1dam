package ejercicio12;

import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce tu edad: ");
        int edad = sc.nextInt();

        double precio = edad < 18 ? 6.50 : 9.50;

        System.out.println("Precio: " + precio + " €");
    }
}
