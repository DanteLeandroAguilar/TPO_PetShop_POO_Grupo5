import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        TipoMascota Perro = new TipoMascota();
        TipoMascota Gato = new TipoMascota();

        Cliente unCliente = new Cliente("Pepe", 12345678);

        Mascota unPerro = new Mascota("Firulais", Perro, "Mediano", LocalDate.now());

        Mascota unGato = new Mascota("Nala", Gato, LocalDate.now());

        PetShop unPetShop = new PetShop();

        unCliente.agregarMascota(unPerro);

        unPetShop.mostrarProductosDisponibles();

        unPetShop.venderAlimento(unCliente, unPerro, );


    }
}