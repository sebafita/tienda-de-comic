package Services;

import Tienda.Tienda;
import Comics.Comics;
import Mangas.Manga;
import Figuras.Figuras;
import Funkopop.FunkoPop;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.stream.Collectors;

public class TiendaService {
    public void cargarComicsDesdeArchivo(Tienda tienda) {
        String archivo = "COM/comics.csv";

        try {
            BufferedReader br = new BufferedReader(new FileReader(archivo));
            String linea;

            while ((linea = br.readLine()) !=null) {
                String[] datos = linea.split(",");
                String titulo = datos[0];
                String autor = datos[1];
                boolean disponible = Boolean.parseBoolean(datos[2]);

                Comics comic = new Comics(titulo, autor, disponible);
                tienda.agregarComic(comic);
                tienda.getComicsDisponible().add(titulo);
            }
            System.out.println("Datos de comics cargados exitosamente");
        } catch (IOException e) {
            System.out.println("Error al leer el archivo");
        }
    }
    public void cargarMangasDesdeArchivo(Tienda tienda) {
        String archivo = "COM/mangas.csv";

        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
            br.readLine();
            String linea;


            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split(",");
                String titulo = datos[0];
                String autor = datos[1];
                boolean disponible = Boolean.parseBoolean(datos[2]);

                Manga manga = new Manga(titulo, autor, disponible);
                tienda.agregarManga(manga);
                tienda.getMangasDisponible().add(titulo);
            }
            System.out.println("Datos de mangas cargados exitosamente");
        } catch (IOException e) {
            System.out.println("Error al leer el archivo");
        }
    }

    public void cargarFunkopopDesdeArchivo(Tienda tienda) {
        String archivo = "COM/funkopop.csv";

        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
            String linea;

            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split(",");
                String nombre = datos[0];
                String serie = datos[1];
                boolean disponible = Boolean.parseBoolean(datos[2]);

                FunkoPop funkoPop = new FunkoPop(nombre, serie, disponible);
                tienda.agregarFunkoPop(funkoPop);
                tienda.getFunkoPopDisponible().add(nombre);
            }
            System.out.println("Datos de funkopop cargados exitosamente");
        } catch (IOException e) {
            System.out.println("Error al leer el archivo");
        }
    }

    public void cargarFigurasDesdeArchivo(Tienda tienda) {
        String archivo = "COM/figuras.csv";

        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
            String linea;

            while ((linea = br.readLine()) !=null) {
                String[] datos = linea.split(",");
                String nombre = datos[0];
                String serie = datos[1];
                boolean disponible = Boolean.parseBoolean(datos[2]);

                Figuras figuras = new Figuras(nombre, serie, disponible);
                tienda.agregarFiguras(figuras);
                tienda.getFigurasDisponible().add(nombre);
            }
            System.out.println("Datos de figuras cargados exitosamente");
        } catch (IOException e) {
            System.out.println("Error al leer el archivo");
        }
    }
}
