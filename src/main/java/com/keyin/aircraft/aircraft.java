package com.keyin.aircraft;

import javax.persistence.*;
import java.util.List;
public class aircraft {
    private long id;
    private String name;
    private String code;


    public long getId() {
        return id;
    }

    public void setId(long id){
        this.id = id;
    }

    public String getName(){
        return name;
    }

    public void setName(){
        this.name = name;
    }

    public String getCode(){
        return code;
    }

    public void setCode(){
        this.code = code;
    }
}

