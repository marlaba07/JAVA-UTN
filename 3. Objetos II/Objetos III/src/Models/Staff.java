package Models;

public class Staff extends Persona {
    private Double salary;
    private String shift;

    public Staff(){}
    public Staff(Double salary, String shift) {
        this.salary = salary;
        this.shift = shift;
    }
    public Staff(Integer DNI, String name, String lastName, String email, String direction, Double salary, String shift) {
        super(DNI, name, lastName, email, direction);
        this.salary = salary;
        this.shift = shift;
    }

    public Double CalculateAnnualSalary(){
        return this.salary * 12;
    }

    @Override
    public String toString(){
        return "Staff[ " +
                "Salario: " + salary +
                "Turno: " + shift +
                " ]";
    }
}
