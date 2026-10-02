package ejercicio11;

import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce tu edad: ");
        int edad = sc.nextInt();

        System.out.print("¿Tienes permiso de conducir? (true/false): ");
        boolean permiso = sc.nextBoolean();

        System.out.print("¿Tienes una sanción que te impide conducir? (true/false): ");
        boolean sancion = sc.nextBoolean();

        boolean puedeAlquilar = edad >= 18 && permiso && !sancion;

        System.out.println(puedeAlquilar);
    }
}
