import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Supermercado {
    private List<Producto> productos;
    private List<Cliente> clientes;
    private List<Vendedor> vendedores;
    private List<Factura> facturas;

    public Supermercado() {
        productos = new ArrayList<>();
        clientes = new ArrayList<>();
        vendedores = new ArrayList<>();
        facturas = new ArrayList<>();
    }


    Date todayDate = new Date();

    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    public void registrarCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    public void registrarVendedor(Vendedor vendedor) {
        vendedores.add(vendedor);
    }

    public void registrarVenta(Cliente cliente, Vendedor vendedor, List<Producto> productosComprados) {
        Factura factura = new Factura(generarIdFactura(), todayDate, cliente, vendedor, productosComprados);
        facturas.add(factura);
        cliente.agregarFactura(factura);

        for (Producto producto : productosComprados) {
            producto.actualizarStock(-1);
        }
    }

    private String generarIdFactura() {
        return "FAC-" + (facturas.size() + 1);
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public List<Cliente> getClientes() {
        return clientes;
    }

    public List<Vendedor> getVendedores() {
        return vendedores;
    }

    public List<Factura> getFacturas() {
        return facturas;
    }
}
