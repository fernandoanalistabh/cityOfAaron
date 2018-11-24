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
import java.util.*;
/**
 * @author Andre
 */
public class GameControl {
    public static void createNewGame(String _name)
    {
        // Create a new Game object.
        Game game = new Game();
        // Create a new Player object
        Player player = new Player();
        // Store the name of the player in the Player object
        player.setName(_name);
        // Store a reference to the Player object in the Game object
        game.setThePlayer(player);
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
        
        Game.setProvisions(provisions);
    }
}
