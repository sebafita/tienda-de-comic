package Mangas;

public class Manga {
    private String titulo;
    private String autor;
    private boolean disponible;

    public Manga(String titulo, String autor, boolean disponible) {
        this.titulo = titulo;
        this.autor = autor;
        this.disponible = disponible;
    }

    public String getTitulo() {
        return titulo;
    }
    public String getAutor() {
        return autor;
    }
    public boolean isDisponible() {
        return disponible;
    }

    public void disponible() throws MangaNoDisponibleException {
        if (!disponible) {
            throw new MangaNoDisponibleException("El manga no se encuentra en stock en este momento :(.");
        }

        disponible = false;
    }
}
