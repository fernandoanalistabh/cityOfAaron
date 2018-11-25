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
    private int colCount;
    private Location[][] locations; 

    /**
    * default Map constructor
    * Purpose: Set data members to default values
    * Parameters: none
    * Returns: none
    */
    public Map()  {
    }
    
    /**
    * parameterized Map constructor
    * Purpose: Sets row and column values
    * and creates an array of Location objects
    * Parameters: row count and column count
    * Returns: none
    */
    public Map(int _rows, int _cols)
    {
    this.rowCount = _rows;
    this.colCount = _cols;
    // create the array of location objects
    this.locations = new Location[_rows][_cols];
    }


    public int getRowCount() {
        return rowCount;
    }

    public int getColCount() {
        return colCount;
    }

    /**
    * The getLocation method
    * Purpose: returns the location object at the given row and column
    * Parameters: a row and column
    * Returns: a Location object
    */
    public Location getLocation(int row, int col)
    {
    return this.locations[row][col];
    }


    /**
    * The setLocation method
    * Purpose: stores a location object at the row and column
    * Parameters: a row and column, and a reference to a location object
    * Returns: void
    */
    public void setLocation(int row, int col, Location _location)
    {
    this.locations[row][col] = _location;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + this.rowCount;
        hash = 97 * hash + this.colCount;
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
        if (this.colCount != other.colCount) {
            return false;
        }
        if (!Arrays.deepEquals(this.locations, other.locations)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Map{" + "rowCount=" + rowCount + ", colCont=" + colCount + ", locations=" + locations + '}';
    }



}
