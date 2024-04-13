package Models;

import java.util.UUID;
import java.time.LocalDateTime;

public class Factura {
    private UUID id;
    private Double totalAmount;
    private LocalDateTime date;
    private Cliente client;

    public Factura(UUID id, Double totalAmount, Cliente client) {
        this.id = id;
        this.totalAmount = totalAmount;
        this.date = LocalDateTime.now();;
        this.client = client;
    }

    public Double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(Double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public Cliente getClient() {
        return client;
    }

    public UUID getId() {
        return id;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public Double calculateDiscount(){
        double discount = getTotalAmount() * (client.getPercentage() / 100.0);
        return getTotalAmount() - discount;
    }

    @Override
    public String toString(){
        return "Factura [ " +
                "id= " + getId() +
                ", monto total= " + getTotalAmount() +
                ", fecha factura= " + getDate() +
                ", cliente= " + getClient() +
                " ]";
    }
}
