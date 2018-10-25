/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.cityOfAron.model;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Allex
 */
public class MapTest {
    
    public MapTest() {
    }

    /**
     * Test of getRowCount method, of class Map.
     */
    @Test
    public void testGetRowCount() {
        System.out.println("getRowCount");
        Map instance = new Map();
        int expResult = 0;
        int result = instance.getRowCount();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRowCount method, of class Map.
     */
    @Test
    public void testSetRowCount() {
        System.out.println("setRowCount");
        int rowCount = 0;
        Map instance = new Map();
        instance.setRowCount(rowCount);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getColCont method, of class Map.
     */
    @Test
    public void testGetColCont() {
        System.out.println("getColCont");
        Map instance = new Map();
        int expResult = 0;
        int result = instance.getColCont();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setColCont method, of class Map.
     */
    @Test
    public void testSetColCont() {
        System.out.println("setColCont");
        int colCont = 0;
        Map instance = new Map();
        instance.setColCont(colCont);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLocations method, of class Map.
     */
    @Test
    public void testGetLocations() {
        System.out.println("getLocations");
        Map instance = new Map();
        Location[][] expResult = null;
        Location[][] result = instance.getLocations();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLocations method, of class Map.
     */
    @Test
    public void testSetLocations() {
        System.out.println("setLocations");
        Location[][] locations = null;
        Map instance = new Map();
        instance.setLocations(locations);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hashCode method, of class Map.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        Map instance = new Map();
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class Map.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object obj = null;
        Map instance = new Map();
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Map.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Map instance = new Map();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
