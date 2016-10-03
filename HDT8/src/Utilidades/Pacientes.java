/*
Universidad del Valle de Guatemala 
Algoritmos y Estructura de datos
Nombres: Marlon Fuentes- Mario Hernandez
Carnets: 15240- 15135
*/
package Utilidades;

/**
 *
 * @author Marlon
 */
public class Pacientes implements Comparable<Pacientes> {
    private String nombre;
    private String razon;
    private String prioridad;

    public Pacientes(String nombre, String razon, String prioridad) {
        this.nombre = nombre;
        this.razon = razon;
        this.prioridad = prioridad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setRazon(String razon) {
        this.razon = razon;
    }

    public void setPrioridad(String prioridad) {
        this.prioridad = prioridad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getRazon() {
        return razon;
    }

    public String getPrioridad() {
        return prioridad;
    }
    

    @Override
    public int compareTo(Pacientes o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
