package Models;

public class Cilindro extends Circulo {
    public Double height = 1.0;

    public Cilindro() {
        super();
    }

    public Cilindro(double radio, String color) {
        super(radio, color);
    }
    public Cilindro(double radio, double height) {
        super(radio);
        this.height = height;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return ((2 * Math.PI * super.getRadio() * this.height) + (2 * super.calculateArea()));
    }

    public double calculateVolumen() {
        return super.calculateArea() * this.height;
    }

    @Override
    public String toString() {
        return "Cilindro{" +
                "subclase de " + super.toString() +
                ", altura='" + height + '\'' +
                '}';
    }
}
