package com.findsport.DataObjects;

/**
 * Created by Arjun on 12/26/2016.
 */
public class StadiumSport {

    public int getStadiumID() {
        return stadiumID;
    }

    public int getSportID() {
        return sportID;
    }

    public int getCourtCount() {
        return courtCount;
    }

    private int stadiumID;

    public void setStadiumID(int stadiumID) {
        this.stadiumID = stadiumID;
    }

    public void setSportID(int sportID) {
        this.sportID = sportID;
    }

    public void setCourtCount(int courtCount) {
        this.courtCount = courtCount;
    }

    private int sportID;
    private int courtCount;
}
