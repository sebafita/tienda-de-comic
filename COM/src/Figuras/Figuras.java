package Figuras;

import Funkopop.FunkoPopNoDisponibleException;

public class Figuras {
    private String nombre;
    private String serie;
    private boolean disponible;

    public Figuras(String nombre, String serie, boolean disponible) {
        this.nombre = nombre;
        this.serie = serie;
        this.disponible = disponible;
    }
    public Figuras(String nombre) {
        this.nombre = nombre;
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
public void disponible() throws FiguraNoDisponibleException {
        if (!disponible) {
            throw new FiguraNoDisponibleException("Lo sentimos, en este momento la figura no se encuentra en stock :(");
        }
        disponible = false;
}
}
