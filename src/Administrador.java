public class Administrador {
    private String nombre;

    public Administrador(String nombre) {
        this.nombre = nombre;
    }

    public void gestionarVenta(Cliente cliente) {
        // Lógica para gestionar la venta
    }

    public Factura generarFactura(Cliente cliente) {
        Factura factura = new Factura(cliente.getCarrito());
        factura.registrarDetalles();
        return factura;
    }

    public void registrarProducto(Producto producto) {
        // Lógica para registrar un nuevo producto
    }

    public void actualizarInventario(Producto producto, int cantidad) {
        producto.actualizarInventario(cantidad);
    }

    public void crearCliente(Cliente cliente) {
        // Lógica para crear un nuevo cliente
    }

    public void crearVendedor(Vendedor vendedor) {
        // Lógica para crear un nuevo vendedor
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
