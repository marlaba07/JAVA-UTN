package excep;

public class CustomException extends Throwable{
    private int age;
    public CustomException(int age){
        super("La persona es menor de edad, su edad es: " + age);
        this.age = age;
    }

    public int getAge(){
        return age;
    }
}
