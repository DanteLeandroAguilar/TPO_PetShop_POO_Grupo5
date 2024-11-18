public class Promo3x2 extends Promo {

    // Método para validar si el cliente solicitó 3 kilos de alimento
    @Override
    public boolean esAplicable(Cliente unCliente, int cantidadKilos) {
        return cantidadKilos == 3;
    }

    // Si el cliente solicitó 3 kilos de alimento, le descontamos 1 kilo al precio total
    @Override
    public double aplicarPromo(double totalCompra) {
        return totalCompra - (totalCompra / 3);
    }
}
