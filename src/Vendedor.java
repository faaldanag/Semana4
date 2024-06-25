public class Vendedor {
    private String nombre;

    public Vendedor(String nombre) {
        this.nombre = nombre;
    }

    public void registrarProducto(Producto producto) {
        // Lógica para registrar un nuevo producto
    }

    public void actualizarProducto(Producto producto) {
        // Lógica para actualizar un producto
    }

    public void eliminarProducto(Producto producto) {
        // Lógica para eliminar un producto
    }

    public void gestionarVenta(Cliente cliente) {
        // Lógica para gestionar la venta
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}