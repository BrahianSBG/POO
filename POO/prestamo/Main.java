package prestamo;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList<Prestamo> prestamos = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int opcion;
        do {
            System.out.println("\nMenú");
            System.out.println("1. Ingresar préstamo");
            System.out.println("2. Listar préstamos");
            System.out.println("3. Realizar acciones");
            System.out.println("4. Buscar préstamo por documento");
            System.out.println("5. Salir");
            System.out.print("Ingrese una opción: ");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    ingresarPrestamo();
                    break;
                case 2:
                    listarPrestamos();
                    break;
                case 3:
                    realizarAcciones();
                    break;
                case 4:
                    buscarPorDocumento();
                    break;
                case 5:
                    System.out.println("Hasta luego!");
                    break;
                default:
                    System.out.println("Opción inválida");
            }
        } while (opcion != 5);
    }

    private static void ingresarPrestamo() {
        sc.nextLine(); // Limpiar buffer

        Prestamo pt = new Prestamo();

        System.out.print("Ingrese el nombre del usuario: ");
        pt.setNombre(sc.nextLine());

        System.out.print("Ingrese el documento del usuario: ");
        pt.setDocumento(sc.nextInt());

        System.out.print("Ingrese el valor del préstamo: ");
        pt.setValorPrestamo(sc.nextInt());

        System.out.print("Ingrese el interés: ");
        pt.setInteres(sc.nextInt());

        System.out.print("Ingrese el número de cuotas: ");
        pt.setNumeroCuotas(sc.nextInt());

        
        
        prestamos.add(pt);
    }

    private static void listarPrestamos() {
        for (int i = 0; i < prestamos.size(); i++) {
            System.out.println("\nLISTA DE PRESTAMOS");
            System.out.println(prestamos.get(i).toString());
        }
    }

    private static void realizarAcciones() {
        if (prestamos.isEmpty()) {
            System.out.println("No hay préstamos para realizar acciones");
            return;
        }    
    }

    private static void buscarPorDocumento(){

    }

}        