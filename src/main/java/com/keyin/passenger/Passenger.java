package com.keyin.passenger;

import com.keyin.city.*;
import com.keyin.aircraft.*;
import jakarta.persistence.*;

import java.util.List;

@Entity
public class Passenger {
@Id
@SequenceGenerator(name = "passenger_sequence", sequenceName = "passenger_sequence", allocationSize = 1, initialValue=1)
@GeneratedValue(generator = "passenger_sequence")

    private long passengerid;
    private String firstName;
    private String lastName;
    private String phoneNumber;

    @OneToMany
    private List<Aircraft> aircrafts;

    @OneToOne
    private City city;

    public long getid(){
        return passengerid;
    }

    public void setid(long id) {
        this.passengerid = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
