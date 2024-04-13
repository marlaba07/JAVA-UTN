package Models;

import java.util.ArrayList;

public class Libro {
    private String tittle;
    private Double price;
    private Integer stock;
    private ArrayList<String> autor;

    public Libro(String tittle, Double price, Integer stock, ArrayList<String> autor) {
        this.tittle = tittle;
        this.price = price;
        this.stock = stock;
        this.autor = autor;
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

    public ArrayList<String> getAutor() { return autor; }

    public void setAutor(ArrayList<String> autor) { this.autor = autor; }

    @Override
    public String toString() {
        String autores = "";

        for (String author : autor) {
            autores += author + ", ";
        }

        return  "  Libro {" +
                "  Titulo='" + tittle + '\'' +
                ", Precio="  + price  +
                ", Stock="   + stock  +
                ", Autores=[" + autores + "]" +
                '}';
    }
}
