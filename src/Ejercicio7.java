public class Ejercicio7 {
    public static void main(String[] args) {
        int cantidadVendida = 5; // 1. Corregido: se quitaron las comillas
        double precioUnitario = 4500;
        double total = cantidadVendida * precioUnitario; // 2. Corregido: se agregó el punto y coma (;)

        boolean aplicaDescuento = (total > 20000);

        // 3. Corregido: se pasa la condición booleana directamente
        if (aplicaDescuento) {
            total = total - (total * 0.10);
        }

        System.out.println("Total: " + total);
    }
}
