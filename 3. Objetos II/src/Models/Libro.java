package Models;

public class Libro extends Autor {
    private String tittle;
    private Double price;
    private Integer stock;

    public Libro(String tittle, Double price, Integer stock, String name, String lastname, String email, String gender) {
        super(name, lastname, email, gender);
        this.tittle = tittle;
        this.price = price;
        this.stock = stock;
    }

    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }



}
