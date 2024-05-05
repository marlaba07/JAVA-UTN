package Models;

public class Utilitarios extends Vehiculo{
    private Double kgMax;
    private Double altura;

    public Utilitarios(String modelo, Double precio, String tipo, Double kgMax, Double altura) {
        super(modelo, precio, tipo);
        this.kgMax = kgMax;
        this.altura = altura;
    }

    @Override
    public String obtenerDatosEspecificos() {
        return "KG_MAX: " + kgMax + ", Altura: " + altura;
    }

}
