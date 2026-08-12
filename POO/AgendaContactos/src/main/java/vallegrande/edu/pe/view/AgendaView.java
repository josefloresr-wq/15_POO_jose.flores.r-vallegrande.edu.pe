package vallegrande.edu.pe.view;

public class AgendaView {
    //Mostrar Titulo
    public void mostrarTitulo() {
        System.out.println("---------------------------");
        System.out.println("AGENDA DE CONTACTOS");
        System.out.println("---------------------------");
    }
    //Mostrar menú
    public void mostrarMenu() {
        System.out.println("\n1. Registrar contacto");
        System.out.println("2. Buscar contacto");
        System.out.println("3. Listar contactos");
        System.out.println("4. Eliminar contacto");
        System.out.println("5. Salir");
        System.out.println("---------------------------");
        System.out.print("Seleccione una opción: ");
    }

    // Mostrar mensaje
    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }
}