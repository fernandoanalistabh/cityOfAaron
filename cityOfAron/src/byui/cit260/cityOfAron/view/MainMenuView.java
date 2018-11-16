// The MainMenuView class - part of the view layer
// Object of this class manages the main menu
// Author: Andre
// Date last modified: Nov 2018
//-------------------------------------------------------------
package byui.cit260.cityOfAron.view;
import byui.cit260.cityOfAron.control.GameControl;
import java.util.Objects;
import java.util.Scanner;
import byui.cit260.cityOfAron.model.CityOfAron;

/**
 * @author Andre 
 */
public class MainMenuView extends MenuView{
    
    Scanner keyboard = new Scanner(System.in); 

    public MainMenuView() 
    {
       super("\n"+
                  "*********************************\n" +
                  "* CITY OF AARON: MAIN GAME MENU *\n" +
                  "*********************************\n" +
                  " 1 - Start new game\n" +
                  " 2 - Get and start a saved game\n" +
                  " 3 - Get help on playing the game\n" +
                  " 4 - Save game\n" +
                  " 5 - Quit\n",
               5);
    }
    
    
    /**
    *The doAction method
    * Purpose: performs the selected action
    * Parameters: none
    * Returns: none
    */
    // =================================== 
    @Override
    public void doAction(int option)
    {
        switch (option){
            case 1:// if the option is 1, call startNewGame( )
                startNewGame();
                break;
            case 2:// if the option is 2, call startExistingGame( )
                startSavedGame();
                break;
            case 3:// if the option is 3, call displayHelpMenu( )
                displayHelpMenuView();
                break;
            case 4:// if the option is 4, call displaySaveGame( )
                displaySaveGameView();
                break;
            case 5:// if the option is 5, display a goodbye message
                System.out.println("\nThanks for playing ... goodbye.");
        }
    }
    
    /**
    * The startNewGame method
    * Purpose: creates game object and starts the game
    * Parameters: none
    * Returns: none
    */
    // =================================== 
    public void startNewGame()
    {
        // Display the Banner Page.
        System.out.println("\n"+
            "Welcome to the city of Aaron. A far far away place,\n"+
            "where you can live the adventurous adventure of taking\n"+
            "care of a city made of the things the cities use to be \n"+
            "made and deal with people that act like people use to act.\n"+
            "Don't worry if it doesn't sound too exciting now, we can \n"+
            "guarantee you're going to have lots of fun here! \n"+
            "Be comfortable in your chair (sofa, bed, or whatever) and enjoy!");
        // Create a new Player object???
        // Prompt for and get the user’s name.
        String name;
        System.out.println("\nPlease type in your first name: ");
        name = keyboard.next();
        // Call the CreateNewGame() method in the GameControl class
        GameControl.createNewGame(name);
        // Display a welcome message
        System.out.println("\nWelcome " + name + " have fun!!!");
        // Display the Game menu
        GameMenuView gmv = new GameMenuView();
        gmv.displayMenuView();
    }
    public void startSavedGame()
    {
        System.out.println("\nStart saved game option selected.");
    }
    public void displayHelpMenuView()
    {
        System.out.println("\nHelp menu view option selected.");//is this line 
                                                                //still necessary?
        HelpMenuView hmv = new HelpMenuView();
        hmv.displayMenuView();
    }
    public void displaySaveGameView()
    {
        System.out.println("\nSave Game view option selected.");
    }

    
    
}
