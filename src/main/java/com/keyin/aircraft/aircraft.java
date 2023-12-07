package com.keyin.aircraft;

import javax.persistence.*;
import java.util.List;

@Entity
public class aircraft {
    @Id
    @SequenceGenerator(name = "aircraft_sequence", sequenceName = "aircraft_sequence", allocationSize = 1, initialValue=1)
    @GeneratedValue(generator = "aircraft_sequence")
    private long id;
    private String name;
    private String code;


    public long getId() {
        return id;
    }

    public void setId(long id){
        this.id = id;
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

