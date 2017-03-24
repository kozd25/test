/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet;

import java.util.Hashtable;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author vincent
 */
public class projetTest {
    
    public projetTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of addCashflow method, of class projet.
     */
    @Test
    public void testAddCashflow() {
        System.out.println("addCashflow");
        double flux = 0.0;
        projet instance = null;
        instance.addCashflow(flux);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTauxActualisation method, of class projet.
     */
    @Test
    public void testGetTauxActualisation() {
        System.out.println("getTauxActualisation");
        projet instance = null;
        double expResult = 0.0;
        double result = instance.getTauxActualisation();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPeriode method, of class projet.
     */
    @Test
    public void testGetPeriode() {
        System.out.println("getPeriode");
        projet instance = null;
        int expResult = 0;
        int result = instance.getPeriode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCashflow method, of class projet.
     */
    @Test
    public void testGetCashflow_0args() {
        System.out.println("getCashflow");
        projet instance = null;
        Hashtable expResult = null;
        Hashtable result = instance.getCashflow();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCashflow method, of class projet.
     */
    @Test
    public void testGetCashflow_int() {
        System.out.println("getCashflow");
        int periode = 0;
        projet instance = null;
        double expResult = 0.0;
        double result = instance.getCashflow(periode);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getName method, of class projet.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        projet instance = null;
        String expResult = "";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of function method, of class projet.
     */
    @Test
    public void testFunction() {
        System.out.println("function");
        double x = 0.0;
        projet instance = null;
        double expResult = 0.0;
        double result = instance.function(x);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of derivee method, of class projet.
     */
    @Test
    public void testDerivee() {
        System.out.println("derivee");
        double x = 0.0;
        projet instance = null;
        double expResult = 0.0;
        double result = instance.derivee(x);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
