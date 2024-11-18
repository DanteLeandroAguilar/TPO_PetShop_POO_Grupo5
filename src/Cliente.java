import java.util.ArrayList;
import java.util.HashSet;

public class Cliente {

    private String nombre;
    private int dni;
    private ArrayList<Producto> productosComprados = new ArrayList<Producto>(); // Historial de compras del cliente
    private HashSet<Mascota> mascotas = new HashSet<Mascota>(); // Un cliente puede tener una o mas mascotas, y éstas pueden ser perros o gatos.

    public Cliente(String nombre, int dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    // Método que valida si el cliente está comprando por primera vez en el Pet Shop (PromoBienvenida)
    public boolean primeraCompra() {
        return productosComprados.isEmpty();
    }

    // Método que carga las mascotas del cliente en el Set de mascotas, sin importar si es perro o gato
    public void agregarMascota(Mascota unaMascota) {
        mascotas.add(unaMascota);
    }

    // Método que agrega los productos comprados por el cliente en el Pet Shop en un ArrayList
    public void agregarProductoComprado(Producto unProducto) {
        productosComprados.add(unProducto);
    }

    // Método que nos devuelve el ArrayList de los productos comprados por el cliente
    public ArrayList<Producto> getProductosComprados() {
        return productosComprados;
    }

    // Método que le pregunta a cada mascota del cliente si es su cumpleaños el día que visitan el Pet Shop (PromoCumpleMascota)
    public boolean esCumpleClienteMascota() {
        for(Mascota mascotasCliente : mascotas) {
            if(mascotasCliente.esCumpleMascota()) {
                return true;
            }
        }
        return false;
    }

}
