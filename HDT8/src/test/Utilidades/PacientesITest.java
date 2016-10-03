/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilidades;

import junit.framework.TestCase;

/**
 *
 * @author Marlon
 */
public class PacientesITest extends TestCase {
    
    public PacientesITest(String testName) {
        super(testName);
    }
    
    @Override
    protected void setUp() throws Exception {
        super.setUp();
    }
    
    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }

    /**
     * Test of setNombre method, of class Pacientes.
     */
    public void testSetNombre() {
        System.out.println("setNombre");
        String nombre = "m";
        Pacientes instance = new Pacientes(nombre,"m","c");
        instance.setNombre(nombre);
        assertEquals(instance.getNombre(),"m");
    }

    /**
     * Test of setRazon method, of class Pacientes.
     */
    public void testSetRazon() {
        System.out.println("setRazon");
        String razon = "m";
        Pacientes instance = new Pacientes("a",razon,"c");
        instance.setRazon(razon);
        assertEquals(instance.getRazon(),"m");
    }

    /**
     * Test of setPrioridad method, of class Pacientes.
     */
    public void testSetPrioridad() {
        System.out.println("setPrioridad");
        String prioridad = "m";
        Pacientes instance = new Pacientes("m","c",prioridad);
        instance.setPrioridad(prioridad);
        assertEquals(instance.getPrioridad(),"m");
    }

    /**
     * Test of getNombre method, of class Pacientes.
     */
    public void testGetNombre() {
         System.out.println("getNombre");
        Pacientes instance = new Pacientes("a","c","m");
        String expResult = "a";
        String result = instance.getNombre();
        assertEquals(expResult, result);
    }

    /**
     * Test of getRazon method, of class Pacientes.
     */
    public void testGetRazon() {
        System.out.println("getRazon");
        Pacientes instance = new Pacientes("a","c","m");
        String expResult = "c";
        String result = instance.getRazon();
        assertEquals(expResult, result);
    }

    /**
     * Test of getPrioridad method, of class Pacientes.
     */
    public void testGetPrioridad() {
        System.out.println("getPrioridad");
        Pacientes instance = new Pacientes("a","c","m");
        String expResult = "m";
        String result = instance.getPrioridad();
        assertEquals(expResult, result);
    }

    /**
     * Test of compareTo method, of class Pacientes.
     */
    public void testCompareTo() {
        System.out.println("compareTo");
        Pacientes o = new Pacientes("m","n","c");
        Pacientes instance = new Pacientes("m","n","c");
        int expResult = 0;
        int result = instance.compareTo(o);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
 
    }

    /**
     * Test of toString method, of class Pacientes.
     */
    public void testToString() {
        System.out.println("toString");
        Pacientes instance = new Pacientes("m","n","c");
        String expResult = "";
        String result = instance.toString();
        assertEquals(instance.getNombre(),instance.getPrioridad(),instance.getPrioridad());
        // TODO review the generated test code and remove the default call to fail.

    }
    
}
