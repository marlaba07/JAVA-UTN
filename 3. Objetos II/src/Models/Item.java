package Models;

import javax.xml.namespace.QName;
import java.util.UUID;

public class Item {
    private UUID id;
    private String name;
    private String description;
    private Integer price;
    private Integer count;

    public Item(String name, String description, Integer price, Integer count) {
        this.id =  UUID.randomUUID();
        this.name = name;
        this.description = description;
        this.price = price;
        this.count = count;
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public Integer getPrice() {
        return price;
    }

    public Integer getCount() {
        return count;
    }

    public Integer getTotal(){
        return price * count;
    }

    @Override
    public String toString(){
        return "[ " +
                "id= " + getId() +
                ", nombreProducto= " + getName() +
                ", descripcion= " + getDescription() +
                ", precio= " + getPrice() +
                " ]";
    }
}
