package Models;

public class Autor {

    private String name;
    private String lastname;
    private String email;
    private String gender;

    public Autor(String name, String lastname, String email, String gender) {
        this.name = name;
        this.lastname = lastname;
        this.email = email;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return  "  Autor {" +
                "  nombre='"   + name     + '\'' +
                ", apellido='" + lastname + '\'' +
                ", email='"    + email    + '\'' +
                ", genero="    + gender   +
                '}';
    }
}
