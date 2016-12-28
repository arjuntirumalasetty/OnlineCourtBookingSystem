package com.findsport.DataObjects;

/**
 * Created by Arjun on 12/26/2016.
 */
public class Stadium {

    private int stadiumID;
    private String stadiumLongitude;
    private String stadiumLatitude;
    private String stadiumPhoneNo;
    private String stadiumAddress;
    private String stadiumName;

    public void setStadiumID(int stadiumID) {
        this.stadiumID = stadiumID;
    }

    public void setStadiumName(String stadiumName) {
        this.stadiumName = stadiumName;
    }

    public void setStadiumLongitude(String stadiumLongitude) {
        this.stadiumLongitude = stadiumLongitude;
    }

    public void setStadiumLatitude(String stadiumLatitude) {
        this.stadiumLatitude = stadiumLatitude;
    }

    public void setStadiumPhoneNo(String stadiumPhoneNo) {
        this.stadiumPhoneNo = stadiumPhoneNo;
    }

    public void setStadiumAddress(String stadiumAddress) {
        this.stadiumAddress = stadiumAddress;
    }

    public int getStadiumID() {
        return stadiumID;
    }

    public String getStadiumName() {
        return stadiumName;
    }

    public String getStadiumLongitude() {
        return stadiumLongitude;
    }

    public String getStadiumLatitude() {
        return stadiumLatitude;
    }

    public String getStadiumPhoneNo() {
        return stadiumPhoneNo;
    }

    public String getStadiumAddress() {
        return stadiumAddress;
    }
}
