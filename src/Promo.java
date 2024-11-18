public abstract class Promo {

    // Método para verificar si la promoción es aplicable
    public abstract boolean esAplicable(Cliente unCliente, int cantidadKilos);

    // Método para aplicar la promoción
    public abstract double aplicarPromo(double totalCompra);

}


