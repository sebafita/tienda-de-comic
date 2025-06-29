package Usuario;

import Interface.InfoUsuario;

public class Usuarios implements InfoUsuario {
    private String nombre;
    private String rut;
    private String correo;
    private String direccion;

    public Usuarios(String nombre, String rut, String correo, String direccion) {
        this.nombre = nombre;
        this.rut = rut;
        this.correo = correo;
        this.direccion = direccion;
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

        @Override
        public void mostrarInformacionUsuario() {
            System.out.println("Nombre: " + nombre);
            System.out.println("Rut: " + rut);
            System.out.println("Correo: " + correo);
            System.out.println("Direccion: " + direccion);

    }
}

