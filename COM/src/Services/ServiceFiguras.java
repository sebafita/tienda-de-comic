package Services;

import java.util.Scanner;
import Tienda.Tienda;
import Figuras.Figuras;
import Figuras.FiguraNoDisponibleException;

public class ServiceFiguras {
    private Scanner sc = new Scanner(System.in);

    public void buscarFigura(Tienda tienda) throws FiguraNoDisponibleException {
        System.out.println("Ingrese el nombre de la figura que desea buscar: ");
        String nombreFigura = sc.nextLine();

        boolean encontrado = false;

        for (Figuras f : tienda.getFiguras()) {
            if (f.getNombre().equalsIgnoreCase(nombreFigura)) {
                System.out.println("Figura encontrada: " + f.getNombre());
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            throw new FiguraNoDisponibleException(
                    "Lo sentimos, en este momento no tenemos stocke de " + nombreFigura);
        }
    }
    public void agregarFigura(Tienda tienda) {
        System.out.println("Ingrese el nombre de la figura que desea agregar: ");
        String nombre = sc.nextLine();

        Figuras f = new Figuras(nombre);
        tienda.agregarFiguras(f);
        tienda.getFigurasDisponible().add(nombre);

        System.out.println("Figura agregado exitosamente");

    }
}
