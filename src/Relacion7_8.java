import java.util.Scanner;

public class Relacion7_8 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] array1 = new int[100];
        for (int i = 0; i < 100; i++) {
            array1[i] = (int) (Math.random() * 20);
        }
        System.out.println("ARRAY NO MODIFICADA");
        for (int i = 0; i<array1.length ; i++) {
        System.out.print( array1[i] + " ");
        }
        System.out.println("Numero a modificar: ");
        int numero = entrada.nextInt();
        System.out.println("Numero por el cual modificar el anterior: ");
        int numero2 = entrada.nextInt();
        entrada.nextLine();
        System.out.println("ARRAY MODIFICADA");
        for (int i = 0; i < 100; i++) {
            if (array1[i] == numero) {
                array1[i] = numero2;
            }
            System.out.print(array1[i] + " ");
        }
        entrada.close();
    }
}
