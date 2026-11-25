
import java.util.ArrayList;

public class Inventario {

    private ArrayList<Producto> productos;

    public Inventario() {
        productos = new ArrayList<>();
    }

    // Agregar productos al inventario
    public void agregarProducto(Producto producto) {
        productos.add(producto);
        System.out.println("Producto agregado correctamente.");
    }

    // Mostrar todos los productos
    public void mostrarInventario() {

        System.out.println("\n===== INVENTARIO GENERAL =====");

        for (Producto producto : productos) {
            producto.mostrarInformacion();
            System.out.println("----------------------------");
        }
    }

    // Calcular el valor total del inventario
    public double calcularTotalInventario() {

        double total = 0;

        for (Producto producto : productos) {
            total += producto.calcularValorInventario();
        }

        return total;
    }

    // Consultar cantidad de productos registrados
    public int obtenerCantidadProductos() {
        return productos.size();
    }
}
