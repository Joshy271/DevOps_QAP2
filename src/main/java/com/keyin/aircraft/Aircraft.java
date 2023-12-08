package com.keyin.aircraft;

import jakarta.persistence.*;

@Entity
public class Aircraft {
    @Id
    @SequenceGenerator(name = "aircraft_sequence", sequenceName = "aircraft_sequence", allocationSize = 1, initialValue=1)
    @GeneratedValue(generator = "aircraft_sequence")

    private long aircraftid;
    private String type;
    private String airlineName;
    private int numPassengers;
    private String planeCode;

    public long getAircraftid(){
        return aircraftid;
    }
    public void setAircraftid(long aircraftid){
        this.aircraftid = aircraftid;
    }

    public String getType(){
        return type;
    }
    public void setType(String type){
        this.type = type;
    }

    public String getAirlineName(){
        return airlineName;
    }

    public void setAirlineName(String airlineName) {
        this.airlineName = airlineName;
    }
    public int getNumPassengers(){
        return numPassengers;
    }

    public void setNumPassengers(int numPassengers) {
        this.numPassengers = numPassengers;
    }

    public String getPlaneCode() {
        return planeCode;
    }

    public void setPlaneCode(String planeCode) {
        this.planeCode = planeCode;
    }
}
