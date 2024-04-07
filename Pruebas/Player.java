package Models;

import java.util.Objects;

public class Player {
    String name;
    Integer age;
    Integer tshirt;
    Position position;

    public Player(String name, Integer age, Integer tshirt, Position position) {
        this.name = name;
        this.age = age;
        this.tshirt = tshirt;
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getTshirt() {
        return tshirt;
    }

    public void setTshirt(Integer tshirt) {
        this.tshirt = tshirt;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Player player = (Player) o;
        return Objects.equals(name, player.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    public static boolean test(){
        return true;
    }
}


