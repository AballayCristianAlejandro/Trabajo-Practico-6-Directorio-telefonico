
package colegio;
import java.util.*;

public class Colegio {
    public static void main (String []args){
   
        Materia materia1=new Materia("¡","Ingles I", 1);
        Materia materia2=new Materia("¡¡","Matematica",1);
        Materia materia3=new Materia("¡¡¡","Laboratorio",1);
        
        Alumno alumno1= new Alumno (1001,"Lopez","Martin");
        Alumno alumno2= new Alumno (1002,"Martinez","Brenda");
        
        alumno1.agregarMateria(materia1);
        alumno1.agregarMateria(materia2);
        alumno1.agregarMateria(materia3);
        
        alumno2.agregarMateria(materia1);
        alumno2.agregarMateria(materia2);
        alumno2.agregarMateria(materia3);
        alumno2.agregarMateria(materia3);
        
       Set<Alumno> alumnosColeg=new HashSet <>();
        
        alumnosColeg.add(alumno1);
        alumnosColeg.add(alumno2);
        
        for(Alumno alum:alumnosColeg){
            System.out.print(alum.getNombre()+" "+alum.getApellido()+" :");
            System.out.println(alum.cantidadMateria()+" materias");
        
                 
        }
       /*Martinez tiene la misma cantidad de  materia , por que se implemento una coleccion
        de tipo Set. que no permite agregar elementos iguales    
        */  
    }     
}
