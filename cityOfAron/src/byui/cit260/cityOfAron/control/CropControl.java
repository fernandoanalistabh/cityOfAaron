/**
*The CropControl class - part of the control layer
* class contains all of the calculation methods for managing the crops
* Author: Fernando
* Date last modified: May 2018
*/
package byui.cit260.cityOfAron.control;
import byui.cit260.cityOfAron.model.CropData;
import java.util.Random;
public class CropControl
{
    //constants
    private static final int LAND_BASE = 17;
    private static final int LAND_RANGE = 10;
    private static final int ACRES_PER_BUSHEL = 2;
    // random number generator
    private static Random random = new Random();

    /**
    * The sellLand method
    * Purpose: To sell land
    * Parameters: the price of land, the number of acres to sell, and
    * a reference to a CropData object
    * Returns: the number of acres owned after the sale
    * Pre-conditions: acres to sell must be positive
    * and <= acresOwned
    */
    public static int sellLand(int landPrice, int acresToSell, CropData cropData)
    {
            //if acresToSell < 0, return -1
        if (acresToSell < 0)
            return -1;
            //if acresToSell > acresOwned, return -1
        int acresOwned = cropData.getAcresOwned();
        if (acresToSell > acresOwned)
            return -1;
            //acresOwned = acresOwned - acresToSell
        acresOwned -= acresToSell;
        cropData.setAcresOwned(acresOwned);
            //wheatInStore = wheatInStore + acresToSell * landPrice
        int wheatInStore = cropData.getWheatInStore();
        wheatInStore += (acresToSell * landPrice);
        cropData.setWheatInStore(wheatInStore);
            //return acresOwned        
        return acresOwned;
    }
    
    /**
    * calcLandCost() method
    * Purpose: Calculate a random land price between 17 and 26 bushels/acre
    * Parameters: none
    * Returns: the land cost
    */
    public static int calcLandCost()
    {
        int landCost = random.nextInt(LAND_RANGE) + LAND_BASE;
        return landCost;
    } 
    
    /**
    * The buyLand method
    * Purpose: To buy land
    * @param the price of land
    * @param the number of acres to buy
    * @param a reference to a CropData object
    * @ return the number of acres after the buy
    * Pre-conditions: the price acres to buy must be positive
    * and <= the number of bushels of wheat owned
    */
    public static int buyLand(int landPrice, int acresToBuy, CropData cropData)
    {
        int acresOwned = cropData.getAcresOwned();
        int wheatInStore = cropData.getWheatInStore();
        //if acresToBuy < 0, return -1
        if (acresToBuy < 0)
            return -1;
        //if acresToBuy x landPrice > wheatInStore, return -1
        if ((acresToBuy*landPrice)>wheatInStore)
            return -1;
        //acresOwned = acresOwned + acresToBuy
        acresOwned+=acresToBuy;
        cropData.setAcresOwned(acresOwned);
        //wheatInStore = wheatInStore - (acresToBuy x landPrice)
        wheatInStore-=(acresToBuy*landPrice);
        cropData.setWheatInStore(wheatInStore);
        //return acresOwned
        return acresOwned;
    }   
    
    /**
    * The setOffering method
    * Purpose: Set the percentage of the harvest is offering
    * @param the percentage of offering
    * @param the reference to a CropData object
    * @ return the percentage of offering
    * Pre-conditions: the percentage of offering must be positive
    * and <= than 100
    */
    public int setOffering(int offeringPercentage, CropData cropData)
    {
        //if offeringPercentage < 0 or offeringPercentage > 100, return -1
        //offering = offeringPercentage
        //return offering
        if (offeringPercentage<0 || offeringPercentage>100)
                return -1;
        cropData.setOffering(offeringPercentage);
        return cropData.getOffering();
    }
    
    /**
    * The plantCrops method
    * Purpose: To plant wheat
    * @param the number of acres to plant
    * @param a reference to a CropData object
    * @return the total number of acres planted
    * Pre-conditions: acres to plant must be positive
    * and <= the number of acres free.
    * The cost in bushels to plant must be <= total bushels owned.
    */
    public static int plantCrops(int acresToPlant, CropData cropData)
    { 
        int wheatInStore = cropData.getWheatInStore();
        int acresOwned = cropData.getAcresOwned();
        int acresPlanted = cropData.getAcresPlanted();
        
        //if acresToPLant/ACRES_PER_BUSHEL > wheatInStore, return -1
        //if acresToPlant > acresOwned - acresPlanted, return -1
        //if acresToPlant < 0, return -1
        if (acresToPlant/ACRES_PER_BUSHEL>wheatInStore ||
            acresToPlant > acresOwned - acresPlanted ||
            acresToPlant < 0){
            return -1;
        }
        
        //wheatInStore = wheatInStore - (acresToPlant/ACRES_PER_BUSHEL)
        wheatInStore -= (acresToPlant/ACRES_PER_BUSHEL);
        
        //acresPlanted = acresPlanted + acresToPlant
        acresPlanted += acresToPlant;
        
        //return acresPlanted
        return acresPlanted;

    }
    
    
}
