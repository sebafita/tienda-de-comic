package Tienda;

import Comics.Comics;
import Figuras.Figuras;
import Funkopop.FunkoPop;
import Mangas.Manga;
import Usuario.Usuarios;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Tienda {
    private ArrayList<Comics> comics;
    private ArrayList<Manga> mangas;
    private ArrayList<FunkoPop> funkoPops;
    private ArrayList<Figuras> figuras;
    private HashMap<String, Usuarios> usuarios;
    private HashSet<String> comicsDisponible;
    private HashSet<String> mangasDisponible;
    private HashSet<String> funkoPopDisponible;
    private HashSet<String> figurasDisponible;

    public Tienda() {
        this.comics = new ArrayList<>();
        this.mangas = new ArrayList<>();
        this.funkoPops = new ArrayList<>();
        this.figuras = new ArrayList<>();
        this.usuarios = new HashMap<>();
        this.comicsDisponible = new HashSet<>();
        this.mangasDisponible = new HashSet<>();
        this.funkoPopDisponible = new HashSet<>();
        this.figurasDisponible = new HashSet<>();
    }

    public void agregarComic(Comics comic) { comics.add(comic); }
    public void agregarManga(Manga manga) { mangas.add(manga); }
    public void agregarFunkoPop(FunkoPop fp) {funkoPops.add(fp); }
    public void agregarFiguras(Figuras f) {figuras.add(f); }
}
