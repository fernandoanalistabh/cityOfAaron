/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.cityOfIron.model;

import java.util.Objects;
import java.io.Serializable;
/**
 *
 * @author Fernando
 */
public class CropData implements Serializable{
    private int year;
    private int population;
    private int acresOwned;
    private int cropYield;
    private int wheatInStore;
    private int numberWhoDied;
    private int newPeople;
    private int harvest;
    private int havestAfterOffering;
    private int offering;
    private int offeringsBushels;
    private int propleFed;
    private int acresPlanted;
    private int numStarved;
    private int eatenByRats;
    private int wheatForPeople;
    private Game _game;

    public CropData() {
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public int getAcresOwned() {
        return acresOwned;
    }

    public void setAcresOwned(int acresOwned) {
        this.acresOwned = acresOwned;
    }

    public int getCropYield() {
        return cropYield;
    }

    public void setCropYield(int cropYield) {
        this.cropYield = cropYield;
    }

    public int getWheatInStore() {
        return wheatInStore;
    }

    public void setWheatInStore(int wheatInStore) {
        this.wheatInStore = wheatInStore;
    }

    public int getNumberWhoDied() {
        return numberWhoDied;
    }

    public void setNumberWhoDied(int numberWhoDied) {
        this.numberWhoDied = numberWhoDied;
    }

    public int getNewPeople() {
        return newPeople;
    }

    public void setNewPeople(int newPeople) {
        this.newPeople = newPeople;
    }

    public int getHarvest() {
        return harvest;
    }

    public void setHarvest(int harvest) {
        this.harvest = harvest;
    }

    public int getHavestAfterOffering() {
        return havestAfterOffering;
    }

    public void setHavestAfterOffering(int havestAfterOffering) {
        this.havestAfterOffering = havestAfterOffering;
    }

    public int getOffering() {
        return offering;
    }

    public void setOffering(int offering) {
        this.offering = offering;
    }

    public int getOfferingsBushels() {
        return offeringsBushels;
    }

    public void setOfferingsBushels(int offeringsBushels) {
        this.offeringsBushels = offeringsBushels;
    }

    public int getPropleFed() {
        return propleFed;
    }

    public void setPropleFed(int propleFed) {
        this.propleFed = propleFed;
    }

    public int getAcresPlanted() {
        return acresPlanted;
    }

    public void setAcresPlanted(int acresPlanted) {
        this.acresPlanted = acresPlanted;
    }

    public int getNumStarved() {
        return numStarved;
    }

    public void setNumStarved(int numStarved) {
        this.numStarved = numStarved;
    }

    public int getEatenByRats() {
        return eatenByRats;
    }

    public void setEatenByRats(int eatenByRats) {
        this.eatenByRats = eatenByRats;
    }

    public int getWheatForPeople() {
        return wheatForPeople;
    }

    public void setWheatForPeople(int wheatForPeople) {
        this.wheatForPeople = wheatForPeople;
    }

    public Game getGame() {
        return _game;
    }

    public void setGame(Game _game) {
        this._game = _game;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + this.year;
        hash = 79 * hash + this.population;
        hash = 79 * hash + this.acresOwned;
        hash = 79 * hash + this.cropYield;
        hash = 79 * hash + this.wheatInStore;
        hash = 79 * hash + this.numberWhoDied;
        hash = 79 * hash + this.newPeople;
        hash = 79 * hash + this.harvest;
        hash = 79 * hash + this.havestAfterOffering;
        hash = 79 * hash + this.offering;
        hash = 79 * hash + this.offeringsBushels;
        hash = 79 * hash + this.propleFed;
        hash = 79 * hash + this.acresPlanted;
        hash = 79 * hash + this.numStarved;
        hash = 79 * hash + this.eatenByRats;
        hash = 79 * hash + this.wheatForPeople;
        hash = 79 * hash + Objects.hashCode(this._game);
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
        final CropData other = (CropData) obj;
        if (this.year != other.year) {
            return false;
        }
        if (this.population != other.population) {
            return false;
        }
        if (this.acresOwned != other.acresOwned) {
            return false;
        }
        if (this.cropYield != other.cropYield) {
            return false;
        }
        if (this.wheatInStore != other.wheatInStore) {
            return false;
        }
        if (this.numberWhoDied != other.numberWhoDied) {
            return false;
        }
        if (this.newPeople != other.newPeople) {
            return false;
        }
        if (this.harvest != other.harvest) {
            return false;
        }
        if (this.havestAfterOffering != other.havestAfterOffering) {
            return false;
        }
        if (this.offering != other.offering) {
            return false;
        }
        if (this.offeringsBushels != other.offeringsBushels) {
            return false;
        }
        if (this.propleFed != other.propleFed) {
            return false;
        }
        if (this.acresPlanted != other.acresPlanted) {
            return false;
        }
        if (this.numStarved != other.numStarved) {
            return false;
        }
        if (this.eatenByRats != other.eatenByRats) {
            return false;
        }
        if (this.wheatForPeople != other.wheatForPeople) {
            return false;
        }
        if (!Objects.equals(this._game, other._game)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "CropData{" + "year=" + year + ", population=" + population + ", acresOwned=" + acresOwned + ", cropYield=" + cropYield + ", wheatInStore=" + wheatInStore + ", numberWhoDied=" + numberWhoDied + ", newPeople=" + newPeople + ", harvest=" + harvest + ", havestAfterOffering=" + havestAfterOffering + ", offering=" + offering + ", offeringsBushels=" + offeringsBushels + ", propleFed=" + propleFed + ", acresPlanted=" + acresPlanted + ", numStarved=" + numStarved + ", eatenByRats=" + eatenByRats + ", wheatForPeople=" + wheatForPeople + ", _game=" + _game + '}';
    }
}
