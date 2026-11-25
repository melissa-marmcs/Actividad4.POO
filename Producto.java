
public abstract class Producto implements Gestionable {

    protected String codigo;
    protected String nombre;
    protected double precio;
    protected int cantidad;

    public Producto(String codigo, String nombre,
                    double precio, int cantidad) {

        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public double calcularValorInventario() {
        return precio * cantidad;
    }

    public abstract void mostrarInformacion();
}
