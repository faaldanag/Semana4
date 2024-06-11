import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private int Documento;
    public String Nombre, Apellido, Direccion;
    public String  Celular;
    private List<Factura> HistorialCompras;


    public Cliente(int documento, String nombre, String apellido, String direccion, String celular) {
        Documento = documento;
        Nombre = nombre;
        Apellido = apellido;
        Direccion = direccion;
        Celular = celular;
    }

    public String getCelular() {
        return Celular;
    }


    public void setCelular(String  celular) {
        Celular = celular;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String direccion) {
        Direccion = direccion;
    }


    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String apellido) {
        Apellido = apellido;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public int getDocumento() {
        return Documento;
    }

    public void setDocumento(int documento) {
        Documento = documento;
    }

    public void agregarFactura(Factura factura) {
        HistorialCompras.add(factura);
    }
}
