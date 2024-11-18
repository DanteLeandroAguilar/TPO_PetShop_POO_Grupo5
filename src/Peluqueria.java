public class Peluqueria extends Producto {
    private int precioExtraTamanio;

    public Peluqueria(int idProducto, TipoMascotaEnum tipoMascota, String nombre, String categoria, int precioUnitario, int precioExtraTamanio) {
        super(idProducto, tipoMascota, nombre, categoria, precioUnitario);
        this.precioExtraTamanio = precioExtraTamanio;
    }

    // Calculamos el precio del baño dependiendo del tamaño del perro
    @Override
    public double calcularPrecio(double cantidad, boolean porKilo) {
        if (!porKilo) {
            return (precioExtraTamanio + super.getPrecioUnitario()) * cantidad;
        }
        return super.calcularPrecio(cantidad, porKilo);
    }

    @Override
    public String toString() {
        return super.toString() + ", Precio final por tamaño: $" + (precioExtraTamanio + super.getPrecioUnitario());
    }

}
