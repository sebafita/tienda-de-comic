package Services;

import java.util.Scanner;

import Tienda.Tienda;
import Mangas.Manga;
import Mangas.MangaNoDisponibleException;


public class ServicesManga {
    private Scanner sc = new Scanner(System.in);

    public void buscarMangas(Tienda tienda) throws MangaNoDisponibleException {
        System.out.print("Ingrese el manga que desea buscar: ");
        String tituloManga = sc.nextLine();

        boolean encontrado = false;

        for (Manga manga : tienda.getMangas()) {
            if (manga.getTitulo().equalsIgnoreCase(tituloManga)) {
                System.out.println("Manga encontrado: " + manga.getTitulo());
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            throw new MangaNoDisponibleException(
                    "Lo sentimos, en este momento no tenemos stock de " + tituloManga);
        }
    }
    public void agregarManga(Tienda tienda){
        System.out.print("Ingrese el manga que desea agregar: ");
        String nombreManga = sc.nextLine();

        Manga nuevoManga = new Manga(nombreManga);
        tienda.agregarManga(nuevoManga);
        tienda.getMangasDisponible().add(nombreManga);

        System.out.println("Manga agregado exitosamente");
    }
}
