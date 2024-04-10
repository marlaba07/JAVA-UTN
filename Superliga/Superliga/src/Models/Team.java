package Models;
import java.util.List;

public class Team extends Tournament{
    private String name;
    private List<Player> players;

    public Team(String name, List<Team> teams, String name1, List<Player> players) {
        super(name, teams);
        this.name = name1;
        this.players = players;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    public void addPlayerToTeam(Player player){
        if (!players.contains(player)) {
            players.add(player);
        } else {
            System.out.println("El jugador ya está en la lista.");
        }
    }

    public void deletePlayerToTeam(Player player){
        if (players.contains(player)) {
            players.remove(player);
        } else {
            System.out.println("El jugador no está en la lista.");
        }
    }

}
