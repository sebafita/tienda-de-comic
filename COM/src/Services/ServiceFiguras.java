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
}
