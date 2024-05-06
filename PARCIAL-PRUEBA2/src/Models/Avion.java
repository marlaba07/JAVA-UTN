package Models;

public abstract class Avion {
    private String modelo;
    private String marca;
    private String tipoMotor;
    private Integer cantAsientos;
    private Integer cantCombustible;

    public Avion(String modelo, String marca, String tipoMotor, Integer cantAsientos, Integer cantCombustible) {
        this.modelo = modelo;
        this.marca = marca;
        this.tipoMotor = tipoMotor;
        this.cantAsientos = cantAsientos;
        this.cantCombustible = cantCombustible;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTipoMotor() {
        return tipoMotor;
    }

    public void setTipoMotor(String tipoMotor) {
        this.tipoMotor = tipoMotor;
    }

    public Integer getCantAsientos() {
        return cantAsientos;
    }

    public void setCantAsientos(Integer cantAsientos) {
        this.cantAsientos = cantAsientos;
    }

    public Integer getCantCombustible() {
        return cantCombustible;
    }

    public void setCantCombustible(Integer cantCombustible) {
        this.cantCombustible = cantCombustible;
    }

    public void despegar(){
        // TODO: Ver que lógica implementar acá
    }

    public void aterrizar(){
        // TODO: Ver que lógica implementar acá
    }

    public void volar(){
        // TODO: Ver que lógica implementar acá
    }
}
