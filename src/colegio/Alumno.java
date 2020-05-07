
package colegio;

import java.util.*;

public class Alumno {
    private int legajo;
    private String Apellido;
    private String Nombre;
    private Set <Materia> listaMateria;

    public Alumno(int legajo, String Apellido, String Nombre) {
        this.legajo = legajo;
        this.Apellido = Apellido;
        this.Nombre = Nombre;
        listaMateria =new HashSet<>();
    }


    public void agregarMateria(Materia m){
      
        listaMateria.add(m);
    }
    public int cantidadMateria(){
     
         int cantidad=listaMateria.size();
        return cantidad;
    }

    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public Set<Materia> getListaMateria() {
        return listaMateria;
    }

    public void setListaMateria(Set<Materia> listaMateria) {
        this.listaMateria = listaMateria;
    }
    
}
