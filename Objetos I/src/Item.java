public class Item {
    private Integer ID;
    private String  description;
    private Integer amount;
    private Integer unitPrice;
    private Integer totalPrice;

    public Item(Integer ID, String description, Integer amount, Integer unitPrice) {
        this.ID = ID;
        this.description = description;
        this.amount = amount;
        this.unitPrice = unitPrice;
        this.totalPrice = unitPrice * amount;
    }

    public Integer getID() {
        return ID;
    }

    public String getDescription() {
        return description;
    }

    public Integer getAmount() {
        return amount;
    }

    public Integer getUnitPrice() {
        return unitPrice;
    }

    public String showItem(Item item) {
        return " ItemVenta ["  +
                " ID = " + item.getID() +
                ", Descripcion = " + item.getDescription() +
                ", Cantidad = " + item.getAmount() +
                ", pUnitario = " + item.getUnitPrice() +
                ", pTotal = " + item.totalPrice +
                " ] " ;
    }
}

