import java.util.ArrayList;
import java.util.Scanner;

public class ProgramPoker {
	public static void main(String args[]) {
		
		// VARIABLES
		Scanner sc = new Scanner(System.in);
		ArrayList<Jugador> jugador = new ArrayList<Jugador>();
		ArrayList<Carta> cartas = new ArrayList<Carta>();
		
		Francesa baraja_francesa;
		baraja_francesa = new Francesa(cartas);
		Poker poker;
		poker = new Poker(baraja_francesa, jugador);
		Jugador jug_poker;
		
		int num_jugadores;
		
		System.out.println("--- JUEGO POKER ---");
		System.out.print("Introduce número de jugadores: ");
		num_jugadores = sc.nextInt();
		for (int i = 0; i < num_jugadores; i++) {
			jug_poker = new Jugador();
			System.out.print("Introduce nombre jugador "+(i+1)+": ");
			jug_poker.setNombre(sc.next());
			poker.addJugador(jug_poker);
		}
		sc.close();
		System.out.println("-----------------------------------------------------");
	}
}
