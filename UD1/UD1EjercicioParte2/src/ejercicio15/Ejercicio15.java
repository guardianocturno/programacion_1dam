package ejercicio15;

import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce a: ");
        int a = sc.nextInt();

        System.out.print("Introduce b: ");
        int b = sc.nextInt();

        System.out.print("Introduce c: ");
        int c = sc.nextInt();

        int resultado1 = a + b * c;
        int resultado2 = (a + b) * c;

        System.out.println("a + b * c = " + resultado1);
        System.out.println("(a + b) * c = " + resultado2);

        // La multiplicación tiene prioridad sobre la suma.
        // Los paréntesis cambian el orden de las operaciones.
    }
}
