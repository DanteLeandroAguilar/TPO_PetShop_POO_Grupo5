import java.time.LocalDate;

public class PromoCliente extends Promo {
    @Override
    public double aplicarPromo(Cliente unCliente, double totalCompra, int cantidadKilos) {
        if(unCliente.getProductosComprados().size() >= 5) {
            totalCompra = totalCompra - 10000; // descuento de $10000
            System.out.println("Se aplicó el descuento de $10000");
        }
        // Promo 3x2
        if (cantidadKilos >= 3) {
            double precioPorKilo = totalCompra / cantidadKilos;
            totalCompra = totalCompra - precioPorKilo; // Descuento 1 kilo (es gratis)
            System.out.println("Se aplico la promo 3x2");
        }

        return totalCompra;
    }
}
