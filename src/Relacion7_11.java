public class Relacion7_11 {
    public static void main(String[] args) {
        // Definimos la matriz num
        int num[][] = {
            {0, 30, 2, 0, 0, 5},
            {75, 0, 0, 0, 0, 0},
            {0, 0, -2, 9, 0, 11}
        };
    
            // Imprimimos la matriz
        for (int fila = 0; fila < num.length; fila++) {
            for (int columna = 0; columna < num[fila].length; columna++) {
                System.out.print(num[fila][columna] + "\t");
            }
            System.out.println();
        }
    }
}
