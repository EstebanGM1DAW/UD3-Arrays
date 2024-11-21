public class Relacion7_12 {
    public static void main(String[] args) {
        int[][] arrayBid = new int[4][5];
        int[] sumaC = new int[5];
        int total = 0;
        for (int fila = 0;fila<arrayBid.length;fila++) {
            for (int columna = 0; columna < arrayBid[fila].length;columna++) {
                arrayBid[fila][columna] = (int) (Math.random()*100);
            }
        }
        for (int fila = 0;fila<arrayBid.length;fila++) {
            int SumaFila = 0;
            for (int columna = 0; columna < arrayBid[fila].length;columna++) {
                System.out.print("|" + arrayBid[fila][columna] + "\t");
                SumaFila += arrayBid[fila][columna];
                sumaC[columna] += arrayBid[fila][columna];
            }
            total += SumaFila;
            System.out.println("|" + SumaFila + "\t");
        }
        for (int i = 0; i < sumaC.length;i++) {
            System.out.print("|" + sumaC[i] + "\t");
            total += sumaC[i];
        }
        System.out.print("|"+total);
    }
}