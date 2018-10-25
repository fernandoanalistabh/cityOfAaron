/*
* The Map() class file for the cityOfAaron project
* CIT-260
* Fall 2018
* Team members: Andre Matheus, Fernando Santos, Vinicius
*/
package byui.cit260.cityOfAron.model;

import java.io.Serializable;
import java.util.Arrays;

/**
 *
 * @author Andre Pedrosa
 */
public class Map implements Serializable{
    private int rowCount;
    private int colCont;
    private Location locations[][];

    public Map() {
    }

    public int getRowCount() {
        return rowCount;
    }

    public void setRowCount(int rowCount) {
        this.rowCount = rowCount;
    }

    public int getColCont() {
        return colCont;
    }

    public void setColCont(int colCont) {
        this.colCont = colCont;
    }

    public Location[][] getLocations() {
        return locations;
    }

    public void setLocations(Location[][] locations) {
        this.locations = locations;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + this.rowCount;
        hash = 97 * hash + this.colCont;
        hash = 97 * hash + Arrays.deepHashCode(this.locations);
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
        final Map other = (Map) obj;
        if (this.rowCount != other.rowCount) {
            return false;
        }
        if (this.colCont != other.colCont) {
            return false;
        }
        if (!Arrays.deepEquals(this.locations, other.locations)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Map{" + "rowCount=" + rowCount + ", colCont=" + colCont + ", locations=" + locations + '}';
    }

    
    
}
