import java.util.Scanner;

import Tienda.Tienda;
import Usuario.Usuarios;
import Utils.Utils;

import Services.ServicesComics;
import Services.UsuariosService;
import Services.ServicesManga;
import Services.ServiceFiguras;
import Services.ServiceFunkoPops;
import Services.TiendaService;

import Comics.ComicNoDisponibleException;
import Mangas.MangaNoDisponibleException;
import Funkopop.FunkoPopNoDisponibleException;
import Figuras.FiguraNoDisponibleException;


public class Main {
    public static void main(String[] args) {
        Tienda tienda = new Tienda();
        UsuariosService usuariosService = new UsuariosService();
        TiendaService tiendaService = new TiendaService();
        ServicesComics servicesComics = new ServicesComics();
        ServicesManga servicesManga = new ServicesManga();
        ServiceFunkoPops servicesFunkoPops = new ServiceFunkoPops();
        ServiceFiguras servicesFiguras = new ServiceFiguras();
        Scanner sc = new Scanner(System.in);

        tiendaService.cargarComicsDesdeArchivo(tienda);
        tiendaService.cargarMangasDesdeArchivo(tienda);
        tiendaService.cargarFunkopopDesdeArchivo(tienda);
        tiendaService.cargarFigurasDesdeArchivo(tienda);

        System.out.println("Los datos han sido cargados correctamente desde los archivos");

        int opcion;



        do {
            Utils.mostrarMenu();
            opcion = Utils.leerEntero("Seleccione una opción: ");
            switch (opcion) {
                case 1:
                    Usuarios nuevoUsuario = usuariosService.registrarUsuario();
                    tienda.getUsuarios().put(nuevoUsuario.getRut(), nuevoUsuario);
                    System.out.println("Usuario registrado exitosamente");
                    break;

                case 2:
                        System.out.println("Ingrese el Rut del miembro que desea buscar: ");
                        String rutBuscado = sc.nextLine();
                        usuariosService.mostrarDatosUsuario(tienda, rutBuscado);
                        break;
                case 3:
                    usuariosService.registrarCompra(tienda);
                    break;

                case 4:
                    usuariosService.registrarReservas(tienda);
                    break;

                case 5:
                    try {
                        servicesComics.buscarComics(tienda);
                    } catch (ComicNoDisponibleException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 6:
                    try {
                        servicesManga.buscarMangas(tienda);
                    } catch (MangaNoDisponibleException e) {
                        System.out.println(e.getMessage());
                    }
                    break;

                case 7:
                    try {
                        servicesFunkoPops.buscarFunkoPop(tienda);
                    } catch (FunkoPopNoDisponibleException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 8:
                    try {
                        servicesFiguras.buscarFigura(tienda);
                    } catch (FiguraNoDisponibleException e) {
                        System.out.println(e.getMessage());
                    }
                    break;

                case 9:
                    servicesComics.agregarComic(tienda);
                    break;
                case 10:
                    servicesManga.agregarManga(tienda);
                    break;
                case 11:
                    servicesFunkoPops.agregarFunkopop(tienda);
                    break;
                case 12:
                    servicesFiguras.agregarFigura(tienda);
                    break;
                case 13:
                    tiendaService.guardarUsuarioDesdeArchivo(tienda);
                    System.out.println("Gracias por preferir Speedforce Comics");
                    break;
                default:
                    System.out.println("Opcion no valida");
            }
        } while (opcion != 13);

        sc.close();
    }
}