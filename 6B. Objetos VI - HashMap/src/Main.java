import Models.Persona;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Menu();
    }

    public static void Menu(){
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int dimension = 10;
        int op;

        do{
            Opciones();
            System.out.println("Ingrese una opción: ");
            op = scanner.nextInt();
            scanner.nextLine();

            switch (op) {
                case 0:
                    System.out.println("Saliendo del programa...");
                case 1:
                    System.out.println("Ingresar una cadena de texto: ");
                    String texto = scanner.nextLine();
                    texto = texto.toLowerCase();

                    HashMap<Character, Integer> charsText = new HashMap<>();

                    for (char c : texto.toCharArray()){
                        if(charsText.containsKey(c)){
                            charsText.put(c, charsText.get(c) + 1);
                        } else {
                            charsText.put(c, 1);
                        }
                    }

                    int letrasRepetidas = 0;
                    for(Integer count : charsText.values()){
                        if( count > 1 ){
                            letrasRepetidas++;
                        }
                    }

                    for(Map.Entry<Character, Integer> entry : charsText.entrySet()){
                        System.out.println(entry);
                    }

                    System.out.println("Cantidad de letras repetidas: " + letrasRepetidas);

                    break;
                case 2:
                    ArrayList<Integer> lista = new ArrayList<>();

                    int cant = 5;

                    for (int i = 0; i < cant; i ++){
                        // Numeros random del 0 al 99
                        int randomNums = random.nextInt(100);
                        lista.add(randomNums);
                    }

                    // Lista ordenada
                    Collections.sort(lista);

                    System.out.println("Lista original: " + lista);

                    HashSet<Integer> listaUnica = new HashSet<>(lista);
                    System.out.println("Lista sin elementos repetidos: " + listaUnica);

                    break;
                case 3:
                    Persona p1 = new Persona("Mariano", 24);
                    Persona p2 = new Persona("Santiago", 25);
                    Persona p3 = new Persona("Lourdes", 21);
                    Persona p4 = new Persona("Belen", 24);

                    ArrayList<Persona> personas = new ArrayList<>();
                    personas.add(p1);
                    personas.add(p2);
                    personas.add(p3);
                    personas.add(p4);

                    System.out.println("Lista desordenada: ");
                    for (Persona p : personas){
                        System.out.println(p.toString());
                    }

                    TreeMap<Integer, List<Persona>> listaOrdenada = new TreeMap<>();

                    for (Persona p : personas){
                        // 'putIfAbsent' es igual al 'put' pero evita que la key se repita
                        listaOrdenada.putIfAbsent(p.edad, new ArrayList<>());
                        listaOrdenada.get(p.edad).add(p);
                    }

                    System.out.println("Lista ordenada por edad:");
                    for (Map.Entry<Integer, List<Persona>> entry : listaOrdenada.entrySet()) {
                        for (Persona persona : entry.getValue()) {
                            System.out.println(persona);
                        }
                    }

                break;
                case 4:
                    ArrayList<Integer> nros = new ArrayList<>();

                    for (int i = 0; i<dimension; i++){
                        System.out.println("Ingrese un numero: ");
                        int nro = scanner.nextInt();
                        
                        nros.add(nro);
                    }

                    int suma = 0;
                    for (int nro : nros){
                        suma += nro;
                    }

                    double promedio = (float)suma / nros.size();
                    System.out.println("Promedio: " + promedio);

                    HashMap<Integer, Integer> mapa = new HashMap<>();

                    for (int elemento : nros) {
                        if (mapa.containsKey(elemento)) {
                            mapa.put(elemento, mapa.get(elemento) + 1);
                        } else {
                            mapa.put(elemento, 1);
                        }
                    }

                    System.out.println("Elementos y cantidad de veces que aparecen: ");
                    for (Map.Entry<Integer, Integer> entry : mapa.entrySet()) {
                        System.out.println(entry.getKey() + " - Frecuencia:" + entry.getValue());
                    }

                    break;
                case 5:
                    ArrayList<Integer> list = new ArrayList<>();
                    for(int i = 0; i<dimension; i++){
                        int nrosRandom = random.nextInt(10);
                        list.add(nrosRandom);
                    }

                    TreeSet<Integer> treeSet = new TreeSet<>(list);
                    list.sort(Collections.reverseOrder());
                    System.out.println("Lista ordenada de mayor a menor: " + list);

                    Collections.sort(list);
                    System.out.println("Lista ordenada de menor a mayor: " + list);

                    break;
                case 6:
                    break;
                default:
                    System.out.println("Opción incorrecta...");
                    break;
            }
        } while(op != 0);
    }

    public static void Opciones(){
        System.out.println("0. Salir");
        System.out.println("1. Primer ejercicio");
        System.out.println("2. segundo ejercicio");
        System.out.println("3. Tercer ejercicio");
        System.out.println("4. Cuarto ejercicio");
        System.out.println("5. Quinto ejercicio");
        System.out.println("6. Sexto ejercicio");
    }
}