
public class ProductoAlimenticio extends Producto {

    private String fechaCaducidad;
    private String categoria;

    public ProductoAlimenticio(String codigo, String nombre,
            double precio, int cantidad,
            String fechaCaducidad, String categoria) {

        super(codigo, nombre, precio, cantidad);
        this.fechaCaducidad = fechaCaducidad;
        this.categoria = categoria;
    }

    @Override
    public void mostrarInformacion() {

        System.out.println("PRODUCTO ALIMENTICIO");
        System.out.println("Codigo: " + codigo);
        System.out.println("Nombre: " + nombre);
        System.out.println("Precio: $" + precio);
        System.out.println("Cantidad: " + cantidad);
        System.out.println("Caducidad: " + fechaCaducidad);
        System.out.println("Categoria: " + categoria);

        System.out.println("Valor total: $"
                + calcularValorInventario());
    }
}
