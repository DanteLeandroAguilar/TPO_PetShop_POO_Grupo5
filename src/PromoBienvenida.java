public class PromoBienvenida extends Promo {

    // Método para validar si es la primer compra del cliente en el Pet Shop
    @Override
    public boolean esAplicable(Cliente unCliente, int cantidadKilos) {
        return unCliente.primeraCompra();
    }

    // Si es la primer compra del cliente en el Pet Shop, le realizamos un descuento del 15% en el total de la compra
    @Override
    public double aplicarPromo(double totalCompra){
        return totalCompra * 0.85;
    }

}
