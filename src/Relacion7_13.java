public class Relacion7_13 {
    public static void main(String[] args) {
       String[] paises = {"España", "Rusia", "Japon", "Australia"};
       int[][] estaturas = new int[4][10];
       for (int fila = 0;fila<estaturas.length;fila++) {
            for (int columna = 0;columna<estaturas[fila].length;columna++) {
                estaturas[fila][columna] = (int) ((Math.random()* 70)+140);
            }
       }
       for (int fila = 0;fila<estaturas.length;fila++) {
        int suma = 0;
        int max = 0;
        int min = 300;
        System.out.print(paises[fila]+ ": ");
        for (int columna = 0;columna<estaturas[fila].length;columna++) {
            System.out.print(estaturas[fila][columna] + "|\t");
            suma += estaturas[fila][columna];
            if (max < estaturas[fila][columna]) {
                max = estaturas[fila][columna];
            }
            if (min > estaturas[fila][columna]) {
                min = estaturas[fila][columna];
            }
        }
        System.out.print(" Media: " + suma/10 + " Max: " + max + " Min: " + min);
        System.out.println();
   } 
    }
}