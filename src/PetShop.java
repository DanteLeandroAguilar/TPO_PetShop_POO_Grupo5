import java.util.ArrayList;

public class PetShop {

    private ArrayList<Producto> productosOfrecidos = new ArrayList<Producto>();

    public void cargarInventario(Inventario inventario) {
        this.productosOfrecidos = inventario.getProductosOfrecidos();
    }

    // Muestra los productos dosponibles que puede ofrecer el petshop
    public void mostrarProductosDisponibles() {
        System.out.println("Lista de Productos");
        for (Producto productoDisponible : productosOfrecidos) {
            System.out.println(productoDisponible.toString());
        }
    }

    // Sin aplicar las promociones del cliente (ADEMAS AGREGAR LAS EXCEPCIONCES CUANDO LO VEAMOS)
    public void venderAlimento(Cliente unCliente, BolsaCompleta bolsaCompleta, Mascota mascotaCliente, boolean alimentoPorKilo, double cantidad) {
        // creo una variable para sumar la el total del dia?
        if(bolsaCompleta.esAptoParaComprarProducto(mascotaCliente)) {
            double precioTotal;
            if(alimentoPorKilo) {
                precioTotal = bolsaCompleta.getPrecioPorPeso() * cantidad;
            } else {
                precioTotal = bolsaCompleta.getPrecioUnitario();
            }
            // registro el producto comprado por el cliente
            unCliente.agregarProductoComprado(bolsaCompleta);
        } else {
            System.out.println("El producto" + bolsaCompleta.getNombre() + "no es apto para " + mascotaCliente.getTipo());
        }
    }

    // Sin aplicar las promociones del cliente (ADEMAS AGREGAR LAS EXCEPCIONCES CUANDO LO VEAMOS)
    public void venderJuguete(Cliente unCliente, Producto unProducto, Mascota mascotaCliente, double cantidad) {

        if(unProducto.esAptoParaComprarProducto(mascotaCliente)) {
            double precioTotal;
            precioTotal = unProducto.getPrecioUnitario() * cantidad;

            // registro el producto comprado por el cliente
            unCliente.agregarProductoComprado(unProducto);

        } else {
            System.out.println("El producto" + unProducto.getNombre() + "no es apto para " + mascotaCliente.getTipo());
        }
    }
}
