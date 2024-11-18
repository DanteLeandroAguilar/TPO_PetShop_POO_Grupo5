
public class PromoCumpleMascota extends Promo {

    // Método para validar si es el cumpleaños de la mascota del cliente el día de la visita al Pet Shop
    @Override
    public boolean esAplicable(Cliente unCliente, int cantidadKilos) {
        return unCliente.esCumpleClienteMascota();
    }

    // Si es el cumpleaños de la mascota del cliente, le otorgamos un descuento del 10% sobre el total de la compra
    @Override
    public double aplicarPromo(double totalCompra) {
        return totalCompra * 0.90;
    }
}
