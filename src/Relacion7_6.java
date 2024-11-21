import java.util.Scanner;

public class Relacion7_6 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int tamaño = 10;
        int[] numeros = new int[tamaño];
        int suma = 0;
        int cont=0;
        System.out.println("Introduce los elementos del array:");
        for (int i = 0; i < tamaño; i++) {
            System.out.println("Elemento " + (i + 1) + ": ");
            numeros[i] = entrada.nextInt();   
        }
        for (int i = 0; i < tamaño; i++) {
                suma = suma+numeros[i];
                cont++;
        }
        int media = suma/cont;
        System.out.println("Media de los alumnos: " + media);
            entrada.close();
        for (int i = 0; i < tamaño ; i++) {
            System.out.println("El alumno " + (i+1) + ": ");
            if (numeros[i]>= media) {
                System.out.println("Es mayor o igual a la media = " + numeros[i]);
            } else {
                System.out.println("No es mayor a la media = " + numeros[i]);
            }
        }
    }
}

