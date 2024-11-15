public class Producto {

    private int idProducto;
    private TipoMascotaEnum tipoMascota; // Si es para Perro o Gato (cambiamos el tipo Mascota a String)
    private String nombre; // Del alimento o del juguete
    private String categoria;// Si es un comida, juguete, etc
    private int precioUnitario;

    public Producto(int idProducto, TipoMascotaEnum tipoMascota, String nombre, String categoria, int precioUnitario) {
        this.idProducto = idProducto;
        this.tipoMascota = tipoMascota;
        this.nombre = nombre;
        this.categoria = categoria;
        this.precioUnitario = precioUnitario;
    }

    // Método para verificar si el producto es apto para la mascota que tiene el cliente
    public boolean esAptoParaComprarProducto(Mascota mascotaCliente) {
        return tipoMascota.equals(mascotaCliente.getTipo());
    }

    public String getNombre() {
        return nombre;
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
