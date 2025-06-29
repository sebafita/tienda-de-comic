package Funkopop;

public class FunkoPop {
    private String nombre;
    private String serie;
    private boolean disponible;

    public FunkoPop(String nombre, String serie, boolean disponible) {
        this.nombre = nombre;
        this.serie = serie;
        this.disponible = disponible;
    }
    public FunkoPop(String nombre) {
        this.nombre = nombre;
        this.serie = "desconocido";
        this.disponible = false;
    }

    public String getNombre() {

        return nombre;
    }
    public String getSerie() {

        return serie;
    }
    public boolean isDisponible() {

        return disponible;
    }

    public void disponible() throws FunkoPopNoDisponibleException {
        if (!disponible) {
            throw new FunkoPopNoDisponibleException("Lo sentimos, en este momento este FunkoPop no se encuentra en stock :(");
        }

        disponible = false;
    }
}
