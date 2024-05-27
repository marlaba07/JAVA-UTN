package Models;

public class Password implements Comparable<Password> {
    private String password;
    private int size;

    // Constructor por defecto
    public Password(){
        this.size = 8;
        this.generarContra(8);
    }

    // Constructor donde nosotros le pasamos un 'size'
    public Password(int size) {
        this.size = size;
        this.generarContra(size);
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    private void generarContra(int size){
        String AlphaNumerico =
                  "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
                + "0123456789"
                + "abcdefghijklmnopqrstuvxyz";

        /* StringBuilder */
        /* StringBuilder es como usar String normal..
        También se utiliza para manejo de Strings pero a ésta es indexada,
        quiere decir que sus carácteres tienen indices como un arreglo,
        de ésta forma podemos definir la capacidad como argumento
        DOC: https://aprenderaprogramar.com/index.php?option=com_content&view=article&id=961:stringbuffer-stringbuilder-java-ejemplo-diferencias-entre-clases-criterios-para-elegir-metodos-cu00914c&catid=58&Itemid=180
        */
        StringBuilder new_pass = new StringBuilder(size);
        for (int i = 0; i < size; i++) {
            int index = (int)(AlphaNumerico.length() * Math.random());
            /* append es un método de la clase StringBuilder que
               concatena Strings, como si le estuviesemos pasando un '+' */
            new_pass.append(AlphaNumerico.charAt(index));
        }

        this.password = new_pass.toString();
    }

    public boolean esFuerte(){
        int cant_min = 0;
        int cant_may = 0;
        int cant_num = 0;

        /* toCharArray:
        Este metodo se encarga de convertir una cadena (String) en una array de caracteres
        (char array), veamos su sintaxis:

        String cdn = "Bienvenidos a tinchicus.com";
	    char [] carac = cdn.toCharArray();

	    for(int i = 0; i < 27; i++)
		    System.out.println(carac[i]);
        * */

        // Convierto a password en un un arreglo.
        for (char ch: password.toCharArray()) {
            if (Character.isLowerCase(ch)) {  // Verifico si el caracter que le paso por parametro está en minuscula
                cant_min += 1;
            } else if(Character.isUpperCase(ch)){ // Verifico si el caracter que le paso por parametro está en mayuscula
                cant_may += 1;
            } else {
                cant_num += 1;
            }
        }

        /* Si la cantidad de..
        - minusculas es mayor que 1
        - mayusculas es mayor que 2
        - cant nums  es mayor que 5
         */
        if (cant_may > 2 && cant_min > 1 && cant_num > 5) {
            return true;
        }
        else {
            return false;
        }
    }

    @Override
    public String toString() {
        return  "Password={ " + password + " }";
    }

    @Override
    public int compareTo(Password pass_object) {
        int result = password.compareTo(pass_object.getPassword());
        return result;
    }



}
