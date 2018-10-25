/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.cityOfAron.control;

import byui.cit260.cityOfAron.model.CropData;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Allex
 */
public class CropControlTest {
    
    public CropControlTest() {
    }

    /**
     * Test of sellLand method, of class CropControl.
     */
    @Test
    public void testSellLand1() 
    {
        System.out.println("sellLand");
        int landPrice = 0;
        int acresToSell = 0;
        CropData cropData = null;
        int expResult = 0;
        int result = CropControl.sellLand(landPrice, acresToSell, cropData);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calcLandCost method, of class CropControl.
     */
    @Test
    public void testCalcLandCost() {
        System.out.println("calcLandCost");
        int expResult = 0;
        int result = CropControl.calcLandCost();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setOffering method, of class CropControl.
     */
    @Test
    public void testSetOffering() {
        System.out.println("setOffering");
        int offeringPercentage = 0;
        CropData cropData = null;
        CropControl instance = new CropControl();
        int expResult = 0;
        int result = instance.setOffering(offeringPercentage, cropData);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of sellLand method, of class CropControl.
     */
    @Test
    public void testSellLand() {
        System.out.println("sellLand");
        int landPrice = 0;
        int acresToSell = 0;
        CropData cropData = null;
        int expResult = 0;
        int result = CropControl.sellLand(landPrice, acresToSell, cropData);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
// A GENTE PAROU AQUI. TÁ DANDO ERRO NO testBuyLand1 E NÃO SABEMOS PORQUE
    /**
     * Test of buyLand method, of class CropControl.
     */
    @Test
    public void testBuyLand1() {
        System.out.println("buyLand - Test Case 1");
        CropData cropData = new CropData();
        cropData.setAcresOwned(3000);
        cropData.setWheatInStore(500);
        int landPrice = 20;
        int acresToBuy = 10;
        int expResult = 3010;
        int result = CropControl.buyLand(landPrice, acresToBuy, cropData);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of buyLand method, of class CropControl.
     */
    @Test
    public void testBuyLand() {
        System.out.println("buyLand");
        int landPrice = 0;
        int acresToBuy = 0;
        CropData cropData = null;
        int expResult = 0;
        int result = CropControl.buyLand(landPrice, acresToBuy, cropData);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
