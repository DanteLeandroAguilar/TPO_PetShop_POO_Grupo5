public class Producto {

    private TipoMascota tipoMascota; // Si es para Perro o Gato (cambiamos el tipo Mascota a String)
    private String nombre; // Del alimento o del juguete
    private String categoria;// Si es un comida, juguete, etc
    private int precioUnitario;

    public Producto(TipoMascota tipoMascota, String nombre, String categoria, int precioUnitario) {
        this.tipoMascota = tipoMascota;
        this.nombre = nombre;
        this.categoria = categoria;
        this.precioUnitario = precioUnitario;
    }

    // Método para verificar si el producto es apto para la mascota que tiene el cliente
    public boolean esAptoParaComprarProducto(Mascota mascotaCliente) {
        return tipoMascota == mascotaCliente.getTipo();
    }

    public String getNombre() {
        return nombre;
    }
    public int getPrecioUnitario() {
        return precioUnitario;
    }

    @Override
    public String toString() {
        return  "Categoria= " + categoria +
                ", Nombre= " + nombre +
                ", Precio por unidad= $" + precioUnitario;
    }


}
