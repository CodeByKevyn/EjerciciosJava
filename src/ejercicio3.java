public class ejercicio3 {
    public static void main(String[] args) {
        char codigo = 'p';

        switch (codigo){
            case 'B':
            case 'b':
                System.out.println("Categoria: Bebida caliente");
                System.out.println("IVA aplicable: 0%");
                break;
            case 'F':
            case 'f':
                System.out.println("Categoria: Bebida fria");
                System.out.println("IVA aplicable: 5%");
                break;
            case 'C':
            case 'c':
                System.out.println("Categoria: comida");
                System.out.println("IVA aplicable: 8%");
                break;
            case 'P':
            case 'p':
                System.out.println("Categoria: postre");
                System.out.println("IVA aplicable: 8%");
                break;
            default:
                System.out.println("Codigo de categoria no reconocido");
        }


    }
}
