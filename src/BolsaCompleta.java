public class BolsaCompleta extends Producto {
    private int precioPorPeso;

    public BolsaCompleta(TipoMascota tipoMascota, String nombre, String categoria, int precioUnitario, int precioPorPeso) {
        super(tipoMascota, nombre, categoria, precioUnitario);
        this.precioPorPeso = precioPorPeso;
    }

    public int getPrecioPorPeso() {
        return precioPorPeso;
    }

    @Override
    public String toString() {
        return super.toString() + ", Precio por kilo= $" + precioPorPeso;
    }

}
