package com.keyin.airport;

import com.keyin.city.*;
import jakarta.persistence.*;

import java.util.List;

@Entity
public class Airport {
    @Id
    @SequenceGenerator(name = "airport_sequence", sequenceName = "airport_sequence", allocationSize = 1, initialValue=1)
    @GeneratedValue(generator = "airport_sequence")
    private long airportid;
    private String name;
    private String code;

    @OneToOne
    private City city;


    public long getId() {
        return airportid;
    }

    public void setId(long id){
        this.airportid = id;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getCode(){
        return code;
    }

    public void setCode(String code){
        this.code = code;
    }
}

