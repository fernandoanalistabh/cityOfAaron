package byui.cit260.cityOfAron.view;

import byui.cit260.cityOfAron.model.*;
import byui.cit260.cityOfAron.control.*;
import byui.cit260.cityOfAron.exceptions.CropException;
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
        System.out.format("Land is selling for %d bushels per acre.%n", price);
        //System.out.print("How many acres of land do you wish to buy? ");
        // Get the user’s input and save it.
        int toBuy;
        //toBuy = keyboard.nextInt();
        // Call the buyLand( ) method in the control layer to buy the land
        //CropControl.buyLand(toBuy, price, cropData);
        boolean paramsNotOkay;
        do  
        {
            paramsNotOkay = false;
            System.out.print("\nHow many acres of land do you wish to buy? ");
            toBuy = keyboard.nextInt();
            try
            {
                CropControl.buyLand(price, toBuy, cropData); //I altered the order between price and toBuy
            }
            catch(CropException e)
            {
                System.out.println("I am sorry master, I cannot do this.");
                System.out.println(e.getMessage());
                paramsNotOkay = true;
            }
        } while(paramsNotOkay);
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
        // Get the cost of land for this round.
        int price = CropControl.calcLandCost();
        // Prompt the user to enter the number of acres to sell
        System.out.format("Land is selling for %d bushels per acre.%n", price);
        int toSell;

        boolean paramsNotOkay;
        do
        {
            paramsNotOkay = false;
            System.out.print("How many acres of land do you wish to sell? ");
            // Get the user’s input and save it.
            toSell = keyboard.nextInt();
            try
            {
                // Call the sellLand( ) method in the control layer to sell land
                CropControl.sellLand(price, toSell, cropData);
            }
            catch(CropException e)
            {
                System.out.println("I am sorry master, but...");
                System.out.println(e.getMessage());
                paramsNotOkay = true;
            }
        } while(paramsNotOkay);
        // output how much land we now own
        System.out.format("You now own %d acres of land. ", cropData.getAcresOwned());
            }
    
    /**
    * The feedPeopleView LandView method
    * Purpose: interface with the user input for feeding people
    * Parameters: none
    * Returns: none
    */
    public static void feedPeopleView(){
        // Prompt the user to enter the number
        System.out.print("How many bushels of grain do you want to give to the people?");
        // Get the user’s input and save it.
        int bushels;
        bushels = keyboard.nextInt();
        // Call the feedPeople( ) method in the control layer to feed people
        // public static int feedPeople(int bushels, CropData cropData){
        int wheatLeft = CropControl.feedPeople(bushels, cropData);
        //Display the amount of wheat you have left.
        System.out.format("You now own %d wheat in store. ", wheatLeft);
    }
    
    /**
    * The plantCropView method
    * Purpose: interface with the user input Crops to plant
    * Parameters: none
    * Returns: none
    */
    public static void plantCropView(){
        // Prompt the user to enter the number of acres of land to plant
        System.out.print("“How many acres of land do you want to plant?");
        // Get the user’s input and save it.
        int landToPlant;
        landToPlant = keyboard.nextInt();
        // Call the plantCrops( ) method in the control layer to sell land
        //public static int plantCrops(int acresToPlant, CropData cropData)
        int cropsPlanted = CropControl.plantCrops(landToPlant, cropData);
        if (cropsPlanted!=-1){
            // output how many crops is planted
            System.out.format("You now own %d acres of land. ", cropData.getAcresOwned());
        }
        else{
            //acresToPlant/ACRES_PER_BUSHEL>wheatInStore ||acresToPlant > acresOwned - acresPlanted || acresToPlant < 0){
        }
    }
    
    /**
    * The displayCropsReportView method
    * Purpose: interface with the user input for displaying Crop's Report
    * Parameters: none
    * Returns: none
    */
    public static void displayCropsReportView(){
        // Display a report about the data
        System.out.println( "Year: "+cropData.getYear()+"\n"+
                            "People who starved: "+cropData.getNumStarved()+"\n"+
                            "People who came to the city: "+cropData.getNewPeople()+"\n"+
                            "Current population: "+cropData.getPopulation()+"\n"+
                            "Acres owned: "+cropData.getAcresOwned()+"\n"+
                            "Bushels of wheat per acre: "+cropData.getCropYield()+"\n"+
                            "Bushels of wheat paid in offerings: "+cropData.getOfferingsBushels()+"\n"+
                            "Bushels of wheat eaten by rats: "+cropData.getEatenByRats()+"\n"+
                            "Bushels of wheat in store: "+cropData.getWheatInStore()+"\n");
    }
}
