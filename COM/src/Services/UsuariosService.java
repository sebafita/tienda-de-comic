package Services;

import Interface.InfoUsuario;
import Tienda.Tienda;
import Usuario.Usuarios;
import java.util.Scanner;

public class UsuariosService {
    private Scanner sc = new Scanner(System.in);

    public Usuarios registrarUsuario() {
        System.out.println("Ingrese su nombre: ");
        String nombre = sc.nextLine();

        System.out.println("Ingrese su RUT (12.589.335-6): ");
        String rut = sc.nextLine();

        System.out.println("Ingrese su correo (tumail@gmail.com): ");
        String correo = sc.nextLine();

        System.out.println("Ingrese su dirección: ");
        String direccion = sc.nextLine();

        return new Usuarios(nombre, rut, correo, direccion);
    }

    public void mostrarDatosUsuario(Tienda tienda, String rut) {
            Usuarios usuario = tienda.getUsuarios().get(rut);

            if (usuario != null) {
                System.out.println("-----Datos del usuario-----");
                usuario.mostrarInformacionUsuario();
            } else {
                System.out.println("No existe un usuario asociado a ese RUT");
            }
    }
    public void registrarCompra(Tienda tienda) {
        System.out.println("Ingrese el RUT del usuario: ");
        String rut = sc.nextLine();

        Usuarios usuario = tienda.getUsuarios().get(rut);

        if (usuario != null) {
            System.out.println("Ingrese el nombre del prodcuto comprado");
            String producto = sc.nextLine();
            usuario.agregarCompra(producto);
            System.out.println("Producto agregado al historial de compras.");
        } else {
            System.out.println("No existe un usuario asociado a ese RUT");
        }
    }

    public void registrarReservas(Tienda tienda) {
        System.out.println("Ingrese el RUT del usuario: ");
        String rut = sc.nextLine();
        Usuarios usuario = tienda.getUsuarios().get(rut);

        if (usuario != null) {
            System.out.println("Ingrese el nombre del prodcuto reservado");
            String producto = sc.nextLine();
            usuario.agregarReserva(producto);
            System.out.println("Producto agregado al historial de reservas");
        } else {
            System.out.println("No existe un usuario asociado a ese RUT");
        }
    }

}
