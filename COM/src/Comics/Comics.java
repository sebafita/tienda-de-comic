package Comics;

public class Comics {
    private String titulo;
    private String autor;
    private boolean disponible;

    public Comics(String titulo, String autor, boolean disponible) {
        this.titulo = titulo;
        this.autor = autor;
        this.disponible = disponible;
    }

    public Comics(String titulo) {
        this.titulo = titulo;
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
    public void disponible() throws ComicNoDisponibleException {
        if (!disponible) {
            throw new ComicNoDisponibleException("El comic no se encuentra en stock en este momento :(.");
        }

        disponible = false;
    }
}
