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
public class HelpMenuView {
    
   String helpMenu;
   int max;
   private static Scanner keyboard = new Scanner(System.in);

    public HelpMenuView() 
    {
        this.helpMenu = "\n"+
                        "**********************************\n" +
                        "* CITY OF AARON: HELP MENU *\n" +
                        "**********************************\n" +
                        "1 – What are the goals of the game?\n" +
                        "2 – Where is the city of Aaron?\n" +
                        "3 – How do I view the map?\n" +
                        "4 – How do I move to another location?\n" +
                        "5 – How do I display a list of animals, provisions and tools in the city storehouse?\n" +
                        "6 – Back to the Main Menu.";
        this.max = 6;
    }


//    + displayMenuView(): void
public void displayMenuView()
    {
        int menuOption;
        do
        {
            // Display the menu
            System.out.println(helpMenu);
            // Prompt the user and get the user’s input
            menuOption = getMenuOption();
            // Perform the desired action
            doAction(menuOption);
            // Determine and display the next view
        } while (menuOption != max);
    }
    
//    + getMenuOption(): int
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
    
//    + doAction(): void
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
                System.out.println("Returning to main menu");
                return;
        }
    }

//    + viewGoals(): void
    public void viewGoals()
    {
        System.out.println("The goals of the game are:...");

    }
    
//    + viewCityLocation():void
    public void viewCityLocation() //this one dont appear in the READ ME FIRST
                                   //but there was an option to ask where is
                                   //the City of Aaron in the requirements 
                                   //document so I created this one. 
    {
        System.out.println("The city of Aaron is...");
    }
    
//    + viewMapHelp(): void
    public void viewMapHelp()
    {
        System.out.println("To view the map you...");
    }
    
//    + viewMoveHelp(): void
    public void viewMoveHelp()
    {
        System.out.println("To move you...");
    }
    
//    + viewListHelp(): void  
    public void viewListHelp()
    {
        System.out.println("To display the...");
    }
       
}
