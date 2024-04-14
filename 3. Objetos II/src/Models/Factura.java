package Models;

import java.util.ArrayList;
import java.util.UUID;
import java.time.LocalDateTime;

public class Factura {
    private UUID id;
    private LocalDateTime date;
    private Cliente client;
    private ArrayList<Item> items;


    public Factura(Cliente client, ArrayList<Item> item) {
        this.id = UUID.randomUUID();
        this.date = LocalDateTime.now();
        this.client = client;
        this.items = item;
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

    public ArrayList<Item> getItem() {
        return items;
    }

    public Double calculateDiscount(){
        double discount = 0.0;
        for(Item item : items) {
            if (item != null) {
                discount += item.getTotal();
            }
        }

        return discount - (discount * (client.getPercentage() / 100));
    }

    @Override
    public String toString() {
        return "Factura [ " +
                "id= " + getId() +
                ", fecha factura= " + getDate() +
                ", monto total= " + calculateDiscount() +
                ", cliente= " + getClient() +
                ", item= " + getItem() +
                " ]";
    }
}
