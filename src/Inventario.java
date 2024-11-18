import java.util.ArrayList;

public class Inventario {

    private ArrayList<Producto> inventarioProductos = new ArrayList<Producto>();

    public Inventario () {
        this.inventarioProductos = cargaInventario(inventarioProductos);
    }

    // Método que nos permite cargar el inventario del Pet Shop
    public ArrayList<Producto> cargaInventario(ArrayList<Producto> lista){
        lista.add(new BolsaCompleta(1, TipoMascotaEnum.PERRO, "Excellent x 20kg", "Alimento", 48700, 2300));
        lista.add(new BolsaCompleta(2, TipoMascotaEnum.PERRO, "Proplan x 15kg", "Alimento", 75000, 4800));
        lista.add(new BolsaCompleta(3, TipoMascotaEnum.PERRO, "Dog Chow x 20kg", "Alimento", 51900, 2500));
        lista.add(new BolsaCompleta(4, TipoMascotaEnum.GATO, "Excellent x 15kg", "Alimento", 83400, 5400));
        lista.add(new BolsaCompleta(5, TipoMascotaEnum.GATO, "Proplan x 15kg", "Alimento", 120000, 7800));
        lista.add(new BolsaCompleta(6, TipoMascotaEnum.GATO, "Cat Chow x 15kg", "Alimento", 60000, 3800));
        lista.add(new Producto(7, TipoMascotaEnum.PERRO, "Pelota", "Juguete", 3000));
        lista.add(new Producto(8, TipoMascotaEnum.GATO, "Ratón", "Juguete", 1500));
        lista.add(new Producto(9, TipoMascotaEnum.PERRO, "Hueso", "Juguete", 1000));
        lista.add(new Peluqueria(10, TipoMascotaEnum.GATO, "Tamaño Indiferente", "Peluquería", 10000, 0));
        lista.add(new Peluqueria(11, TipoMascotaEnum.PERRO, "Chico", "Peluquería", 10000, 0));
        lista.add(new Peluqueria(12, TipoMascotaEnum.PERRO, "Mediano", "Peluquería", 10000, 5000));
        lista.add(new Peluqueria(13, TipoMascotaEnum.PERRO, "Grande", "Peluquería", 10000, 10000));
        return lista;
    }

    // Método que nos devuelve el inventario
    public ArrayList<Producto> getProductosOfrecidos() {
        return inventarioProductos;
    }
}
