/*
* The Game() class file for the cityOfAaron project
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
public class Game implements Serializable{

    private Player thePlayer;
    private ArrayList<ListItem> tools; 
    private CropData _cropData;

    public Game() {
        setTools(new ArrayList<ListItem>());
    }

    public Player getThePlayer() {
        return thePlayer;
    }

    public void setThePlayer(Player _thePlayer) {
        this.thePlayer = _thePlayer;
    }

    public ArrayList<ListItem> getTools() {
        return tools;
    }

    public void setTools(ArrayList<ListItem> tools) {
        this.tools = tools;
    }

    public CropData getCropData() {
        return _cropData;
    }

    public void setCropData(CropData _cropData) {
        this._cropData = _cropData;
    }
    
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 43 * hash + Objects.hashCode(this.thePlayer);
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
        final Game other = (Game) obj;
        if (!Objects.equals(this.thePlayer, other.thePlayer)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Game{" + "thePlayer=" + thePlayer + '}';
    }

    
    
}
