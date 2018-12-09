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
import java.io.IOException;
import java.io.PrintWriter;
import java.io.FileReader;
import java.io.BufferedReader;
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
                        "3 - Save the provitions to a listfile\n"+
                        "4 -   List or view the provisions in the storehouse.\n"+
                        "5 - List or view the authors of this game.\n"+
                        "6 - Return\n"; //This last option don't show in the
                                        //requirements document, but I though it 
                                        //would be more consistent to add it
                                        //once the other menus have.
        this.max = 6;
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
            case 3:// if the option is 3, call saveProvisions( )
                saveProvisions();
                break;
            case 4:// if the option is 4, call listProvisions( )
                listProvisions();
                break;
            case 5://if the option is 5, call listTeam( )
                listTeam();
                break;
            case 6:// if the option is 6, display a goodbye message
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
    
    public void saveProvisions(){
        // declare a string to hold the file name
        String fileName = "";
        // declare a reference to a PrintWriter object
        PrintWriter out = null;
        // prompt the user for a file name, get and save the user’s input
        System.out.println("Enter a list name to save:");
        fileName = keyboard.next();
        try {   
            // create the PrintWriter object
            out = new PrintWriter("pvl"+fileName+".txt");
            // get a reference to the ArrayList you want to output
            ArrayList<ListItem> provList = GameControl.getProv();
            // output a heading for the report
            out.println("\n     Provisions List\n");
            out.printf("%-17s%10s","Item","Quantity\n");
            out.printf("%-17s%10s","----","--------\n");
            // use a for loop to get the data from the ArrayList and output it
            for (ListItem i : provList){
                out.printf("%-17s%10s", i.getName() , i.getNumber()+"\n");            
            }
            //out.close();
            // print a success message
            System.out.println("Success!");
        } catch(IOException e) {
            System.out.println("Saving File Error.");
        } finally {
            out.close();
        }
    }
//    method to list provitions --L10
    public void listProvisions()
    {   
        // declare a string to hold the file name
        String fileName = "";
        // declare a reference to a BufferedReader object
        BufferedReader in = null;
        // prompt the user for a file name, get and save the user’s input
        System.out.println("Enter a list name to print:");
        fileName = keyboard.next();
        try {
            // create the BufferedReader object
            in = new BufferedReader(new FileReader("pvl"+fileName+".txt"));
            String line;
            while ((line = in.readLine()) != null){
                System.out.println(line);
            }
            in.close();
        } catch(IOException e) {
            System.out.println("Loading File Error.");
        }
    }   
    
//    + listTeam(): void  
    public void listTeam()
    {
        System.out.println("\nThe members in your team are:...");
    }
   
}

