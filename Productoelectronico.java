
public class ProductoElectronico extends Producto {

    private String marca;
    private int garantia;

    public ProductoElectronico(String codigo, String nombre,
            double precio, int cantidad,
            String marca, int garantia) {

        super(codigo, nombre, precio, cantidad);
        this.marca = marca;
        this.garantia = garantia;
    }

    @Override
    public void mostrarInformacion() {

        System.out.println("PRODUCTO ELECTRONICO");
        System.out.println("Codigo: " + codigo);
        System.out.println("Nombre: " + nombre);
        System.out.println("Precio: $" + precio);
        System.out.println("Cantidad: " + cantidad);
        System.out.println("Marca: " + marca);
        System.out.println("Garantia: " + garantia + " meses");

        System.out.println("Valor total: $"
                + calcularValorInventario());
    }
}
