/*
* The Player() class file for the cityOfAaron project
* CIT-260
* Fall 2018
* Team members: Andre Matheus, Fernando Santos, Vinicius
*/
package byui.cit260.cityOfAron.model;
import java.io.Serializable;
import java.util.Objects;
import java.util.ArrayList;
/**
 *
 * @author Andre Pedrosa and Fernando Santos
 */
public class Player implements Serializable{

    private String name;
    
    private ArrayList<Game> games = new ArrayList<Game>();
    
    
    public Player() {
    }

    
    public String getName() {
        return name;
    }
    public void setName(String _name) {
        this.name = _name;
    }
            
    public ArrayList<Game> getGames() {
        return games;
    }
    public void setGames(ArrayList<Game> games) {
        this.games = games;
    }
    
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.name);
        hash = 97 * hash + Objects.hashCode(this.games);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Player other = (Player) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.games, other.games)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Player{" + "name=" + name + ", games=" + games + '}';
    }

    
}

