import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        // Crear algunos productos
        Producto producto1 = new Producto("Leche", 2.5, 100, "Leche desnatada");
        Producto producto2 = new Producto("Pan", 1.0, 200, "Pan integral");

        // Crear un cliente
        Cliente cliente1 = new Cliente("Juan");

        // El cliente busca productos
        cliente1.buscarProducto(producto1);
        cliente1.buscarProducto(producto2);

        // El cliente añade productos al carrito
        cliente1.añadirProducto(producto1);
        cliente1.añadirProducto(producto2);

        // El cliente elimina un producto del carrito
        cliente1.eliminarProducto(producto2);

        // El cliente realiza la compra
        Administrador administrador = new Administrador("Admin1");
        cliente1.realizarCompra(administrador);

        // Crear un vendedor
        Vendedor vendedor1 = new Vendedor("Ana");

        // El vendedor registra un nuevo producto
        vendedor1.registrarProducto(new Producto("Manzanas", 1.5, 150, "Manzanas rojas"));

        // El administrador gestiona una venta
        administrador.gestionarVenta(cliente1);
    }
}