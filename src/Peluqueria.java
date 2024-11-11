public class Peluqueria extends Producto {
    private int precioExtraTamanio;
    private int costoServicio;

    public Peluqueria(TipoMascota tipoMascota, String nombre, String categoria, int precioUnitario, int precioExtraTamanio) {
        super(tipoMascota, nombre, categoria, precioUnitario);
        this.precioExtraTamanio = precioExtraTamanio;
    }


    @Override
    public String toString() {
        return super.toString() + ", Precio final por tamaño= $" + (precioExtraTamanio + costoServicio);
    }

}
