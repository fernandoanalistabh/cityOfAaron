// The City of Aaron Game
// The driver file, contains the main() method
// Author: Fernando and Andre
// Date last modified: Nov 2018
//-------------------------------------------------------------
package byui.cit260.cityOfAron.model;
import byui.cit260.cityOfAron.view.*;
/**
 * @author Fernando e Andre
 */
public class CityOfAron {

    /**
     * @param args the command line arguments
     */
    // variable for keeping a reference to the Game object
    private static Game theGame = null;//I (Andre) believe it's temporary
    
    // main function - entry point for the program
    // runs the main menu
    public static void main(String[] args) 
    {
        MainMenuView mmv = new MainMenuView();
        mmv.displayMenu();    
    }
    
    public static Game getTheGame() 
    {
        return theGame;
    }

    public static void setTheGame(Game _theGame) 
    {
        CityOfAron.theGame = _theGame;
    }
    
        /*// TODO code application logic here
        Player newPlayer = new Player();
        newPlayer.setName("João");
        String newPlayerName = newPlayer.getName(); 
        System.out.println(newPlayerName);
        System.out.println(newPlayer.toString());
        System.out.println(TeamMember.Andre.getName());
        System.out.println(TeamMember.Andre.getTitle());
        
        //Fernando's Tests
        ListItem item = new ListItem();
        item.setName("Sword");
        item.setNumber(23);
        System.out.println(item.toString());
        
        //André's tests
        Location saara = new Location();
        saara.setDescription("Deserto");
        saara.setSymbol("D");
        System.out.println(saara.toString());
        Map des_saara = new Map();
        des_saara.setColCont(50);
        des_saara.setRowCount(55);
        
        System.out.println(des_saara.toString());*/
        
    //}

}
