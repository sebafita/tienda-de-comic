package Usuario;

import Interface.InfoUsuario;

import java.util.ArrayList;

public class Usuarios implements InfoUsuario {
    private String nombre;
    private String rut;
    private String correo;
    private String direccion;
    private ArrayList<String> historialCompras;
    private ArrayList<String> historialReservas;

    public Usuarios(String nombre, String rut, String correo, String direccion) {
        this.nombre = nombre;
        this.rut = rut;
        this.correo = correo;
        this.direccion = direccion;
        this.historialCompras = new ArrayList<>();
        this.historialReservas = new ArrayList<>();
    }
    public String getNombre() {

        return nombre;
    }
    public String getRut() {

        return rut;
    }
    public String getCorreo() {

        return correo;
    }
    public String getDireccion() {

        return direccion;
    }
    public ArrayList<String> getHistorialCompras() {
        return historialCompras;
    }
    public ArrayList<String> getHistorialReservas() {
        return historialReservas;
    }
    public void agregarCompra(String producto) {
        historialCompras.add(producto);
    }
    public void agregarReserva(String producto) {
        historialReservas.add(producto);
    }



        @Override
        public void mostrarInformacionUsuario() {
            System.out.println("Nombre: " + nombre);
            System.out.println("Rut: " + rut);
            System.out.println("Correo: " + correo);
            System.out.println("Direccion: " + direccion);
            System.out.println("Historial compras: " + historialCompras);
            System.out.println("Historial reservas: " + historialReservas);

    }
}

