package ejercicio09;

import java.util.Scanner;

public class Ejercicio09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce tu edad: ");
        int edad = sc.nextInt();

        boolean mayorDeEdad = edad >= 18;

        System.out.println(mayorDeEdad);
    }
}
