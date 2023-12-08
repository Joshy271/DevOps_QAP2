package com.keyin.aircraft;

import com.keyin.passenger.*;
import com.keyin.airport.*;
import jakarta.persistence.*;

import java.util.List;

@Entity
public class Aircraft {
    @Id
    @SequenceGenerator(name = "aircraft_sequence", sequenceName = "aircraft_sequence", allocationSize = 1, initialValue=8)
    @GeneratedValue(generator = "aircraft_sequence")

    private long aircraftid;
    private String type;
    private String airlineName;
    private int numPassengers;
    private String planeCode;

    @OneToMany
    private List<Passenger> passengers;

    @OneToMany
    private List<Airport> airports;

    public long getid(){
        return aircraftid;
    }
    public void setid(long id){
        this.aircraftid = id;
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
