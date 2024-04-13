package Models;

import java.util.ArrayList;

public class Libro {
    private String tittle;
    private Double price;
    private Integer stock;
    private ArrayList<Autor> autor;

    public Libro(String tittle, Double price, Integer stock, ArrayList<Autor> autor) {
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

    public ArrayList<Autor> getAutor() {
        return autor;
    }

    public void setAutor(ArrayList<Autor> autor) {
        this.autor = autor;
    }

    @Override
    public String toString() {
        String autores = "";
        for (Autor author : autor) {
            autores += author + ", ";
        }

        return  "  Libro {" +
                "  Titulo='" + getTittle() + '\'' +
                ", Precio="  + getPrice()  +
                ", Stock="   + getStock()  +
                ", Autores=[" + autores + "]" +
                '}';
    }

    public String sendMessagge(){
        StringBuilder names = new StringBuilder();
        for(Autor author : autor) {
            if(author != null){
                names.append(author.getName());
                names.append(" ");
                names.append(author.getLastname());
                names.append(" ,");
            }
        }

        return "El libro, " + this.getTittle() + " de " + names + " se vende a " + this.getPrice() + " pesos.";
    }
}
