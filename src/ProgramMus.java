import java.util.ArrayList;
import java.util.Scanner;

public class ProgramMus {
	public static void main(String args[]) {
		
		// VARIABLES
		Scanner sc = new Scanner(System.in);
		ArrayList<Jugador> jugador = new ArrayList<Jugador>();
		ArrayList<Carta> cartas = new ArrayList<Carta>();
		
		Espanyola baraja_espanyola;
		baraja_espanyola = new Espanyola(cartas);
		Mus mus;
		mus = new Mus(baraja_espanyola, jugador);
		
		Jugador jug1, jug2, jug3, jug4;
		jug1 = new Jugador();
		jug2 = new Jugador();
		jug3 = new Jugador();
		jug4 = new Jugador();
		
		System.out.println("--- JUEGO MUS ---");
		System.out.print("Introduce nombre jugador 1: ");
		jug1.setNombre(sc.next());
		mus.addJugador(jug1);
		System.out.print("Introduce nombre jugador 2: ");
		jug2.setNombre(sc.next());
		mus.addJugador(jug2);
		System.out.print("Introduce nombre jugador 3: ");
		jug3.setNombre(sc.next());
		mus.addJugador(jug3);
		System.out.print("Introduce nombre jugador 4: ");
		jug4.setNombre(sc.next());
		mus.addJugador(jug4);
		sc.close();
		System.out.println("-----------------------------------------------------");
	}
}
