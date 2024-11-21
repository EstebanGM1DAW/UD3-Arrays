public class Relacion7_9 {
    public static void main(String[] args) {
        int[] array1 = new int[20];
        int[] paresArray = new int[20];
        int[] imparesArray = new int[20];
        int paresCont = 0;
        int imparesCont = 0;
        int cont = 0;
        for (int i = 0; i<array1.length;i++) {
            array1[i] = (int) (Math.random()*101);
        }
        System.out.println("SIN MODIFICAR");
        for (int i = 0;i<array1.length;i++) {
            System.out.print(array1[i] + " ");
        }
        System.out.println();
        for (int i = 0; i<array1.length;i++) {
            if (array1[i]%2==0) {
                paresArray[paresCont++] = array1[i];
            } else {
                imparesArray[imparesCont++] = array1[i];
            }
        }
        for (int i = 0;i<paresCont;i++) {
            array1[cont++] = paresArray[i];
        }
        for (int i = 0;i<imparesCont;i++) {
            array1[cont++] = imparesArray[i];
        }
        System.out.println("MODIFICADA");
        for (int i = 0;i<cont;i++) {
            System.out.print(array1[i]+" ");
        }
    }
}
