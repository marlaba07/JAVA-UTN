public class Empleado {
    private String name;
    private String lastName;
    private Integer dni;
    private Double salario;

    public Empleado(String name, String lastname, Integer dni, double salario){
        this.name = name;
        this.lastName = lastname;
        this.dni = dni;
        this.salario = salario;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public Integer getDni() {
        return dni;
    }
    public Double getSalario() {
        return salario;
    }

    public double calculateSalaryEmployee(Double salary){
        double salaryYear = salary * 12;
        return salaryYear;
    }

    public void increaseSalary(Double percentage){
        this.salario = this.salario + (this.salario * (percentage / 100));
    }

    public void showEmployee(Empleado empleado) {
        System.out.println("Empleado: DNI = " + empleado.getDni() + ", NOMBRE = " + empleado.getName() + ", APELLIDO = " + empleado.getLastName() + ", SALARIO = " + empleado.getSalario());
    }
}

