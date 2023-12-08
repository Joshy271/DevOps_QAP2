package com.keyin.aircraft;

import javax.persistence.*;

@Entity
public class airport {
    @Id
    @SequenceGenerator(name = "aircraft_sequence", sequenceName = "aircraft_sequence", allocationSize = 1, initialValue=1)
    @GeneratedValue(generator = "aircraft_sequence")
    private long airportid;
    private String name;
    private String code;


    public long getId() {
        return airportid;
    }

    public void setId(long id){
        this.airportid = id;
    }

    public String getName(String name){
        return name;
    }

    public void setName(){
        this.name = name;
    }

    public String getCode(String code){
        return code;
    }

    public void setCode(){
        this.code = code;
    }
}

