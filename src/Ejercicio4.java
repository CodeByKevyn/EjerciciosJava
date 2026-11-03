public class Ejercicio4 {
    public static void main(String[] args) {
        int inventario = 50;
        int consumoPorPedido = 3;

        while (inventario >= 10) {
            inventario = inventario - consumoPorPedido;
            System.out.println("Inventario restante: " + inventario);
        }
    }
}
