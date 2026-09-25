package ejercicio11;

import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el valor en pesetas: ");
        double pesetas = sc.nextDouble();

        double euros = pesetas / 166;

        System.out.println("Euros: " + euros);
    }
}
