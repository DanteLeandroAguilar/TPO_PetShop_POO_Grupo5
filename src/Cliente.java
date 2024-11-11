import java.util.ArrayList;
import java.util.HashSet;

public class Cliente {

    private String nombre;
    private int dni;
    private ArrayList<Producto> ProductosComprados = new ArrayList<Producto>();
    private HashSet<Mascota> Mascotas = new HashSet<Mascota>(); // Un cliente puede tener una o mas mascotas

    public Cliente(String nombre, int dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public void agregarMascota(Mascota unaMascota) {
        Mascotas.add(unaMascota);
    }

    public void agregarProductoComprado(Producto unProducto) {
        ProductosComprados.add(unProducto);
    }

    public ArrayList<Producto> getProductosComprados() {
        return ProductosComprados;
    }

    public boolean esCumpleClienteMascota() {
        for(Mascota mascotasCliente : Mascotas) {
            if(mascotasCliente.esCumpleMascota()) {
                return true;
            }
        }
        return false;
    }

}
