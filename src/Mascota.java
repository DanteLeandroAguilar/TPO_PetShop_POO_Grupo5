import java.time.LocalDate;

public class Mascota {

    private String nombre;
    private TipoMascotaEnum tipo;
    private String tamanio; // Atributo que solo utiliza el Perro (Chico, Mediano, Grande)
    private LocalDate fechaNacimiento;

    // Constructor para Gato, sin tamaño ya que nos es indistinto para la peluquería
    public Mascota(String nombre, TipoMascotaEnum tipo, LocalDate fechaNacimiento) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.fechaNacimiento = fechaNacimiento;
    }

    // Constructor para Perro, con su tamaño, ya que esto distingue su precio de peluquería
    public Mascota(String nombre, TipoMascotaEnum tipo, String tamanio, LocalDate fechaNacimiento) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.tamanio = tamanio;
        this.fechaNacimiento = fechaNacimiento;
    }

    // Método que nos devuelve el tipo de mascota, si es perro o gato
    public TipoMascotaEnum getTipo() {
        return this.tipo;
    }


    // Método para verificar si es el cumpleaños de la mascota (PromoCumpleMascota)
    public boolean esCumpleMascota() {
        return LocalDate.now().getMonth() == this.fechaNacimiento.getMonth() &&
                LocalDate.now().getDayOfMonth() == this.fechaNacimiento.getDayOfMonth();
    }

}
