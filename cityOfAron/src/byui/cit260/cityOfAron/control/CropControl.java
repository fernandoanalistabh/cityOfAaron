/**
*The CropControl class - part of the control layer
* class contains all of the calculation methods for managing the crops
* Author: Fernando
* Date last modified: May 2018
*/
package byui.cit260.cityOfAron.control;
import byui.cit260.cityOfAron.model.CropData;

public class CropControl{
    /**
    * The sellLand method
    * Purpose: To sell land
    * Parameters: the price of land, the number of acres to sell, and
    * a reference to a CropData object
    * Returns: the number of acres owned after the sale
    * Pre-conditions: acres to sell must be positive
    * and <= acresOwned
    */
    public static int sellLand(int landPrice, int acresToSell, CropData cropData){
        //if acresToSell < 0, return -1
        //if acresToSell > acresOwned, return -1
        //acresOwned = acresOwned - acresToSell
        //wheatInStore = wheatInStore + acresToSell * landPrice
        //return acresOwned
        return Integer.SIZE; //Just return an int to not come up with error flag.
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
    public int setOffering(int offeringPercentage, CropData cropData){
        //if offeringPercentage < 0 or offeringPercentage > 100, return -1
        //offering = offeringPercentage
        //return offering
        if (offeringPercentage<0 || offeringPercentage>100)
                return -1;
        cropData.setOffering(offeringPercentage);
        return cropData.getOffering();
    }
}
