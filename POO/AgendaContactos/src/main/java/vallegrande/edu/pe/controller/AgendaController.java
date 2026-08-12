package vallegrande.edu.pe.controller;

import vallegrande.edu.pe.model.Contacto;
import java.util.ArrayList;

public class AgendaController {

    // Lista de contactos
    private ArrayList<Contacto> contactos;

    // Constructor
    public AgendaController() {
        contactos = new ArrayList<>();

        // Contactos predeterminados
        contactos.add(new Contacto(
                1,
                "Ana",
                "Torres",
                "Cañete",
                "966741082",
                "ana@gmail.com"
        ));

        contactos.add(new Contacto(
                2,
                "Carlos",
                "Pevez",
                "Imperial",
                "947184923",
                "carlos@gmail.com"
        ));

        contactos.add(new Contacto(
                3,
                "Maria",
                "Lopez",
                "Lima",
                "955123456",
                "maria@gmail.com"
        ));

        contactos.add(new Contacto(
                4,
                "Jose",
                "Ramos",
                "Chincha",
                "987654321",
                "jose@gmail.com"
        ));

        contactos.add(new Contacto(
                5,
                "Lucia",
                "Garcia",
                "Mala",
                "912345678",
                "lucia@gmail.com"
        ));
    }

    // Agregar contacto
    public void agregarContacto(Contacto contacto) {
        contactos.add(contacto);
    }

    // Listar contactos
    public void listarContactos() {

        if (contactos.isEmpty()) {
            System.out.println("No hay contactos registrados.");
            return;
        }

        System.out.println("\nLISTA DE CONTACTOS");
        System.out.println("-----------------------------------");

        for (Contacto contacto : contactos) {
            contacto.mostrarContacto();
        }
    }

    // Buscar contacto por nombre o apellido
    public void buscarContacto(String texto) {

        boolean encontrado = false;

        for (Contacto contacto : contactos) {

            if (contacto.getNombres().toLowerCase()
                    .contains(texto.toLowerCase())
                    ||
                    contacto.getApellidos().toLowerCase()
                            .contains(texto.toLowerCase())) {

                contacto.mostrarContacto();
                encontrado = true;
            }
        }

        if (!encontrado) {
            System.out.println("No se encontró ningún contacto.");
        }
    }

    // Eliminar contacto por ID
    public boolean eliminarContacto(int id) {

        for (Contacto contacto : contactos) {

            if (contacto.getId() == id) {
                contactos.remove(contacto);
                return true;
            }
        }

        return false;
    }
}