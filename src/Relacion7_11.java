public class Relacion7_11 {
    public static void main(String[] args) {
        // Definimos la matriz num
        Integer num[][] = {
            {0, 30, 2, null, null, 5},
            {75, null, null, null, 0, null},
            {null, null, -2, 9, null, 11}
        };
    
            // Imprimimos la matriz
        for (int fila = 0; fila < num.length; fila++) {
            for (int columna = 0; columna < num[fila].length; columna++) {
                if (num[fila][columna] != null) {
                System.out.print(num[fila][columna] + "\t");
                } else {
                    System.out.print(" " + "\t");
                }
            }
            System.out.println();
        }
    }
}
