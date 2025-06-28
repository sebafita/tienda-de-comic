package Utils;

import java.util.Scanner;

public class Utils {
    private static Scanner sc = new Scanner(System.in);


    public static void mostrarMenu() {

        System.out.println("\n---Bienvenido a Speedforce Comics ---");
        System.out.println("1. Registrar miembro en la tienda");
        System.out.println("2. Ver datos de miembro activo");
        System.out.println("3. Búsqueda de comics");
        System.out.println("4. Búsqueda de mangas");
        System.out.println("5. Búsqueda de Funkopop");
        System.out.println("6. Búsqueda de Figuras");
        System.out.println("7. Agregar comics a la tienda");
        System.out.println("8. Agregar mangas a la tienda");
        System.out.println("9. Agregar Funkopop a la tienda");
        System.out.println("10. Agregar Figuras a la tienda");
        System.out.println("11. Salir");

    }

    public static int leerEntero(String mensaje) {
        System.out.print(mensaje);
        return sc.nextInt();
    }

    public static String leerString(String mensaje) {
        System.out.println(mensaje);
        return sc.nextLine();
    }

}
