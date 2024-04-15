package Models;

import java.util.UUID;

public class Cuenta {
    private static final int MAX_OPS = 10;

    private UUID id;
    private Double balance;
    private Titular client;
    private int contador = 0;

    private String operaciones[] = new String[MAX_OPS];


    public Cuenta(Double balance, Titular client) {
        this.id = UUID.randomUUID();
        this.balance = balance;
        this.client = client;
    }

    public UUID getId() {
        return id;
    }

    public Double getBalance() {
        return balance;
    }

    public Titular getClient() {
        return client;
    }

    public Double deposit(Double value){
        registerDeposit(value);
        return this.balance += value;
    }

    public String[] getOperaciones() {
        return operaciones;
    }

    public Double extract(Double value){
        double tempBalance = this.balance - value;

        if(tempBalance >= -2000){
            this.balance -= value;
            registerExtract(value);
        } else {
            System.out.println("La cuenta no posee saldo suficiente. ");
        }

        return this.balance;
    }

    public void registerDeposit(Double value){
        if (this.contador == MAX_OPS) {
            this.contador = 0;
        }

        operaciones[contador] = "El cliente " + client.getName() + " depositó " + value;
        this.contador++;
    }

    public void registerExtract(Double value){
        if(this.contador == MAX_OPS){
            this.contador = 0;
        }

        operaciones[contador] = "El cliente " + client.getName() + " retiró " + value;
        this.contador++;
    }

    @Override
    public String toString(){
        return "[ " +
                "id= " + getId() +
                ", Balance= " + getBalance() +
                ", Cliente= " + getClient() +
                " ]";
    }
}
