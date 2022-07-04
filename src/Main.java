
public class Main {
    public static void main(String[] args) {
        int a = 9;
        int b = 9;
        int c = 2;

        int resultado = sumar(a, b, c);
        System.out.println("La suma de los valores "+a+","+b+","+c+" es: "+resultado);

        Coche miCoche = new Coche();
        miCoche.mostrarPuertas();
        miCoche.incrementarPuertas();
        miCoche.incrementarPuertas();
        miCoche.mostrarPuertas();

    }

    public static int sumar(int a, int b, int c){
        return a+b+c;
    }
}