import java.util.List;

public class Factura {
    private List<Producto> productos;
    private double total;

    public Factura(List<Producto> productos) {
        this.productos = productos;
        this.total = calcularTotal();
    }

    private double calcularTotal() {
        double total = 0;
        for (Producto producto : productos) {
            total += producto.getPrecio() * producto.getCantidad();
        }
        return total;
    }

    public void registrarDetalles() {
        // Lógica para registrar los detalles de la compra
    }

    // Getters y Setters
    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
}