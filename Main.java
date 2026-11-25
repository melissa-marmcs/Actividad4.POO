
public class Main {

    public static void main(String[] args) {

        // Crear inventario
        Inventario inventario = new Inventario();

        // Crear productos de diferentes tipos
        ProductoElectronico electronico =
            new ProductoElectronico(
                "E001", "Laptop", 12500, 5,
                "HP", 12
            );

        ProductoAlimenticio alimento =
            new ProductoAlimenticio(
                "A001", "Leche", 28, 20,
                "30/12/2026", "Lacteos"
            );

        ProductoRopa ropa =
            new ProductoRopa(
                "R001", "Playera", 150, 10,
                "Mediana", "Algodon"
            );

        // Agregar productos al inventario
        inventario.agregarProducto(electronico);
        inventario.agregarProducto(alimento);
        inventario.agregarProducto(ropa);

        // Mostrar información de los productos
        inventario.mostrarInventario();

        // Mostrar resumen general
        System.out.println("\n===== RESUMEN =====");

        System.out.println("Productos registrados: "
                + inventario.obtenerCantidadProductos());

        System.out.println("Valor total del inventario: $"
                + inventario.calcularTotalInventario());
    }
}
