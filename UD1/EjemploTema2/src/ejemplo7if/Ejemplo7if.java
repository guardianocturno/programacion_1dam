package ejemplo7if;

import java.util.*;

public class Ejemplo7if {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String jugador_1 = "piedra";
		String jugador_2 = "tijeras";

		if (jugador_1 == "piedra" && jugador_2 == "papel") {

			System.out.println("ganador jugador_2");

		} else if (jugador_1 == "piedra" && jugador_2 == "tijeras") {

			System.out.println("ganador jugador_1");

		} else if (jugador_1 == "piedra" && jugador_2 == "piedra") {

			System.out.println("empate ");

		} else if (jugador_2 == "piedra" && jugador_1 == "papel") {

			System.out.println("ganador jugador_2");

		} else if (jugador_2 == "piedra" && jugador_1 == "tijeras") {

			System.out.println("ganador jugador_1");
		}

	}

}
