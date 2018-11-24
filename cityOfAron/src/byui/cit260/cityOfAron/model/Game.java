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

    private Map theMap;
    private Player thePlayer;
    private CropData cropData;
    private ArrayList<ListItem> animals;
    private ArrayList<ListItem> tools;
    // I turned this variable static so it can be refered without being 
    //instatiated yet
    private static ArrayList<ListItem> provisions;
    
    public Game() {
        setAnimals(new ArrayList<ListItem>());
        setTools(new ArrayList<ListItem>());
        setProvisions(new ArrayList<ListItem>());    
    }    

    public Map getTheMap() {
        return theMap;
    }

    public void setTheMap(Map _theMap) {
        this.theMap = _theMap;
    }

    public Player getThePlayer() {
        return thePlayer;
    }

    public void setThePlayer(Player _thePlayer) {
        this.thePlayer = _thePlayer;
    }

    public CropData getCropData() {
        return cropData;
    }

    public void setCropData(CropData _cropData) {
        this.cropData = _cropData;
    }

    public ArrayList<ListItem> getAnimals() {
        return animals;
    }

    public void setAnimals(ArrayList<ListItem> _animals) {
        this.animals = _animals;
    }
    
    public ArrayList<ListItem> getTools() {
        return tools;
    }

    public void setTools(ArrayList<ListItem> _tools) {
        this.tools = _tools;
    }

    // I turned this method static so it can be refered without being 
    //instatiated yet
    public static ArrayList<ListItem> getProvisions() {
        return provisions;
    }

    // I turned this method static so it can be refered without being 
    //being instatiated yet
    public static void setProvisions(ArrayList<ListItem> _provisions) {
        Game.provisions = _provisions;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 83 * hash + Objects.hashCode(this.theMap);
        hash = 83 * hash + Objects.hashCode(this.thePlayer);
        hash = 83 * hash + Objects.hashCode(this.cropData);
        hash = 83 * hash + Objects.hashCode(this.animals);
        hash = 83 * hash + Objects.hashCode(this.tools);
        hash = 83 * hash + Objects.hashCode(this.provisions);
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
        if (!Objects.equals(this.theMap, other.theMap)) {
            return false;
        }
        if (!Objects.equals(this.thePlayer, other.thePlayer)) {
            return false;
        }
        if (!Objects.equals(this.cropData, other.cropData)) {
            return false;
        }
        if (!Objects.equals(this.animals, other.animals)) {
            return false;
        }
        if (!Objects.equals(this.tools, other.tools)) {
            return false;
        }
        if (!Objects.equals(this.provisions, other.provisions)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Game{" + "theMap=" + theMap + ", thePlayer=" + thePlayer + ", cropData=" + cropData + ", animals=" + animals + ", tools=" + tools + ", provisions=" + provisions + '}';
    }

}
