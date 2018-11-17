/*
* The HelpMenuView() class file for the cityOfAaron project
* CIT-260
* Fall 2018
* Team members: Andre Matheus, Fernando Santos, Vinicius
*/
package byui.cit260.cityOfAron.view;
import byui.cit260.cityOfAron.model.Game;
import java.util.Scanner;

/**
 * @author Andre Pedrosa
 */
public class HelpMenuView extends MenuView {
    
   String helpMenu;

    public HelpMenuView() 
    {
        super("\n"+
              "****************************\n" +
              "* CITY OF AARON: HELP MENU *\n" +
              "****************************\n" +
              "1 – What are the goals of the game?\n" +
              "2 – Where is the city of Aaron?\n" +
              "3 – How do I view the map?\n" +
              "4 – How do I move to another location?\n" +
              "5 – How do I display a list of animals, provisions and tools in the city storehouse?\n" +
              "6 – Back to the Main Menu.\n",
              6);
    }
    
//    + doAction(): void
    @Override
    public void doAction(int option)
    {
        switch (option){
            case 1:// if the option is 1, call viewGoals( )
                viewGoals();
                break;
            case 2:// if the option is 2, call viewCityLocation( )
                viewCityLocation();//See note in the method below
                break;
            case 3:// if the option is 2, call viewMapHelp( )
                viewMapHelp();
                break;
            case 4:// if the option is 3, call viewMoveHelp( )
                viewMoveHelp();
                break;
            case 5:// if the option is 4, call viewListHelp( )
                viewListHelp();
                break;
            case 6:// if the option is 5, return to main menu
                System.out.println("\nReturning to main menu");
                return;
        }
    }

//    + viewGoals(): void
    public void viewGoals()
    {
        System.out.println("\nThe goals of the game are:...");

    }
    
//    + viewCityLocation():void
    public void viewCityLocation() //this one dont appear in the READ ME FIRST
                                   //but there was an option to ask where is
                                   //the City of Aaron in the requirements 
                                   //document so I created this one. 
    {
        System.out.println("\nThe city of Aaron is...");
    }
    
//    + viewMapHelp(): void
    public void viewMapHelp()
    {
        System.out.println("\nTo view the map you...");
    }
    
//    + viewMoveHelp(): void
    public void viewMoveHelp()
    {
        System.out.println("\nTo move you...");
    }
    
//    + viewListHelp(): void  
    public void viewListHelp()
    {
        System.out.println("\nTo display the...");
    }
       
}
