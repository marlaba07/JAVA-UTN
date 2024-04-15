package Models;

import java.util.UUID;

public class Titular {
    private UUID id;
    private String name;
    private char gender;

    public Titular(String name, char gender) {
        this.id = UUID.randomUUID();
        this.name = name;
        this.gender = gender;
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public char getGender() {
        return gender;
    }

    @Override
    public String toString(){
        return "[ " +
                "id= " + getId() +
                ", Cliente= " + getName() +
                ", Genero= " + getGender() +
                " ]";
    }
}
