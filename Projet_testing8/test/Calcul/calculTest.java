/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Calcul;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import projet.projet;

/**
 *
 * @author vincent
 */
public class calculTest {
    
    public calculTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of CalculateNPV method, of class calcul.
     */
    @Test
    public void testCalculateNPV() {
        System.out.println("CalculateNPV");
        projet project = null;
        double expResult = 0.0;
        double result = calcul.CalculateNPV(project);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of CalculateIRR method, of class calcul.
     */
    @Test
    public void testCalculateIRR() {
        System.out.println("CalculateIRR");
        projet project = null;
        double rend = 0.0;
        double expResult = 0.0;
        double result = calcul.CalculateIRR(project, rend);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
