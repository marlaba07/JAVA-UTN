public class Person {
    private integer dni;
    public string name;

    // Tambien se puede generar constructor vacio
    // public Person(){}
    public Person(integer dni, string name){
        this.dni = dni;
        this.name = name;
    }

    public integer getDni(){
        return dni;
    }
    public string getName(){
        return name;
    }
    public void setDni(integer dni){
        this.dni = dni;
    }
    public void setName(string name){
        this.name = name;
    }

    // Click derecho clase > Generate > Generador de setter, getters, etc.
}
