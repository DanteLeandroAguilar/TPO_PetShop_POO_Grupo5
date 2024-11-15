import java.time.LocalDate;

public class Mascota {

    private String nombre;
    private TipoMascotaEnum tipo;
    private String tamanio; // Atributo que solo utiliza el Perro (Chico, Mediano, Grande)
    private LocalDate fechaNacimiento;

    // Constructor para Gato
    public Mascota(String nombre, TipoMascotaEnum tipo, LocalDate fechaNacimiento) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.fechaNacimiento = fechaNacimiento;
    }

    // Constructor para Perro
    public Mascota(String nombre, TipoMascotaEnum tipo, String tamanio, LocalDate fechaNacimiento) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.tamanio = tamanio;
        this.fechaNacimiento = fechaNacimiento;
    }

    public TipoMascotaEnum getTipo() {
        return this.tipo;
    }

    // Método para verificar si es el cumple de la mascota
    public boolean esCumpleMascota() {
        return LocalDate.now().getMonth() == this.fechaNacimiento.getMonth() &&
               LocalDate.now().getDayOfMonth() == this.fechaNacimiento.getDayOfMonth();
    }

}
