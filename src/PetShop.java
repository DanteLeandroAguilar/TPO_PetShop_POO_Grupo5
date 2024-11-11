import java.util.ArrayList;

public class PetShop {
    private ArrayList<Producto> ProductosOfrecidos = new ArrayList<Producto>();

    public PetShop() {
        this.ProductosOfrecidos = cargaDeInventario(ProductosOfrecidos); // Apenas se instancia el PetShop se crea automáticamente la lista de productos
    }

    public ArrayList<Producto> cargaDeInventario(ArrayList<Producto> lista) {
        lista.add(new BolsaCompleta(TipoMascota.Perro, "Excellent x 20kg", "Alimento", 48700, 2300));
        lista.add(new BolsaCompleta(TipoMascota.Perro, "Proplan x 15kg", "Alimento", 75000, 4800));
        lista.add(new BolsaCompleta(TipoMascota.Perro, "Dog Chow x 20kg", "Alimento", 51900, 2500));
        lista.add(new BolsaCompleta(TipoMascota.Gato, "Excellent x 15kg", "Alimento", 83400, 5400));
        lista.add(new BolsaCompleta(TipoMascota.Gato, "Proplan x 15kg", "Alimento", 120000, 7800));
        lista.add(new BolsaCompleta(TipoMascota.Gato, "Cat Chow x 15kg", "Alimento", 60000, 3800));
        lista.add(new Producto(TipoMascota.Perro, "Pelota", "Juguete", 3000));
        lista.add(new Producto(TipoMascota.Gato, "Ratón", "Juguete", 1500));
        lista.add(new Producto(TipoMascota.Perro, "Hueso", "Juguete", 1000));
        lista.add(new Peluqueria(TipoMascota.Gato, "Tamaño Indiferente", "Peluquería", 10000, 0));
        lista.add(new Peluqueria(TipoMascota.Perro, "Tamaño Chico", "Peluquería", 10000, 0));
        lista.add(new Peluqueria(TipoMascota.Perro, "Tamaño Mediano", "Peluquería", 10000, 5000));
        lista.add(new Peluqueria(TipoMascota.Perro, "Tamaño Grande", "Peluquería", 10000, 10000));
        return lista;
    }

    // Muestra los productos dosponibles que puede ofrecer el petshop
    public void mostrarProductosDisponibles() {
        System.out.println("Lista de Productos");
        for (Producto productoDisponible : ProductosOfrecidos) {
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
