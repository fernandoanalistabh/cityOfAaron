package byui.cit260.cityOfAron.view;

import byui.cit260.cityOfAron.model.*;
import byui.cit260.cityOfAron.control.*;
import java.util.Scanner;

/**
 *
 * @author Fernando
 */
public class CropView {
    // Create a Scanner object
    private static Scanner keyboard = new Scanner(System.in);
    // Get references to the Game object and the CropData object
    private static Game theGame = CityOfAron.getTheGame();
    private static CropData cropData = theGame.getCropData();

    public CropView() {
    }
    
    
    /**
    * The runCropsView method()
    * Purpose: runs the Hamurabi game
    * Parameters: none
    * Returns: none
    */
    public static void runCropsView()
    {
        // call the buyLandView( ) method
        buyLandView();
        sellLandView();
        feedPeopleView();
        plantCropView();
        displayCropsReportView();
        
    }
  
    /**
    * The buyLandView method
    * Purpose: interface with the user input for buying land
    * Parameters: none
    * Returns: none
    */
    public static void buyLandView()
    {
        // Get the cost of land for this round.
        int price = CropControl.calcLandCost();
        // Prompt the user to enter the number of acres to buy
        System.out.format("Land is selling for %d bushels per acre.%n",price);
        System.out.print("How many acres of land do you wish to buy? ");
        // Get the user’s input and save it.
        int toBuy;
        toBuy = keyboard.nextInt();
        // Call the buyLand( ) method in the control layer to buy the land
        CropControl.buyLand(toBuy, price, cropData);
        
        // output how much land we now own
        System.out.format("You now own %d acres of land. ", cropData.getAcresOwned());
    }
    
    /**
    * The sellLandView method
    * Purpose: interface with the user input for selling land
    * Parameters: none
    * Returns: none
    */
    public static void sellLandView(){
        
    }
    
    /**
    * The feedPeopleView LandView method
    * Purpose: interface with the user input for feeding people
    * Parameters: none
    * Returns: none
    */
    public static void feedPeopleView(){
        
    }
    
    /**
    * The plantCropView method
    * Purpose: interface with the user input for plating Crop
    * Parameters: none
    * Returns: none
    */
    public static void plantCropView(){
        
    }
    
    /**
    * The displayCropsReportView method
    * Purpose: interface with the user input for displaying Crop's Report
    * Parameters: none
    * Returns: none
    */
    public static void displayCropsReportView(){
        
    }
}
