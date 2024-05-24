package Models;
import java.util.Random;

public class Persona {
    public static final char SEXO_MUJER = 'M';
    public static final char SEXO_HOMBRE = 'H';
    public static final int SOBREPESO = 1;
    public static final int PESO_IDEAL = 0;
    public static final int PESO_BAJO = -1;
    public static final int MAYOR_EDAD = 18;

    private String nombre = "";
    private Integer edad = 0;
    private Integer DNI;
    private char sexo = SEXO_HOMBRE;
    private Double peso = 0.0;
    private Double altura = 0.0;

    public Persona(){
        this.DNI = generaDNI();
    }

    public Persona(String nombre, Double peso, Integer edad, char sexo, Double altura){
        this.DNI    = generaDNI();
        this.nombre = nombre;
        this.peso   = peso;
        this.edad   = edad;
        this.altura = altura;
        this.sexo   = sexo;
    }

    public Persona(String nombre, Integer edad, char sexo) {
        this.nombre = nombre;
        this.edad   = edad;
        comprobarSexo(sexo);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public Integer getDNI() {
        return DNI;
    }

    public char getSexo() { return sexo;}

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public int calcularIMC(){
       double IMC = getPeso() / ( getAltura() * getAltura() );

       if(IMC < 20){
           return PESO_BAJO;
       } else if(IMC > 25) {
           return SOBREPESO;
       } else {
           return PESO_IDEAL;
       }
    }

    public Boolean esMayorDeEdad(){
        if(this.edad >= MAYOR_EDAD){
            return true;
        } else {
            return false;
        }
    }

    private void comprobarSexo(char sexo){
        if(sexo == SEXO_HOMBRE || sexo == SEXO_MUJER){
            this.sexo = sexo;
        } else {
            this.sexo = SEXO_HOMBRE;
        }
    }

    private Integer generaDNI(){
        int min = 10000000;
        int max = 99999999;
        int randomNumber = (int)(Math.random() * (max - min + 1)) + min;

        return randomNumber;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", DNI=" + DNI +
                ", sexo=" + sexo +
                ", peso=" + peso +
                ", altura=" + altura +
                ", DATO PESO=" + calcularIMC() +
                '}';
    }
}
