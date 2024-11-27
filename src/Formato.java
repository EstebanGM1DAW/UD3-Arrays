public class Formato {
    public static void main(String[] args) {
        int edad = 18;
        float peso = 65.3f;
        String nombre = "Jose";
        System.out.printf("Hola, %s, tienes %d años y pesas %.1f kilos.\n", nombre, edad, peso);
        
        System.out.printf("%-10s %10s\n","Producto","Manzana");
    }
}
