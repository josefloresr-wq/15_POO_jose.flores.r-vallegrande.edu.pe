package vallegrande.edu.pe.app;

import vallegrande.edu.pe.controller.AgendaController;
import vallegrande.edu.pe.model.Contacto;
import vallegrande.edu.pe.view.AgendaView;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Crear componentes
        AgendaController controller = new AgendaController();
        AgendaView view = new AgendaView();
        Scanner scanner = new Scanner(System.in);

        int opcion;

        view.mostrarTitulo();

        do {
            view.mostrarMenu();

            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {

                case 1:
                    // Registrar contacto
                    System.out.print("ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Nombres: ");
                    String nombres = scanner.nextLine();

                    System.out.print("Apellidos: ");
                    String apellidos = scanner.nextLine();

                    System.out.print("Dirección: ");
                    String direccion = scanner.nextLine();

                    System.out.print("Teléfono: ");
                    String telefono = scanner.nextLine();

                    System.out.print("Correo: ");
                    String correo = scanner.nextLine();

                    Contacto contacto = new Contacto(
                            id,
                            nombres,
                            apellidos,
                            direccion,
                            telefono,
                            correo
                    );

                    controller.agregarContacto(contacto);

                    view.mostrarMensaje(
                            "Contacto registrado correctamente."
                    );

                    break;

                case 2:
                    // Buscar contacto
                    System.out.print(
                            "Ingrese nombre o apellido a buscar: "
                    );

                    String busqueda = scanner.nextLine();

                    controller.buscarContacto(busqueda);

                    break;

                case 3:
                    // Listar contactos
                    controller.listarContactos();

                    break;

                case 4:
                    // Eliminar contacto
                    System.out.print(
                            "Ingrese el ID del contacto a eliminar: "
                    );

                    int idEliminar = scanner.nextInt();
                    scanner.nextLine();

                    if (controller.eliminarContacto(idEliminar)) {
                        view.mostrarMensaje(
                                "Contacto eliminado correctamente."
                        );
                    } else {
                        view.mostrarMensaje(
                                "No se encontró un contacto con ese ID."
                        );
                    }

                    break;

                case 5:
                    // Salir
                    view.mostrarMensaje(
                            "Gracias por usar la Agenda de Contactos."
                    );
                    break;

                default:
                    view.mostrarMensaje(
                            "Opción inválida. Intente nuevamente."
                    );
            }

        } while (opcion != 5);

        scanner.close();
    }
}