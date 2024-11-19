import java.util.Scanner;

public class Relacion7_10 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] array1 = new int[20];
        for (int i = 0; i<20;i++) {
            array1[i] = (int) (Math.random() * 400);
        }
        System.out.println("1.Multiplos de 5/2.Multiplos de 7:");
        int primos = entrada.nextInt();
        entrada.nextLine();
        if (primos == 1) {
            for (int i = 0; i<20;i++){
                if (array1[i]%5 == 0) {
                    System.out.print("[" + array1[i] + "]" + " ");
                } else {
                    System.out.print(array1[i]+ " ");
                }
            }
        } else if (primos == 2) {
            for (int i = 0;i<20;i++) {
                if (array1[i]%7 == 0) {
                    System.out.print("[" + array1[i] + "]" + " ");
                } else {
                    System.out.print(array1[i]+ " ");
                }
            }
        }
        entrada.close();
    }
}
