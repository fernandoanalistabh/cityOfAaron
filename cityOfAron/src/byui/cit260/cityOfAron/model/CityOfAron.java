/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.cityOfAron.model;

/**
 *
 * @author Fernando e Andre
 */
public class CityOfAron {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
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
    }
    
}
