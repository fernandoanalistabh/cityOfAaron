package byui.cit260.cityOfAron.view;

import byui.cit260.cityOfAron.control.GameControl;
import byui.cit260.cityOfAron.model.Game;
import java.util.Scanner;

/**
 * @author Fernando
 */
public class GameMenuView extends MenuView{
    
    Scanner keyboard = new Scanner(System.in);
    
    //Game theGame;
    
    public GameMenuView() {
        super("\n"+
                  "********************************\n" +
                  "* CITY OF AARON: THE GAME MENU *\n" +
                  "********************************\n" +
                  " 1 – View the map\n" +
                  " 2 – View/Print a list\n" +
                  " 3 – Move to a new location\n" +
                  " 4 – Manage the Crops\n" +
                  " 5 – Return to the Main menu\n", 5);
    }

    public String getGameMenu() {
        return menu;
    }

    public void setGameMenu(String gameMenu) {
        this.menu = gameMenu;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    //public Game getTheGame() {
    //    return theGame;
    //}

    //public void setTheGame(Game theGame) {
    //    this.theGame = theGame;
    //}
    
    /**
    *The doAction method
    * Purpose: performs the selected action
    * Parameters: option
    * Returns: none
    */
    // =================================== 
    @Override
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
        GameControl.displayMap();
    }
    
    void viewList(){
        ListMenuView lmv = new ListMenuView();
        lmv.displayMenuView();                 
    }
    
    /** --added L13
    * The moveToNewLocation method
    * Purpose: prompt the user for a place and move them to there
    * Parameters: none
    * Returns: none
    */
    void moveToNewLocation(){
        // Define variables for the coordinates
        int col, row;
        // Define maximun values for col and row
        int maxCol = GameControl.game.getMap().getColCount()-1;
        int maxRow = GameControl.game.getMap().getRowCount()-1;
                   
        // Ask for column coordinate and assign to variable
        System.out.println("Enter a column number: ");
        // begin loop
        do{    
            // get user input from the keyboard
            col = keyboard.nextInt()-1;
            // if it is not a valid value, output an error message
            if (col < 0 || col > maxCol){
                System.out.println("Column number must be between 1 and 5");
            }
        // loop back to the top if input was not valid
        } while (col < 0 || col > maxCol);

        // Ask for row coordinate and assign to variable
        System.out.println("Enter a row number: ");
        // begin loop
        do{    
            // get user input from the keyboard
            row = keyboard.nextInt()-1;
            // if it is not a valid value, output an error message
            if (row < 0 || row > maxRow){
                System.out.println("Row number must be between 1 and 5");
            }
        // loop back to the top if input was not valid
        } while (row < 0 || row > maxRow);

        // check if player is already in this place
        if (GameControl.thePlayer.getRowPos()==row && GameControl.thePlayer.getColPos()==col){
            // give a message you're already in the place
            System.out.println("You're aleardy in this place");
        } else {
            // set player's position to the chosen col/row        
            GameControl.thePlayer.setColPos(col);
            GameControl.thePlayer.setRowPos(row);
            // print the new place's description
            System.out.println(GameControl.game.getMap().getLocation(row, col).getDescription());
        }
    }
    
    void manageCrops(){
        CropView cv = new CropView();
        cv.runCropsView();
    }
}
