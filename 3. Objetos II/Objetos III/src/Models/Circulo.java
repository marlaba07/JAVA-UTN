package Models;

public class Circulo {
    private Double radio = 1.0;
    private String color = "Rojo";

    public Circulo() {}

    public Circulo(double radio) {
        this.radio = radio;
    }
    public Circulo(double radio, String color) {
        this.radio = radio;
        this.color = color;
    }

    public Double getRadio() {
        return radio;
    }

    public String getColor() {
        return color;
    }

    public double calculateArea(){
        return Math.PI * Math.pow(radio, 2);
    }

    @Override
    public String toString() {
        return "Circulo{" +
                "radio=" + radio +
                ", color='" + color + '\'' +
                '}';
    }
}
