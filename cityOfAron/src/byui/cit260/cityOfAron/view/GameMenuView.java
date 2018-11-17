package byui.cit260.cityOfAron.view;

import byui.cit260.cityOfAron.model.Game;
import java.util.Scanner;

/**
 * @author Fernando
 */
public class GameMenuView extends MenuView{
      
    Game theGame;
       
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

    public Game getTheGame() {
        return theGame;
    }

    public void setTheGame(Game theGame) {
        this.theGame = theGame;
    }
    
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
        
    }
    
    void viewList(){
        ListMenuView lmv = new ListMenuView();
        lmv.displayMenuView();                 
    }
    
    void moveToNewLocation(){
        
    }
    
    void manageCrops(){
        CropView.runCropsView();
    }
}
