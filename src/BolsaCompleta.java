public class BolsaCompleta extends Producto {
    private int precioPorPeso;

    public BolsaCompleta(int idProducto, TipoMascotaEnum tipoMascota, String nombre, String categoria, int precioUnitario, int precioPorPeso) {
        super(idProducto, tipoMascota, nombre, categoria, precioUnitario);
        this.precioPorPeso = precioPorPeso;
    }

    public int getPrecioPorPeso() {
        return precioPorPeso;
    }

    @Override
    public String toString() {
        return super.toString() + ", Precio por kilo: $" + precioPorPeso;
    }

}
