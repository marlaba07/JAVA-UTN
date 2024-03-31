public class Rectangulo {
    // Variables iniciales
    private double width;
    private double height;

    // Constructor 1 [inicializa variables]
    public Rectangulo(){
        this.width  = 1.0;
        this.height = 1.0;
    }

    /* Sí 'width' y 'height' ya tuvieran valores definidos. Por ejemplo
    private double width = 1.0;
    private double height = 1.0;

    Podría llamar a un constructor vacio para inicializarlos. Esta es otra opción válida.

    public Rectangulo(){} */

    // Constructor 2 [Obtengo los datos que le paso por parametro en el objeto]
    public Rectangulo(double width, double height){
        this.width = width;
        this.height = height;
    }

    public double getWidth(){
        return width;
    }

    public void setWidth(double width){
        this.width = width;
    }

    public double getHeight(){
        return height;
    }

    public void setHeight(double height){
        this.height = height;
    }

    public double calculateArea(){
        double response = width * height;
        return response;
    }

    public double calculatePerimeter(){
        double response = 2 * (width + height);
        return response;
    }
}
