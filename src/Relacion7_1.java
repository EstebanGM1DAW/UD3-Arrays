import java.util.Scanner;

public class Relacion7_1 {
    // Crea un programa que dado un Array de enteros y 
    //un valor entero, muestre la cantidad de veces que
    //aparece el entero en el Array.
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce el tamaño del array: ");
        int tamaño = entrada.nextInt();
        int[] numeros = new int[tamaño];
        System.out.println("Introduce los elementos del array:");
        for (int i = 0; i < tamaño; i++) {
            System.out.println("Elemento " + (i + 1) + ": ");
            numeros[i] = entrada.nextInt();
        }
        System.out.print("Introduce el valor a buscar: ");
        int valor = entrada.nextInt();
        int contador = 0;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == valor) {
                contador++;
            }
        }
        System.out.println("El valor " + valor + " aparece " + contador + " veces en el array.");
        entrada.close();
    }
}
