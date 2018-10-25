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
public class LocationTest {
    
    public LocationTest() {
    }

    /**
     * Test of getDescription method, of class Location.
     */
    @Test
    public void testGetDescription() {
        System.out.println("getDescription");
        Location instance = new Location();
        String expResult = "";
        String result = instance.getDescription();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDescription method, of class Location.
     */
    @Test
    public void testSetDescription() {
        System.out.println("setDescription");
        String description = "";
        Location instance = new Location();
        instance.setDescription(description);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSymbol method, of class Location.
     */
    @Test
    public void testGetSymbol() {
        System.out.println("getSymbol");
        Location instance = new Location();
        String expResult = "";
        String result = instance.getSymbol();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSymbol method, of class Location.
     */
    @Test
    public void testSetSymbol() {
        System.out.println("setSymbol");
        String symbol = "";
        Location instance = new Location();
        instance.setSymbol(symbol);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hashCode method, of class Location.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        Location instance = new Location();
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class Location.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object obj = null;
        Location instance = new Location();
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Location.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Location instance = new Location();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
