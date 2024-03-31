public class Banco {
    private Integer ID;
    private String name;
    private Double balance;

    public Banco(Integer ID, String name, Double balance) {
        this.ID = ID;
        this.name = name;
        this.balance = balance;
    }

    public Integer getID() {
        return ID;
    }
    public String getName() {
        return name;
    }
    public Double getBalance() {
        return balance;
    }
    public Double credito(Double deposito) {
        this.balance += deposito;
        return this.balance;
    }

    public Double debito(Double sustraccion) {
        if(this.balance >= sustraccion) {
            this.balance -= sustraccion;
        } else {
            System.out.println("El dinero de la cuenta no es suficiente para cubrir la sustracción de: " + sustraccion);
        }

        return this.balance;
    }

    public String showCuenta(Banco banco) {
        return " Cuenta ["  +
                " ID = " + banco.getID() +
                ", Nombre = " + banco.getName() +
                ", Balance = " + banco.getBalance() +
                " ] " ;
    }


}
