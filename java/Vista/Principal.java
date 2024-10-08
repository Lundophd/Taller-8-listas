package Vista;

import Controlador.Controlador;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Controlador controlador = new Controlador();
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("1. Adicionar Estudiante");
            System.out.println("2. Mostrar lista de principio a fin");
            System.out.println("3. Mostrar lista de fin a principio");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); 

            switch(opcion) {
                case 1:
                    System.out.print("Ingrese el nombre del estudiante: ");
                    String nombre = scanner.nextLine();
                    controlador.adicionarPersona(nombre);
                    System.out.println("Estudiante añadido.");
                    break;

                case 2:
                    System.out.println("Lista desde cabeza a cola:");
                    System.out.println(controlador.recorrer_lista_cabeza_cola());
                    break;

                case 3:
                    System.out.println("Lista desde cola a cabeza:");
                    System.out.println(controlador.recorrer_lista_cola_cabeza());
                    break;

                case 4:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        } while (opcion != 4);

        scanner.close();
    }
}
