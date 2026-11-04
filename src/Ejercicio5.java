public class Ejercicio5 {
    public static void main(String[] args) {
        double monto = -10.0;

        do {
            System.out.println("Monto ingresado: $" + monto);

            if (monto <= 0) {
                System.out.println("Error: El monto debe ser mayor a $0.");
                monto = 50.0;
            }
        } while (monto <= 0);

        System.out.println("Monto de apertura aceptado: $" + monto);
    }
}
