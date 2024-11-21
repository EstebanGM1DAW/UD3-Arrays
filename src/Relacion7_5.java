import java.util.Scanner;

public class Relacion7_5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int tamaño = 10;
        int[] numeros = new int[tamaño];
        int sumaPos = 0;
        int sumaNeg = 0;
        int contPos = 0;
        int contNeg = 0;
        System.out.println("Introduce los elementos del array:");
        for (int i = 0; i < tamaño; i++) {
            System.out.println("Elemento " + (i + 1) + ": ");
            numeros[i] = entrada.nextInt();   
        }
        for (int i = 0; i < tamaño; i++) {
            if (numeros[i] > 0){
                sumaPos = sumaPos+numeros[i];
                contPos++;
            } else if (numeros[i] < 0 ) {
                sumaNeg = sumaNeg+numeros[i];
                contNeg++;
            }
        }
        System.out.println("Media de los negativos: " + sumaNeg/contNeg + " " + "Media de los positivos: " + sumaPos/contPos);
            entrada.close();
    }
}