package Models;
import java.util.List;

public class Player extends Team {
    private String name;
    private Integer age;
    private Integer DNI;
    private String position;
    private Double height;
    private Team sourceTeam;
    private Tournament sourceTournament;

    public Player(String name, List<Team> teams, String name1, List<Player> players, String name2, Integer age, Integer DNI, String position, Double height, Team sourceTeam, Tournament sourceTournament) {
        super(name, teams, name1, players);
        this.name = name2;
        this.age = age;
        this.DNI = DNI;
        this.position = position;
        this.height = height;
        this.sourceTeam = sourceTeam;
        this.sourceTournament = sourceTournament;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getDNI() {
        return DNI;
    }

    public void setDNI(Integer DNI) {
        this.DNI = DNI;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public Team getSourceTeam() {
        return sourceTeam;
    }

    public void setSourceTeam(Team sourceTeam) {
        this.sourceTeam = sourceTeam;
    }

    public Tournament getSourceTournament() {
        return sourceTournament;
    }

    public void setSourceTournament(Tournament sourceTournament) {
        this.sourceTournament = sourceTournament;
    }

}
