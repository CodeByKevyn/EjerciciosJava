public class Ejercicio2 {
    public static void main(String[] args) {
        double subtotal = 42.500;
        double descuento = 0.15;
        double total = subtotal - (subtotal * descuento);
        boolean derechoDescuento = subtotal >= 30.000;

        System.out.printf("Subtotal: $%.2f%n", subtotal);
        System.out.printf("Valor del descuento: $%.2f%n", descuento);
        System.out.printf("Total a pagar: $%.2f%n", total);
        System.out.printf("¿Tiene derecho a descuento?: %b%n", derechoDescuento);

    }
}
