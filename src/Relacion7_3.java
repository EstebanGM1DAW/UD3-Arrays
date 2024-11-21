import java.util.Scanner;

public class Relacion7_3 {
    //Crea un programa que reciba un Array de Strings y un char.
    //Deberá mostrar todos los Strings cuya
    //primera letra coincida con el char.
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Numero de frases en el array: ");
        String[] numsFras = new String[entrada.nextInt()];
        entrada.nextLine();
        for (int i = 0;i < numsFras.length; i++) {
            System.out.println("Frase " + (i+1) + ": ");
             numsFras[i] = entrada.nextLine();
        }
        String caracter = "";
        do{
        System.out.println("Caracter: ");
        caracter = entrada.nextLine();
        if (caracter.length()!= 1) {
            System.out.println("Solo un caracter");
        }
        } while (caracter.length() != 1);
        for (int i = 0; i < numsFras.length; i++){
            if (numsFras[i].startsWith(caracter)) {
                System.out.println(numsFras[i]);
            }
        }
        entrada.close();
    }
}