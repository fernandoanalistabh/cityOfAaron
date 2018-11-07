package byui.cit260.cityOfAron.view;

import byui.cit260.cityOfAron.model.Game;
import java.util.Scanner;

/**
 * @author Fernando
 */
public class GameMenuView {
    String gameMenu;
    int max;
    Scanner keyboard = new Scanner(System.in);
    Game theGame;
    
    public GameMenuView() {
        gameMenu = "\n"+
                  "**********************************\n" +
                  "* CITY OF AARON: THE GAME MENU *\n" +
                  "**********************************\n" +
                  " 1 - View Map\n" +
                  " 2 - View List\n" +
                  " 3 - Move to a new Location\n" +
                  " 4 - Manage Crops\n" +
                  " 5 - Return to Main Menu\n";
        max = 5;
    }

    public String getGameMenu() {
        return gameMenu;
    }

    public void setGameMenu(String gameMenu) {
        this.gameMenu = gameMenu;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public Game getTheGame() {
        return theGame;
    }

    public void setTheGame(Game theGame) {
        this.theGame = theGame;
    }
    
    /**
    * The displayMenuView method
    * Purpose: displays the menu, gets the user's input, and does the
    *          selected action
    * Parameters: none
    * Returns: none
    */
    // ========================================================= 
    public void displayMenuView()
    {
        int menuOption;
        do
        {
            // Display the menu
            System.out.println(getGameMenu());
            // Prompt the user and get the user’s input
            menuOption = getMenuOption();
            // Perform the desired action
            doAction(menuOption);
            // Determine and display the next view
        } while (menuOption != max);
    }
    
    /**
    * The getMenuOption method
    * Purpose: gets the user's input
    * Parameters: none
    * Returns: integer - the option selected
    */
    // =================================== 
    public int getMenuOption()
    {
        // declare a variable to hold user’s input
        int userInput;
        // begin loop
        do
        {    
            // get user input from the keyboard
            userInput = keyboard.nextInt();
            // if it is not a valid value, output an error message
            if (userInput < 1 || userInput > max)
            {
                System.out.println("Option must be between 1 and " + max);
            }
        // loop back to the top if input was not valid
        } while (userInput < 1 || userInput > max);
        // return the value input by the user
        return userInput;
    }
    
    /**
    *The doAction method
    * Purpose: performs the selected action
    * Parameters: option
    * Returns: none
    */
    // =================================== 
    public void doAction(int option)
    {
        switch (option){
            case 1:// if the option is 1, call viewMap()
                viewMap();
                break;
            case 2:// if the option is 2, call viewList( )
                viewList();
                break;
            case 3:// if the option is 3, call moveToNewLocation( )
                moveToNewLocation();
                break;
            case 4:// if the option is 4, call manageCrops( )
                manageCrops();
                break;
            case 5:// if the option is 5, return to Main Menu
                System.out.println("Returning to Main Menu.");
                return;
        }
    }
    void viewMap(){
        
    }
    
    void viewList(){
        
    }
    
    void moveToNewLocation(){
        
    }
    
    void manageCrops(){
        
    }
}
