/**
* Source code for the GameControl class
* The GameControl class is a member of the controllayer
* Methods in the GameControl class manage Game objects
* Author: your team name
* Date Last modified: Nov 2018
*/
// ==============================================================
package byui.cit260.cityOfAron.control;
import byui.cit260.cityOfAron.model.*;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
/**
 * @author Andre
 */
public class GameControl {
    
    static Game game = new Game();
    // size of the Locations array
    private static final int MAX_ROW = 5;
    private static final int MAX_COL = 5;
    
    public static void createNewGame(String pName)
    {   
        // Create a new Game object.
        game = new Game();
        // Create a new Player object
        Player thePlayer = new Player();
        // Store the name of the player in the Player object
        thePlayer.setName(pName);
        // Store a reference to the Player object in the Game object
        game.setThePlayer(thePlayer);
        // Create a CropData object
        CropData cropData = new CropData();
        // Initialize the data values in the CropData object
        cropData.setYear(0);
        cropData.setPopulation(100);
        cropData.setNewPeople(5);
        cropData.setCropYield(3);
        cropData.setNumberWhoDied(0);
        cropData.setWheatInStore(2700);
        cropData.setAcresOwned(1000);
        cropData.setAcresPlanted(1000);
        cropData.setHarvest(3000);
        cropData.setAcresPlanted(1000); 
        // Save a reference to the CropData object in the Game object
        game.setCropData(cropData);
        // Save a reference to the Game object in the static variable
        // declared in the CityOfAaron class.
        CityOfAron.setTheGame(game);
        // Call the method to save a provitions list in the Game Object --L10
        createProvisionsList();
        createMap();
    }
    
    // Create a list of provisions itens and assign to the Game object --L10
    public static void createProvisionsList()
    {
        ArrayList<ListItem> provisions = new ArrayList<>();
        provisions.add(new ListItem("Rock",500));
        provisions.add(new ListItem("Wood",300));
        provisions.add(new ListItem("Iron",200));
        provisions.add(new ListItem("Gold",100));        
        provisions.add(new ListItem("B. of Crereals",500));
        provisions.add(new ListItem("B. of Vegetables",500));
        provisions.add(new ListItem("B. of Fruits",400));
        provisions.add(new ListItem("B. of Meat",300));
        
        game.setProvisions(provisions);
    }
    
    // method prologue ….
    public static void createCropDataObject()
    {
        CropData theCrops = new CropData();
        theCrops.setYear(0);
        theCrops.setPopulation(100);
        theCrops.setNewPeople(5);
        theCrops.setCropYield(3);
        theCrops.setNumberWhoDied(0);
        theCrops.setOffering(10);
        theCrops.setWheatInStore(2700);
        theCrops.setAcresOwned(1000);
        theCrops.setAcresPlanted(1000);
        theCrops.setHarvest(3000);
        theCrops.setOfferingsBushels(300);
        theCrops.setAcresPlanted(1000);
        // Save the cropData in the Game object
        game.setCropData(theCrops);
    }
    /**
    * The createMap method
    * Purpose: creates the location objects and the map
    * Parameters: none
    * Returns: none
    */
    public static void createMap()
    {
        // create the Map object,
        // refer to the Map constructor
        Map theMap = new Map(MAX_ROW, MAX_COL);
        
        // create a string that will go in the Location objects
        // that contain the river
        String river = "You are on the River. The river is the source\n" +
        "of life for our city. The river marks the eastern\n " +
        "boundary of the city - it is wilderness to the East.\n";
        // create a new Location object
        Location loc = new Location();
        // use setters in the Location class to set the description and symbol
        loc.setDescription(river);
        loc.setSymbol("~~~~");
        // set this location object in each cell of the array in column 4
        for(int i = 0; i < MAX_ROW; i++)
        {
        theMap.setLocation(i, 4, loc);
        }
        
        // define the string for a farm land location
        String farmland = "You are on the fertile banks of the River.\n" +
        "In the spring, this low farmland floods and is covered with rich\n" +
        "new soil. Wheat is planted as far as you can see.";
        // set a farmland location with a hint
        loc = new Location();
        loc.setDescription(farmland + "\nOne bushel will plant two acres of wheat.");
        loc.setSymbol("!!!!");
        theMap.setLocation(0, 2, loc);
        
        String goldmine = "A goldnine. A gorgeous source of richness, and the shiniest\n"
                     +  " cave you’ve ever seen. Your heart pumps up just by \n"
                     + "imagining all your people can do with so much money.\n"
                     + " But be careful, pride can destroy a city as fast as\n"
                     + " gold can build it.";
        loc = new Location();
        loc.setDescription(goldmine);
        loc.setSymbol("$$$$");
        theMap.setLocation(0, 0, loc);
        
        String forest = "You are in the forest, the nature’s masterpiece. \n"
                + "The birthplace of the most fantastic creatures and a \n"
                + "diversified flora. You feel delightful seeing all its \n"
                + "kinds of beast and plants. This is a place where you can \n"
                + "find shelter, wood, food and also meat. Is there any place \n"
                + "more complete?";
        loc = new Location();
        loc.setDescription(forest);
        loc.setSymbol("####");
        theMap.setLocation(0, 1, loc);
        theMap.setLocation(1, 1, loc);
        theMap.setLocation(1, 2, loc);
        theMap.setLocation(2, 1, loc);
        theMap.setLocation(2, 2, loc);
        
        String mountain = "You are in a mountain, the earth’s titan. Huge \n"
                + "amounts of rock and sand as tall as the far sky. \n"
                + "The huge sleepy gray lie before you, covered with \n"
                + "trees and mountain goats. A good place to watch the \n"
                + "sunset and gather some livestock.";
        loc = new Location();
        loc.setDescription(mountain);
        loc.setSymbol(" /\\ ");
        theMap.setLocation(0, 3, loc);
        
        String valley = "You are on the valley. It is the lowest place in the \n"
                + "entire region. This place is good for you to plant, \n"
                + "live and be protected. In the north, you can find a \n"
                + "high mountain.";
        loc = new Location();
        loc.setDescription(valley);
        loc.setSymbol(" \\/ ");
        theMap.setLocation(1, 3, loc);        
        
        String stone = "You are in the stone. It is the most big stone of the \n"
                + "entire land. You need to take care around this place, \n"
                + "because you can injure yourself or die easily here.";
        loc = new Location();
        loc.setDescription(stone);
        loc.setSymbol(" [] ");
        theMap.setLocation(2, 3, loc);
        
        String pasture = "You are in the pasture. Besides the grass, there are \n"
                + "some animals like horse and cows here. Definitely, it \n"
                + "is not a good place to live or plant.";
        loc = new Location();
        loc.setDescription(pasture);
        loc.setSymbol(",,,,");
        theMap.setLocation(3, 1, loc);
        
        String castle = "You are in the castle. This castle is the most beautiful \n"
                + "in the entire region. You find here rich and bountiful \n"
                + "people, but also good and charitable. It is a good place \n"
                + "to stay when you are traveling. However, you need to take \n"
                + "of the desert in the south";
        loc = new Location();
        loc.setDescription(castle);
        loc.setSymbol("↑[]↑");
        theMap.setLocation(1, 0, loc);
        theMap.setLocation(2, 0, loc);
        theMap.setLocation(3, 0, loc);
        
        String lake = "Here is the lake. The lake is a quiet place, calm and \n"
                + "fresh. The lake is placed in the center of the desert, \n"
                + "and you can locate yourself by the rocks in the lake, \n"
                + "that indicate the east of the city.";
        loc = new Location();
        loc.setDescription(lake);
        loc.setSymbol("@@@@");
        theMap.setLocation(3, 2, loc);
        
        String swamp = "You arrived in the swamp, could, dark and wilderness. \n"
                + "The swamp is dangerous because of the mug, you never \n"
                + "know how deep is under the surface and you can get \n"
                + "yourself in really trouble. Look for the location of \n"
                + "the moss on the trees to locate yourself, the moss is \n"
                + "always indicating north.";
        loc = new Location();
        loc.setDescription(swamp);
        loc.setSymbol("****");
        theMap.setLocation(3, 3, loc);
        theMap.setLocation(4, 3, loc);
        
        String desert = "You are in the desert, wilderness and hostile. The \n"
                + "desert is really dangerous if you unprepared of \n"
                + "provisions. The desert is in the south of the city.";
        loc = new Location();
        loc.setDescription(desert);
        loc.setSymbol("====");
        theMap.setLocation(4, 0, loc);
        theMap.setLocation(4, 1, loc);
        
        String hill = "You are on the Hill, here you can see everything from \n"
                + "above, and it´s good if you are here to take a rest, \n"
                + "locate the city and renew your energy to keep on your \n"
                + "journey. The hill is locate in the southeast of the city.";
        loc = new Location();
        loc.setDescription(hill);
        loc.setSymbol("^^^^");
        theMap.setLocation(4, 2, loc);
        
        game.setMap(theMap);
    }
    
    public static void displayMap(){
        for(int i = 0; i < game.getMap().getRowCount(); i++)
        {
            for(int j = 0; j < game.getMap().getColCount(); j++)
            {
                Location loc = game.getMap().getLocation(i, j);
                System.out.print(String.format("%-5s",loc.getSymbol()));
            }
            System.out.print("\n");
        }

    }
    public static ArrayList<ListItem> getProv(){
        return game.getProvisions();
    }
    
    /**
    * getSavedGame method
    * Purpose: load a saved game from disk
    * Parameters: the file path
    * Returns: none
    * Side Effect: the game reference in the driver is updated
    */
    public static void getSavedGame(String filePath)
    {
        
        try (FileInputStream fips = new FileInputStream(filePath))
        {
            ObjectInputStream input = new ObjectInputStream(fips);
            game = (Game) input.readObject();
            CityOfAron.setTheGame(game);
        }
        catch(Exception e)
        {
            System.out.println("There was an error reading the saved game file\n");
        }
    }
    public static void saveGame(String filePath){
        try (FileOutputStream fips = new FileOutputStream(filePath))
        {
            ObjectOutputStream output = new ObjectOutputStream(fips);
            output.writeObject(CityOfAron.getTheGame());
        }
        catch(Exception e)
        {
            System.out.println("There was an error reading the saved game file\n");
        }
    }
    
}
