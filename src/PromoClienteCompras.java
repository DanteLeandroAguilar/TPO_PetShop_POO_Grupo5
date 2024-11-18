public class PromoClienteCompras extends Promo {

    // Método para validar si el cliente ya compró 5 productos en el Pet Shop dentro de su historial
    @Override
    public boolean esAplicable(Cliente unCliente, int cantidadKilos) {
        return unCliente.getProductosComprados().size() == 5;
    }

    // Si el cliente cumple con las 5 compras, se le otorga un descuento del $10000 en el total de la compra
    @Override
    public double aplicarPromo(double totalCompra) {
        return totalCompra - 10000;
    }
}
