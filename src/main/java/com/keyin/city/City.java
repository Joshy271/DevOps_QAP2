package com.keyin.city;

import com.keyin.airport.*;
import jakarta.persistence.*;

import java.util.List;

@Entity
public class City {
    @Id
    @SequenceGenerator(name = "city_sequence", sequenceName = "city_sequence", allocationSize = 1, initialValue=1)
    @GeneratedValue(generator = "city_sequence")

    private long cityid;
    private String name;
    private String state;
    private int population;

    @OneToMany
    private List<Airport> airports;

    public long getid() {
        return cityid;
    }

    public void setid(long id) {
        this.cityid = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }
}
