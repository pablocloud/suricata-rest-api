package com.besuricata.rest.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class Suricata implements Serializable {

    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private Double height;

    public Suricata() {

    }

    public Suricata(String name, Double height) {
        this.name = name;
        this.height = height;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

}
