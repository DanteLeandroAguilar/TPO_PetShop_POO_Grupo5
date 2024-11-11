import java.time.LocalDate;

public class Mascota {

    private String nombre;
    private TipoMascota tipo; // Solo puede ser Perro o Gato
    private String tamanio; // Atributo que solo utiliza el Perro (Chico, Mediano, Grande)
    private LocalDate fechaNacimiento;

    // Constructor para Gato
    public Mascota(String nombre, TipoMascota tipo, LocalDate fechaNacimiento) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.fechaNacimiento = fechaNacimiento;
    }

    // Constructor para Perro
    public Mascota(String nombre, TipoMascota tipo, String tamanio, LocalDate fechaNacimiento) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.tamanio = tamanio;
        this.fechaNacimiento = fechaNacimiento;
    }

    public TipoMascota getTipo() {
        return this.tipo;
    }

    // Método para verificar si es el cumple de la mascota
    public boolean esCumpleMascota() {
        return LocalDate.now().getMonth() == this.fechaNacimiento.getMonth() &&
               LocalDate.now().getDayOfMonth() == this.fechaNacimiento.getDayOfMonth();
    }

}
