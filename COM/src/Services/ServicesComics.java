package Services;

import java.util.Scanner;
import Tienda.Tienda;
import Comics.Comics;
import Comics.ComicNoDisponibleException;

public class ServicesComics {
    private Scanner sc = new Scanner(System.in);

    public void buscarComics(Tienda tienda) throws ComicNoDisponibleException {
        System.out.println("Ingrese el comic que desea buscar: ");
        String tituloComic = sc.nextLine();

        boolean encontrado = false;

        for (Comics comic : tienda.getComics()) {
            if (comic.getTitulo().equalsIgnoreCase(tituloComic)) {
                System.out.println("Comic encontrado: " + comic.getTitulo());
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            throw new ComicNoDisponibleException(
                    "Lo sentimos, en este momento no tenemos stock de " + tituloComic);
        }
    }

    public void agregarComic(Tienda tienda) {
        System.out.println("Ingrese el comic que desea agregar: ");
        String nombreComic = sc.nextLine();

        Comics nuevoComic = new Comics(nombreComic);
        tienda.agregarComic(nuevoComic);
        tienda.getComicsDisponible().add(nombreComic);

        System.out.println("Comic : " + nuevoComic.getTitulo() + " agregado exitosamente");

    }

}
