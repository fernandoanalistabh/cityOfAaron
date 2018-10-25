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
public class TeamMemberTest {
    
    public TeamMemberTest() {
    }

    /**
     * Test of values method, of class TeamMember.
     */
    @Test
    public void testValues() {
        System.out.println("values");
        TeamMember[] expResult = null;
        TeamMember[] result = TeamMember.values();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of valueOf method, of class TeamMember.
     */
    @Test
    public void testValueOf() {
        System.out.println("valueOf");
        String name = "";
        TeamMember expResult = null;
        TeamMember result = TeamMember.valueOf(name);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getName method, of class TeamMember.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        TeamMember instance = null;
        String expResult = "";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTitle method, of class TeamMember.
     */
    @Test
    public void testGetTitle() {
        System.out.println("getTitle");
        TeamMember instance = null;
        String expResult = "";
        String result = instance.getTitle();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class TeamMember.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        TeamMember instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
