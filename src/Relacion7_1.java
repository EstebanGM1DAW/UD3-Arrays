import java.util.Scanner;

public class Relacion7_1 {
    // Crea un programa que dado un Array de enteros y 
    //un valor entero, muestre la cantidad de veces que
    //aparece el entero en el Array.
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // Solicitar el tamaño del array
        System.out.println("Introduce el tamaño del array: ");
        int tamaño = entrada.nextInt();

        // Crear el array e introducir los elementos
        int[] numeros = new int[tamaño];
        System.out.println("Introduce los elementos del array:");
        for (int i = 0; i < tamaño; i++) {
            System.out.println("Elemento " + (i + 1) + ": ");
            numeros[i] = entrada.nextInt();
        }

        // Solicitar el valor a buscar
        System.out.print("Introduce el valor a buscar: ");
        int valor = entrada.nextInt();

        // Contar cuántas veces aparece el valor en el array
        int contador = 0;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == valor) {
                contador++;
            }
        }

        // Mostrar el resultado
        System.out.println("El valor " + valor + " aparece " + contador + " veces en el array.");

        entrada.close();
    }


}
