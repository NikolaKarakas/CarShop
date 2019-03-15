package com.example.carshop;

import android.graphics.Picture;
import android.view.Display;

public class Cars {

     String Brand;
      String Model;
     String Year;
     String Mileage;
     String Fuel;
     String Type;
     String Power;
     String Price;


    public Cars (String brand,String model, String year, String mileage, String fuel,String type, String power, String price)
    {
        Brand =brand;
        Model = model;
        Year = year;
        Mileage = mileage;
        Fuel = fuel;
        Type = type;
        Power = power;
        Price = price;
    }

    public String getBrand() {
        return Brand;
    }

    public void setBrand(String brand) {
        Brand = brand;
    }

    public String getModel() {
        return Model;
    }

    public void setModel(String model) {
        Model = model;
    }

    public String getYear() {
        return Year;
    }

    public void setYear(String year) {
        Year = year;
    }

    public String getMileage() {
        return Mileage;
    }

    public void setMileage(String mileage) {
        Mileage = mileage;
    }

    public String getFuel() {
        return Fuel;
    }

    public void setFuel(String fuel) {
        Fuel = fuel;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }

    public String getPower() {
        return Power;
    }

    public void setPower(String power) {
        Power = power;
    }

    public String getPrice() {
        return Price;
    }

    public void setPrice(String price) {
        Price = price;
    }
}
