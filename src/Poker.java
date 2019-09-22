import java.util.ArrayList;

public class Poker {
	Francesa baraja;
	ArrayList<Jugador> jugador = new ArrayList<Jugador> ();
	
	// CONSTRUCTOR
	public Poker(Francesa baraja, ArrayList<Jugador> jugador) {		// Francesa baraja, ArrayList<Jugador> jugador
		super();
		this.baraja = baraja;
		this.jugador = jugador;
		if (jugador.size() < 2)
			System.out.println("Jugadores insuficientes. Se requieren m�s de dos.");
		else baraja.reiniciar(); // Se inicia la baraja.
	}
	
	// M�TODOS
	void addJugador(Jugador j) {
		jugador.add(j);
	}
}
