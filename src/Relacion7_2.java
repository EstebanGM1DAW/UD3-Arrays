import java.util.Scanner;

public class Relacion7_2 {
    // Crea un programa que reciba un 
    //Array de Strings y muestre el String más largo
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Cuantas frases vas a añadir?");
        int numFra = entrada.nextInt();
        String[] frases = new String[numFra];
        entrada.nextLine();
        System.out.println("Introduce las frases del array:");
            for (int i = 0; i< numFra; i++) {
            System.out.println("Frase " + (i+1) + ": ");
            frases[i] = entrada.nextLine();
            }
        String fraseMasLarga = "";
            for (int i = 0; i < frases.length; i++) {
                if (frases[i].length() > fraseMasLarga.length()) {
                    fraseMasLarga = frases[i];
                }
            }
        System.out.println("La frase mas larga es: " + fraseMasLarga);
        entrada.close();
    }
}