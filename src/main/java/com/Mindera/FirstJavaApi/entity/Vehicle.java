package com.Mindera.FirstJavaApi.entity;

import jakarta.persistence.*;


@Entity(name = "Vehicle")
public class Vehicle {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column
    private String plate;

    @Column
    private Boolean vehicleStatus;

    @Column
    private String brand;

    @Column
    private String color;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }

    public Boolean getVehicleStatus() {
        return vehicleStatus;
    }

    public void setVehicleStatus(Boolean vehicleStatus) {
        this.vehicleStatus = vehicleStatus;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
