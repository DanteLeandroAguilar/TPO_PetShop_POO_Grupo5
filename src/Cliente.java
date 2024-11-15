import java.util.ArrayList;
import java.util.HashSet;

public class Cliente {

    private String nombre;
    private int dni;
    private ArrayList<Producto> productosComprados = new ArrayList<Producto>();
    private HashSet<Mascota> mascotas = new HashSet<Mascota>(); // Un cliente puede tener una o mas mascotas

    public Cliente(String nombre, int dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public void agregarMascota(Mascota unaMascota) {
        mascotas.add(unaMascota);
    }

    public void agregarProductoComprado(Producto unProducto) {
        productosComprados.add(unProducto);
    }

    public ArrayList<Producto> getProductosComprados() {
        return productosComprados;
    }

    public boolean esCumpleClienteMascota() {
        for(Mascota mascotasCliente : mascotas) {
            if(mascotasCliente.esCumpleMascota()) {
                return true;
            }
        }
        return false;
    }

}
