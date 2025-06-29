package Services;

import java.util.Scanner;

import Tienda.Tienda;
import Funkopop.FunkoPop;
import Funkopop.FunkoPopNoDisponibleException;

public class ServiceFunkoPops {
    private Scanner sc = new Scanner(System.in);

    public void buscarFunkoPop(Tienda tienda) throws FunkoPopNoDisponibleException {
        System.out.println("Ingrese el nombre del FunkoPop que desea buscar: ");
        String nombreFunkoPop = sc.nextLine();

        boolean encontrado = false;

        for (FunkoPop fp : tienda.getFunkoPops()) {
            if (fp.getNombre().equalsIgnoreCase(nombreFunkoPop)) {
                System.out.println("FunkoPop encontrado: " + fp.getNombre());
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            throw new FunkoPopNoDisponibleException(
                    "Lo sentimos, en este momento no tenemos stock de " + nombreFunkoPop);
        }
    }
    public void agregarFunkopop(Tienda tienda) {
        System.out.println("Ingrese el nombre del FunkoPop");
        String nombreFunkoPop = sc.nextLine();

        FunkoPop nuevoFunkoPop = new FunkoPop(nombreFunkoPop);
        tienda.agregarFunkoPop(nuevoFunkoPop);
        tienda.getFunkoPopDisponible().add(nombreFunkoPop);

        System.out.println("FunkoPop: " + nuevoFunkoPop.getNombre() + " agregado existosamente");
    }
}
