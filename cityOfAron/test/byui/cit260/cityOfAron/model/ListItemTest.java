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
public class ListItemTest {
    
    public ListItemTest() {
    }

    /**
     * Test of getName method, of class ListItem.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        ListItem instance = new ListItem();
        String expResult = "";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setName method, of class ListItem.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "";
        ListItem instance = new ListItem();
        instance.setName(name);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNumber method, of class ListItem.
     */
    @Test
    public void testGetNumber() {
        System.out.println("getNumber");
        ListItem instance = new ListItem();
        int expResult = 0;
        int result = instance.getNumber();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNumber method, of class ListItem.
     */
    @Test
    public void testSetNumber() {
        System.out.println("setNumber");
        int number = 0;
        ListItem instance = new ListItem();
        instance.setNumber(number);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getGame method, of class ListItem.
     */
    @Test
    public void testGetGame() {
        System.out.println("getGame");
        ListItem instance = new ListItem();
        Game expResult = null;
        Game result = instance.getGame();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setGame method, of class ListItem.
     */
    @Test
    public void testSetGame() {
        System.out.println("setGame");
        Game _game = null;
        ListItem instance = new ListItem();
        instance.setGame(_game);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hashCode method, of class ListItem.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        ListItem instance = new ListItem();
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class ListItem.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object obj = null;
        ListItem instance = new ListItem();
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class ListItem.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        ListItem instance = new ListItem();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
