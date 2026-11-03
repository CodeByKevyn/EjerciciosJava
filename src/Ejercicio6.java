public class Ejercicio6 {
    public static void main(String[] args) {
        String[] productos = {"Café americano", "Capuchino", "Jugo de naranja", "Tostada", "Brownie"};
        double[] precios = {3500, 5000, 4000, 4500, 6000};

        double sumaPrecios = 0;

        System.out.println("--- MENÚ DEL DÍA ---");
        for (int i = 0; i < productos.length; i++) {
            System.out.println((i + 1) + ". " + productos[i] + " - $" + precios[i]);
            sumaPrecios = sumaPrecios + precios[i];
        }

        double promedio = sumaPrecios / precios.length;
        System.out.println("\nPrecio promedio del menú: $" + promedio);
    }
}
