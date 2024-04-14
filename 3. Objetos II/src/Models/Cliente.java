package Models;
import java.util.UUID;

public class Cliente {
    private UUID id;
    private String name;
    private String email;
    private Integer percentage;

    public Cliente(String name, String email, Integer percentage) {
        this.id =  UUID.randomUUID();
        this.name = name;
        this.email = email;
        this.percentage = percentage;
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public Integer getPercentage() {
        return percentage;
    }

    @Override
    public String toString(){
        return " [ " +
                "id= " + getId() +
                ", nombre= " + getName() +
                ", email= " + getEmail() +
                ", descuento= " + getPercentage() +
                " ]";
    }
}
