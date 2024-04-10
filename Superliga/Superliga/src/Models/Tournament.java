package Models;

import java.util.List;


public class Tournament {
    private String name;
    private List<Team> teams;

    public Tournament(String name, List<Team> teams) {
        this.name = name;
        this.teams= teams;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Team> getTeam() {
        return teams;
    }

    public void setTeam(List<Team> team) {
        this.teams = team;
    }

    public void addTeam(Team team){
        if (teams.contains(team)) {
            teams.add(team);
        } else {
            System.out.println("El equipo ya existe.");
        }
    }

    public void deleteTeam(Team team){
        if (teams.contains(team)) {
            teams.remove(team);
        } else {
            System.out.println("El equipo no existe.");
        }
    }

}
