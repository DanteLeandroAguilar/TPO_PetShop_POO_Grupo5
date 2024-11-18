public class Producto {

    private int idProducto;
    private TipoMascotaEnum tipoMascota; // Si es para Perro o Gato
    protected String nombre; // Del alimento, del juguete o del servicio
    private String categoria;// Si es un comida, juguete o peluquería
    private int precioUnitario; // Precio por unidad de producto o servicio, al cual se le pueden sumar otros cargos

    public Producto(int idProducto, TipoMascotaEnum tipoMascota, String nombre, String categoria, int precioUnitario) {
        this.idProducto = idProducto;
        this.tipoMascota = tipoMascota;
        this.nombre = nombre;
        this.categoria = categoria;
        this.precioUnitario = precioUnitario;
    }

    // Método que le pregunta a la mascota del cliente de qué tipo es y si este corresponde con el tipo de mascota del producto/servicio
    public boolean esAptoParaComprarProducto(Mascota mascotaCliente) {
        return tipoMascota.equals(mascotaCliente.getTipo());
    }

    // Método que calcula el precio de un producto solicitado en una venta del Pet Shop, cuando es unitario
    public double calcularPrecio(double cantidad, boolean porKilo) throws PetShopException {
        if (!porKilo) {
            return precioUnitario * cantidad;
        }
        throw new PetShopException("El producto no se vende por kilo");
    }


    public int getIdProducto() {
        return idProducto;
    }

    public int getPrecioUnitario() {
        return precioUnitario;
    }

    @Override
    public String toString() {
        return  "ID: " + idProducto +
                ", Tipo Mascota: " + tipoMascota +
                ", Categoria: " + categoria +
                ", Nombre: " + nombre +
                ", Precio por unidad: $" + precioUnitario;
    }

}
