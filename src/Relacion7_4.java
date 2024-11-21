public class Relacion7_4 {
    //Crea un programa que reciba dos Arrays, y devuelva un Array
    //con los valores máximos en cada una de las posiciones. 
    //Se debe tener en cuenta que los Arrays podrán ser de tamaños distintos
    public static void main(String[] args) {
        int[] array1 = {1, 6, 4, 9, 3};
        int[] array2 = {3, 8, 1};        
            // Determinar el tamaño del array más largo
        int maxLength = Math.max(array1.length, array2.length);
        int[] array3 = new int[maxLength];
        // Llenar array3 con los valores máximos en cada posición
        for (int i = 0; i < maxLength; i++) {
            if (i < array1.length && i < array2.length) {
                // Si el índice está en los límites de ambos arrays, tomamos el máximo
                array3[i] = Math.max(array1[i], array2[i]);
            } else if (i < array1.length) {
                // Si solo array1 tiene elementos en esta posición
                array3[i] = array1[i];
            } else if (i < array2.length) {
                // Si solo array2 tiene elementos en esta posición
                array3[i] = array2[i];
            }
        }
        // Mostrar el resultado
        for (int i = 0; i < array3.length; i++) {
            System.out.print("El array resultante es: " + array3[i] + " ");
        }            
    }
}