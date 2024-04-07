import Models.Player;
import Models.Position;
import Models.Team;

import java.util.ArrayList;

public class Main2 {
    public static void main(String[] args) {
         Player jugadorMariano = new Player("Mariano", 24, 7, Position.Alero);
         Player jugadorSantiago = new Player("Santiago", 25, 8, Position.Escolta);
         Player jugadorMiqueas = new Player("Miqueas", 18, 4, Position.Base);

        ArrayList<Player> listaJugadores = new ArrayList<>();

        listaJugadores.add(jugadorMiqueas);
        listaJugadores.add(jugadorSantiago);
        listaJugadores.add(jugadorMariano);

        Team manada = new Team("La Manada Basquet", listaJugadores);

        manada.getPlayersUpper18();

        Player.test();

    }
}
