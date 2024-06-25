import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private String nombre;
    private List<Producto> carrito;

    public Cliente(String nombre) {
        this.nombre = nombre;
        this.carrito = new ArrayList<>();
    }

    public void buscarProducto(Producto producto) {
        // Lógica para buscar productos
    }

    public void añadirProducto(Producto producto) {
        carrito.add(producto);
    }

    public void eliminarProducto(Producto producto) {
        carrito.remove(producto);
    }

    public void realizarCompra(Administrador administrador) {
        Factura factura = administrador.generarFactura(this);
        // Lógica para realizar la compra con la factura generada
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Producto> getCarrito() {
        return carrito;
    }

    public void setCarrito(List<Producto> carrito) {
        this.carrito = carrito;
    }
}