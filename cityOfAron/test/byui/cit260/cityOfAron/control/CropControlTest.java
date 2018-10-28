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
        System.out.println("Resultado" + result);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    @Test
    public void testBuyLand2() {
        System.out.println("buyLand - Test Case 2");
        CropData cropData = new CropData();
        cropData.setAcresOwned(3000);
        cropData.setWheatInStore(500);
        int landPrice = 60;
        int acresToBuy = -10;
        int expResult = -1;
        int result = CropControl.buyLand(landPrice, acresToBuy, cropData);
        System.out.println("Resultado" + result);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testBuyLand3() {
        System.out.println("buyLand - Test Case 3");
        CropData cropData = new CropData();
        cropData.setAcresOwned(3000);
        cropData.setWheatInStore(500);
        int landPrice = 100;
        int acresToBuy = 10;
        int expResult = -1;
        int result = CropControl.buyLand(landPrice, acresToBuy, cropData);
        System.out.println("Resultado" + result);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testBuyLand4() {
        System.out.println("buyLand - Test Case 4");
        CropData cropData = new CropData();
        cropData.setAcresOwned(3000);
        cropData.setWheatInStore(500);
        int landPrice = 50;
        int acresToBuy = 10;
        int expResult = 3010;
        int result = CropControl.buyLand(landPrice, acresToBuy, cropData);
        System.out.println("Resultado" + result);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testBuyLand5() {
        System.out.println("buyLand - Test Case 5");
        CropData cropData = new CropData();
        cropData.setAcresOwned(3000);
        cropData.setWheatInStore(500);
        int landPrice = 10;
        int acresToBuy = 0;
        int expResult = 3000;
        int result = CropControl.buyLand(landPrice, acresToBuy, cropData);
        System.out.println("Resultado" + result);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    /**
     * Test of buyLand method, of class CropControl.
     */
    @Test
    public void testBuyLand() {
        System.out.println("buyLand");
        int landPrice = 0;
        int acresToBuy = 0;
        CropData cropData = new CropData();
        cropData.setAcresOwned(0);
        int expResult = 0;
        int result = CropControl.buyLand(landPrice, acresToBuy, cropData);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setOffering method, of class CropControl.
     */
    @Test
    public void testSetOffering() {
        System.out.println("setOffering - test case 1");
        int offeringPercentage = 80;
        CropData cropData = new CropData();
        CropControl instance = new CropControl();
        int expResult = 80;
        int result = instance.setOffering(offeringPercentage, cropData);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    @Test
    public void testSetOffering2() {
        System.out.println("setOffering  - test case 2");
        int offeringPercentage = -25;
        CropData cropData = new CropData();
        CropControl instance = new CropControl();
        int expResult = -1;
        int result = instance.setOffering(offeringPercentage, cropData);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    @Test
    public void testSetOffering3() {
        System.out.println("setOffering  - test case 3");
        int offeringPercentage = 123;
        CropData cropData = new CropData();
        CropControl instance = new CropControl();
        int expResult = -1;
        int result = instance.setOffering(offeringPercentage, cropData);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testSetOffering4() {
        System.out.println("setOffering  - test case 4");
        int offeringPercentage = 0;
        CropData cropData = new CropData();
        CropControl instance = new CropControl();
        int expResult = 0;
        int result = instance.setOffering(offeringPercentage, cropData);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testSetOffering5() {
        System.out.println("setOffering  - test case 5");
        int offeringPercentage = 100;
        CropData cropData = new CropData();
        CropControl instance = new CropControl();
        int expResult = 100;
        int result = instance.setOffering(offeringPercentage, cropData);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testplantCrops1() {
        System.out.println("plantCrops  - test case 1");
        CropData cropData = new CropData();
        int acresToPlant = 10;
        cropData.setWheatInStore(5000);
        cropData.setAcresOwned(500);
        cropData.setAcresPlanted(400);
        int expResult = 410;
        int result = CropControl.plantCrops(acresToPlant, cropData);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    @Test
    public void testplantCrops2() {
        System.out.println("plantCrops  - test case 2");
        CropData cropData = new CropData();
        int acresToPlant = 60;
        cropData.setWheatInStore(20);
        cropData.setAcresOwned(500);
        cropData.setAcresPlanted(400);
        int expResult = -1;
        int result = CropControl.plantCrops(acresToPlant, cropData);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    @Test
    public void testplantCrops3() {
        System.out.println("plantCrops  - test case 3");
        CropData cropData = new CropData();
        int acresToPlant = 150;
        cropData.setWheatInStore(5000);
        cropData.setAcresOwned(500);
        cropData.setAcresPlanted(400);
        int expResult = -1;
        int result = CropControl.plantCrops(acresToPlant, cropData);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    @Test
    public void testplantCrops4() {
        System.out.println("plantCrops  - test case 4");
        CropData cropData = new CropData();
        int acresToPlant = -25;
        cropData.setWheatInStore(5000);
        cropData.setAcresOwned(500);
        cropData.setAcresPlanted(400);
        int expResult = -1;
        int result = CropControl.plantCrops(acresToPlant, cropData);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    @Test
    public void testplantCrops5() {
        System.out.println("plantCrops  - test case 5");
        CropData cropData = new CropData();
        int acresToPlant = 0;
        cropData.setWheatInStore(5000);
        cropData.setAcresOwned(500);
        cropData.setAcresPlanted(400);
        int expResult = 400;
        int result = CropControl.plantCrops(acresToPlant, cropData);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    @Test
    public void testplantCrops6() {
        System.out.println("plantCrops  - test case 6");
        CropData cropData = new CropData();
        int acresToPlant = 100;
        cropData.setWheatInStore(5000);
        cropData.setAcresOwned(500);
        cropData.setAcresPlanted(400);
        int expResult = 500;
        int result = CropControl.plantCrops(acresToPlant, cropData);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    @Test
    public void testplantCrops7() {
        System.out.println("plantCrops  - test case 7");
        CropData cropData = new CropData();
        int acresToPlant = 60;
        cropData.setWheatInStore(30);
        cropData.setAcresOwned(500);
        cropData.setAcresPlanted(400);
        int expResult = 460;
        int result = CropControl.plantCrops(acresToPlant, cropData);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    
}
