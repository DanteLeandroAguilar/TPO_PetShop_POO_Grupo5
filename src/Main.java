import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Cliente unCliente = new Cliente("Pepe", 42585748);

        Mascota unPerro = new Mascota("Firulais", TipoMascotaEnum.PERRO, "Mediano", LocalDate.now());

        Mascota unGato = new Mascota("Nala", TipoMascotaEnum.GATO, LocalDate.now());

        PetShop petShop = new PetShop();

        // cargar el inventario en el PetShop
        petShop.cargarInventarioyPromociones(new Inventario());

        unCliente.agregarMascota(unPerro);

        System.out.println(unPerro.getTipo().equals(TipoMascotaEnum.PERRO)); // Comparacion con equals (prueba del ENUM)

        petShop.mostrarProductosDisponibles();

        petShop.venderProducto(unCliente, unPerro, 2, 3, false);
        petShop.venderProducto(unCliente, unPerro, 5, 1, true);
        petShop.venderProducto(unCliente, unPerro, 3, 1, false);
        petShop.venderProducto(unCliente, unPerro, 9, 1, true);

        //petShop.venderProducto(unCliente, unGato, 5, 1, false);

        // Arroja una exception ya que no coincide el tipo de mascota con el tipo de producto (en este caso, el tipo de producto es para Gato)
        //petShop.venderProducto(unCliente, unPerro, 5, 1, true);

        // Arroja una exception ya que el producto no se vende por kilo
        //petShop.venderProducto(unCliente, unPerro, 9, 1, true);

    }
}