package Sistema_de_turno_de_cafetería;

public class Sistemadeturno {
    public static void main(String[] args) {

        String[] nombres = {"Café americano", "Capuchino", "Jugo naranja", "Tostada", "Brownie"};
        double[] precios = {3500, 5000, 4000, 4500, 6000};
        char[] categorias = {'B', 'B', 'F', 'C', 'P'};
        int[] pedidoProducto = {0, 2, 1, 4, 0, 3};
        int[] pedidoCantidad = {2, 1, 3, 1, 1, 2};
        double montoApertura = -5000.0;

        do {
            System.out.println("Ingresando monto de apertura: $" + montoApertura);

            if (montoApertura <= 0) {
                System.out.println("Error: El monto de apertura debe ser mayor a $0. Intente de nuevo.\n");
                montoApertura = 20000.0;
            }

        } while (montoApertura <= 0);

        System.out.println("--- CAJA ABIERTA CON ÉXITO --- \n");

        int inventarioBrownie = 10;

        int pedidosProcesados = 0;
        double totalRecaudado = 0;
        double mayorValorEncontrado = 0;
        int numeroPedidoMayorValor = 0;

        for (int i = 0; i < pedidoProducto.length; i++) {

            int numeroPedido = i + 1;
            int indiceProducto = pedidoProducto[i];
            int cantidadPedida = pedidoCantidad[i];

            String nombreProd = nombres[indiceProducto];
            double precioProd = precios[indiceProducto];
            char codigoCat = categorias[indiceProducto];

            System.out.println("--- PEDIDO #" + numeroPedido + " ---");

            if (indiceProducto == 4) {
                if (inventarioBrownie < cantidadPedida) {
                    System.out.println("PRODUCTO AGOTADO: No hay suficientes unidades de " + nombreProd);
                    System.out.println("El pedido #" + numeroPedido + " no pudo cobrarse.\n");
                    continue;
                } else {
                    inventarioBrownie = inventarioBrownie - cantidadPedida;
                }
            }


            String descripcionCategoria = "";
            switch (codigoCat) {
                case 'B':
                    descripcionCategoria = "Bebida caliente";
                    break;
                case 'F':
                    descripcionCategoria = "Bebida fría";
                    break;
                case 'C':
                    descripcionCategoria = "Comida";
                    break;
                case 'P':
                    descripcionCategoria = "Postre";
                    break;
                default:
                    descripcionCategoria = "Categoría desconocida";
                    break;
            }

            double subtotal = precioProd * cantidadPedida;

            System.out.println("Producto: " + nombreProd);
            System.out.println("Cantidad: " + cantidadPedida);
            System.out.println("Categoría: " + descripcionCategoria);
            System.out.println("Subtotal: $" + subtotal);

            double valorFinal = subtotal;

            if (subtotal > 12000) {
                double descuento = subtotal * 0.10; // 10% de descuento
                valorFinal = subtotal - descuento;
                System.out.println("¿Aplica descuento?: SÍ (10% de descuento aplicado)");
            } else {
                System.out.println("¿Aplica descuento?: NO");
            }

            System.out.println("Valor final del pedido: $" + valorFinal + "\n");


            pedidosProcesados++;
            totalRecaudado = totalRecaudado + valorFinal;


            if (valorFinal > mayorValorEncontrado) {
                mayorValorEncontrado = valorFinal;
                numeroPedidoMayorValor = numeroPedido;
            }
        }

        System.out.println("Total de pedidos procesados : " + pedidosProcesados);
        System.out.println("Total dinero recaudado      : $" + totalRecaudado);
        System.out.println("Pedido con mayor valor      : Pedido #" + numeroPedidoMayorValor + " ($" + mayorValorEncontrado + ")");
    }
}
