package Classes;
// Clase abstracta Persona
// Clase base para Modelo y Fotografo
public abstract class Persona {

    protected String nombre;
    protected String identificacion;
    protected String contacto;

    public Persona(String nombre, String identificacion, String contacto) {
        this.nombre         = nombre;
        this.identificacion = identificacion;
        this.contacto       = contacto;
    }

    public String getNombre()         { return nombre; }
    public String getIdentificacion() { return identificacion; }
    public String getContacto()       { return contacto; }

    // Metodo abstracto: cada subclase lo implementa
    public abstract void mostrarInformacion();
}
