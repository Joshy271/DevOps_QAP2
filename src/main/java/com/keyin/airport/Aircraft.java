package com.keyin.airport;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class Aircraft {
    @Id
    @SequenceGenerator(name = "airport_sequence", sequenceName = "airport_sequence", allocationSize = 1, initialValue=1)
    @GeneratedValue(generator = "airport_sequence")

    private long aircraftid;
    private String type;
    private String airlineName;
    private int numPassengers;
}
