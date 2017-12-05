package conexion;

public class Tablita {

    public Tablita(Integer ID, String Nombre) {
        this.ID = ID;
        this.Nombre = Nombre;
    }

    public Tablita() {
    }
    private Integer ID;
    private String Nombre;

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
}
