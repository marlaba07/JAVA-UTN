package Models;

public class Persona {
    private Integer DNI;
    private String name;
    private String lastName;
    private String email;
    private String direction;

    public Persona(){}
    public Persona(Integer DNI, String name, String lastName, String email, String direction) {
        this.DNI = DNI;
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.direction = direction;
    }

    public Integer getDNI() {
        return DNI;
    }

    public void setDNI(Integer DNI) {
        this.DNI = DNI;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }
}
