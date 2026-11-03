public class Ejercicio1 {
    public static void main(String[] args) {
        String producto = "cafe";
        double precioUnitario = 5.999;
        int cantidadInventario = 5;
        boolean disponible = true;
        char codigo = 'A';

        System.out.println(String.format("Nombre del producto %s", producto));
        System.out.println(String.format("Precio unitario del producto %f", precioUnitario));
        System.out.println(String.format("Cantidad del productor en el inventario %d", cantidadInventario));
        System.out.println(String.format("Esta disponible %b", disponible));
        System.out.println(String.format("Codigo %c", codigo));
    }
}
