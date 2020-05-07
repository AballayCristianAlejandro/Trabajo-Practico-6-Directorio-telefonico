
package colegio;


public class Materia {
    private String idMateria;
    private String Nombre;
    private int anio;

    public String getIdMateria() {
        return idMateria;
    }

    public void setIdMateria(String idMateria) {
        this.idMateria = idMateria;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public Materia(String idMateria, String Nombre, int anio) {
        this.idMateria = idMateria;
        this.Nombre = Nombre;
        this.anio = anio;
    }
}
