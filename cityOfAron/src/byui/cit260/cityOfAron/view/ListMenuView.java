/*
* The ListMenuView() class file for the cityOfAaron project
* CIT-260
* Fall 2018
* Team members: Andre Matheus, Fernando Santos, Vinicius
*/
package byui.cit260.cityOfAron.view;
import byui.cit260.cityOfAron.control.GameControl;
import byui.cit260.cityOfAron.model.Game;
import byui.cit260.cityOfAron.model.ListItem;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Andre Pedrosa
 */
public class ListMenuView {
    
   String listMenu;
   int max;
   private static Scanner keyboard = new Scanner(System.in);

    public ListMenuView() 
    {
        this.listMenu = "\n"+
                        "****************************\n" +
                        "* CITY OF AARON: LIST MENU *\n" +
                        "****************************\n" +
                        "1 - List or view the animals in the storehouse.\n"+
                        "2 - List or view the tools in the storehouse.\n"+
                        "3 - List or view the provisions in the storehouse.\n"+
                        "4 - List or view the authors of this game.\n"+
                        "5 - Return\n"; //This last option don't show in the
                                        //requirements document, but I though it 
                                        //would be more consistent to add it
                                        //once the other menus have.
        this.max = 5;
    }


//    + displayMenuView(): void
public void displayMenuView()
    {
        int menuOption;
        do
        {
            // Display the menu
            System.out.println(listMenu);
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
            case 1:// if the option is 1, call listAnimals( )
                listAnimals();
                break;
            case 2:// if the option is 2, call listTools( )
                listTools();
                break;
            case 3:// if the option is 3, call listProvisions( )
                listProvisions();
                break;
            case 4://if the option is 4, call listTeam( )
                listTeam();
                break;
            case 5:// if the option is 5, display a goodbye message
                System.out.println("\nReturning to game menu");
                return;
        }
    }
    
//    + listAnimals(): void
    public void listAnimals()
    {
        System.out.print("Report's Name: ");
        String nameFile = keyboard.next();
        GameControl.animalsReport(nameFile);
        System.out.print("Report successfully saved.");
    }
    
//    + listTools(): void
    public void listTools()
    {
        System.out.println("\nThe tools you have are:...");
    }
    
//    method to list provitions --L10
    public void listProvisions()
    {   
        ArrayList<ListItem> provList = GameControl.getProv();
        System.out.println("\nProvitions in City of Aaron:");
        for (ListItem i : provList){ // Iterate through each item in 
                                     //the provisions list
            System.out.println(
                    // The String.format() method aligns the text, for more info
                    //see https://dzone.com/articles/java-string-format-examples
                    String.format("%-17s", i.getName()) + i.getNumber()
            );
        }
    }   
    
//    + listTeam(): void  
    public void listTeam()
    {
        System.out.println("\nThe members in your team are:...");
    }
   
}

