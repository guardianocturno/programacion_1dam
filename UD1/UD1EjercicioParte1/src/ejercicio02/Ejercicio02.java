package ejercicio02;

import java.util.Scanner;

public class Ejercicio02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce tu edad: ");
        int edad = sc.nextInt();

        System.out.println("El próximo año tendrás " + (edad + 1) + " años.");
    }
}
