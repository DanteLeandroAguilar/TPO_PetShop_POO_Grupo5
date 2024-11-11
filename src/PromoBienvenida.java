import java.time.LocalDate;

public class PromoBienvenida extends Promo {
    @Override
    public double aplicarPromo(Cliente unCliente, double totalCompra, int cantidadKilos) {
        if (unCliente.getProductosComprados().isEmpty()) { // verifico si es su primera compra en el petShop
            totalCompra = totalCompra * 0.85; // descuento del 15%
            System.out.println("Se aplicó el descuento de bienvenida del 15%");
        }
        return totalCompra;
    }
}
