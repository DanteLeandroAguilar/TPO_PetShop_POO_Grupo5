public class BolsaCompleta extends Producto {
    private int precioPorPeso; // Las bolsas de alimento también pueden venderse por kilo, en vez de por unidad

    public BolsaCompleta(int idProducto, TipoMascotaEnum tipoMascota, String nombre, String categoria, int precioUnitario, int precioPorPeso) {
        super(idProducto, tipoMascota, nombre, categoria, precioUnitario);
        this.precioPorPeso = precioPorPeso;
    }

    // Si el cliente solicita una bolsa de alimento, verificamos si la venta es por bolsa completa o por kilo
    // Una vez lo validamos, calculamos el precio de venta
    @Override
    public double calcularPrecio(double cantidad, boolean porKilo){
        if (porKilo){
            return precioPorPeso * cantidad;
        }
        return super.calcularPrecio(cantidad, porKilo);
    }

    @Override
    public String toString() {
        return super.toString() + ", Precio por kilo: $" + precioPorPeso;
    }

}
