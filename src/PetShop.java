import java.util.ArrayList;

public class PetShop {

    private ArrayList<Producto> productosOfrecidos = new ArrayList<Producto>();
    private ArrayList<Promo> promociones = new ArrayList<>();

    // Método para cargar las ArrayList de productos que ofrece el Pet Shop y las promociones
    public void cargarInventarioyPromociones(Inventario inventario) {
        this.productosOfrecidos = inventario.getProductosOfrecidos();
        this.promociones.add(new PromoBienvenida()); // posicion 0
        this.promociones.add(new PromoClienteCompras()); // posicion 1
        this.promociones.add(new Promo3x2()); // posicion 2
        this.promociones.add(new PromoCumpleMascota()); // posicion 3
    }

    // Muestra en pantalla los productos dosponibles que puede ofrecer el Pet Shop para poder comenzar una venta
    public void mostrarProductosDisponibles() {
        System.out.println("Lista de Productos");
        for (Producto productoDisponible : productosOfrecidos) {
            System.out.println(productoDisponible.toString());
        }
    }

    // Método para vender cualquier producto del Pet Shop
    public void venderProducto(Cliente unCliente, Mascota mascota, int idProducto,  int cantidad, boolean alimentoPorKilo) throws PetShopException {
        try {
            for (Producto producto : productosOfrecidos) { // Iteramos dentro de los productos del ArrayList
                if (producto.getIdProducto() == idProducto) { // Buscamos el producto elegido por el cliente según el ID
                    if (producto.esAptoParaComprarProducto(mascota)) {// Le preguntamos al producto si es apto para la mascota del cliente
                        double precioTotal = producto.calcularPrecio(cantidad, alimentoPorKilo); // Si es apto, calculamos su precio
                        for (Promo promo : promociones) { // Una vez calculado su precio, iteramos dentro del ArrayList de promos para ver si aplican
                            if (promo.esAplicable(unCliente, cantidad)) { // Le preguntamos a la promo si es aplicable para el cliente
                                precioTotal = promo.aplicarPromo(precioTotal); // Si califica, se aplica la promoción
                            }
                        }
                        // registro el producto comprado por el cliente
                        unCliente.agregarProductoComprado(producto);
                        System.out.println("El precio final es de: $" + precioTotal);
                        return; // Encontramos el producto y se finalizó la venta
                    } else {
                        throw new PetShopException("El cliente no puede comprar dicho producto ya que no es apto para su mascota"); // El cliente elige un producto que no corresponde con las mascotas que tiene
                    }
                }
            }
            throw new PetShopException("No se encontró ningún producto con el ID solicitado"); // Se ingresa un ID producto que no existe
        } catch (Exception e) {
            System.out.println("Error durante la venta del producto: " + e.getMessage());
        }
        }

}

