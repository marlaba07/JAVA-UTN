package Models;

import Interface.Ingreso;

public class Militar extends Avion implements Ingreso {
    private String sistemaArmas;
    private Integer cantBalas;

    public Militar(String modelo, String marca, String tipoMotor, Integer cantAsientos, Integer cantCombustible, String sistemaArmas, Integer cantBalas) {
        super(modelo, marca, tipoMotor, cantAsientos, cantCombustible);
        this.sistemaArmas = sistemaArmas;
        this.cantBalas = cantBalas;
    }

    public String getSistemaArmas() {
        return sistemaArmas;
    }

    public void setSistemaArmas(String sistemaArmas) {
        this.sistemaArmas = sistemaArmas;
    }

    public Integer getCantBalas() {
        return cantBalas;
    }

    public void setCantBalas(Integer cantBalas) {
        this.cantBalas = cantBalas;
    }

    @Override
    public Boolean ingresar() {
        System.out.println("Ingresando...");
        return true;
    }
}
