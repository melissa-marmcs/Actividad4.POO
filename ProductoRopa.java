
public class ProductoRopa extends Producto {

    private String talla;
    private String material;

    public ProductoRopa(String codigo, String nombre,
            double precio, int cantidad,
            String talla, String material) {

        super(codigo, nombre, precio, cantidad);
        this.talla = talla;
        this.material = material;
    }

    @Override
    public void mostrarInformacion() {

        System.out.println("PRODUCTO DE ROPA");
        System.out.println("Codigo: " + codigo);
        System.out.println("Nombre: " + nombre);
        System.out.println("Precio: $" + precio);
        System.out.println("Cantidad: " + cantidad);
        System.out.println("Talla: " + talla);
        System.out.println("Material: " + material);

        System.out.println("Valor total: $"
                + calcularValorInventario());
    }
}
