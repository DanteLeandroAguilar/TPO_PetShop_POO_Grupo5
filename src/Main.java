import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Cliente unCliente = new Cliente("Pepe", 12345678);

        Mascota unPerro = new Mascota("Firulais", TipoMascotaEnum.PERRO, "Mediano", LocalDate.now());
        //unPerro.getTipo().equals(TipoMascotaEnum.PERRO);

        Mascota unGato = new Mascota("Nala", TipoMascotaEnum.GATO, LocalDate.now());

        PetShop petShop = new PetShop();

        // cargar el inventario en el PetShop
        petShop.cargarInventario(new Inventario());

        unCliente.agregarMascota(unPerro);

        System.out.println(unPerro.getTipo().equals(TipoMascotaEnum.PERRO)); // DA TRUE (ES CON EQUALS LA COMPARACION DE ENUMS)

        petShop.mostrarProductosDisponibles();

        // HACER LO DE LOS ID CON LO DE BOLSA COMPLETA Y JUGUETE
        //petShop.venderAlimento(unCliente, unPerro, );

    }
}