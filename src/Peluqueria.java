public class Peluqueria extends Producto {
    private int precioExtraTamanio;

    public Peluqueria(int idProducto, TipoMascotaEnum tipoMascota, String nombre, String categoria, int precioUnitario, int precioExtraTamanio) {
        super(idProducto, tipoMascota, nombre, categoria, precioUnitario);
        this.precioExtraTamanio = precioExtraTamanio;
    }


    @Override
    public String toString() {
        return super.toString() + ", Precio final por tamaño: $" + (precioExtraTamanio + super.getPrecioUnitario());
    }

}
