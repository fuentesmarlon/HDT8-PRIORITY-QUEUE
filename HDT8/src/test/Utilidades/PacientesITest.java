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
        String nombre = "";
        Pacientes instance = null;
        instance.setNombre(nombre);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRazon method, of class Pacientes.
     */
    public void testSetRazon() {
        System.out.println("setRazon");
        String razon = "";
        Pacientes instance = null;
        instance.setRazon(razon);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPrioridad method, of class Pacientes.
     */
    public void testSetPrioridad() {
        System.out.println("setPrioridad");
        String prioridad = "";
        Pacientes instance = null;
        instance.setPrioridad(prioridad);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNombre method, of class Pacientes.
     */
    public void testGetNombre() {
        System.out.println("getNombre");
        Pacientes instance = null;
        String expResult = "";
        String result = instance.getNombre();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRazon method, of class Pacientes.
     */
    public void testGetRazon() {
        System.out.println("getRazon");
        Pacientes instance = null;
        String expResult = "";
        String result = instance.getRazon();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPrioridad method, of class Pacientes.
     */
    public void testGetPrioridad() {
        System.out.println("getPrioridad");
        Pacientes instance = null;
        String expResult = "";
        String result = instance.getPrioridad();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of compareTo method, of class Pacientes.
     */
    public void testCompareTo() {
        System.out.println("compareTo");
        Pacientes o = null;
        Pacientes instance = null;
        int expResult = 0;
        int result = instance.compareTo(o);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
