/*
* The TeamMember() class file for the cityOfAaron project
* CIT-260
* Fall 2018
* Team members: Andre Matheus, Fernando Santos, Vinicius
*/
package byui.cit260.cityOfAron.model;
import java.awt.Point;
/**
 *
 * @author Andre Pedrosa and Fernando Santos
 */
public enum TeamMember {
    
    Andre("Andre","Programmer"),
    Fernando("Fernando","Programmer"),
    Vinicius("Vinicius","Programmer");
    
    private String name;
    private String title;
    
    TeamMember(String _name, String _title){
        this.name = _name;
        this.title = _title;
    }

    public String getName() {
        return name;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return "TeamMember{" + "name=" + name + ", title=" + title + '}';
    }
    
    
    
    

}
