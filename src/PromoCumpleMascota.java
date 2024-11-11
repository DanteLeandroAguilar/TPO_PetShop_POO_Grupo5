import java.time.LocalDate;

public class PromoCumpleMascota extends Promo {

    @Override
    public double aplicarPromo(Cliente unCliente, double totalCompra, int cantidadKilos) {
        if(unCliente.esCumpleClienteMascota()) {
            totalCompra *= 0.90; // descuento del 10% (reduzco el total de la compra en un 10%, dejando solo el 90% del total)
            System.out.println("Se aplicó un descuento del 10% en el total de la compra por ser el cumple de la mascota");
        }
        return totalCompra;
    }
}
