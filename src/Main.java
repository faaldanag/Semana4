import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Date;

public class Main {
    public static void main(String[] args) {

        Supermercado supermercado = new Supermercado();

        Producto prod1 = new Producto("001", "Leche", 1.20, 100, "Lácteos");
        Producto prod2 = new Producto("002", "Pan", 0.80, 50, "Panadería");
        supermercado.agregarProducto(prod1);
        supermercado.agregarProducto(prod2);

        //Agregar cliente
        Cliente cliente1 = new Cliente(0001, "Juan", "Perez", "Av. Siempre Viva 123", "3123456789");
        supermercado.registrarCliente(cliente1);

        //Agregar cliente
        Vendedor vendedor1 = new Vendedor(0002, "Juan", "Perez", "3123456789");
        supermercado.registrarVendedor(vendedor1);

        //Agregar Factura
        supermercado.registrarVenta(cliente1, vendedor1, Arrays.asList(prod1, prod2));
        Factura factura = supermercado.getFacturas().get(0);

        System.out.println("Total de la factura: " + factura.getTotal());
    }
}