package ejercicio03;

import java.util.Scanner;

public class Ejercicio03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el año actual: ");
        int actual = sc.nextInt();

        System.out.print("Introduce tu año de nacimiento: ");
        int nacimiento = sc.nextInt();

        int edad = actual - nacimiento;

        System.out.println("Tu edad es: " + edad);
    }
}
