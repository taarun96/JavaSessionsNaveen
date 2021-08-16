package ConstructorConcept;

import java.util.ArrayList;

public class CarDesign {

    String name;
    String color;
    int price;
    double mileage;
    boolean isElectric;
    char isAvailable;
    ArrayList<String> featuresList;
    String demo;

    public CarDesign(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public CarDesign(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public CarDesign(String name, String color, int price, char isAvailable) {
        this.name = name;
        this.color = color;
        this.price = price;
        this.isAvailable = isAvailable;
    }

    public CarDesign(String name, String color, int price, double mileage, boolean isElectric, char isAvailable,
                     ArrayList<String> featuresList) {

        this.name = name;
        this.color = color;
        this.price = price;
        this.mileage = mileage;
        this.isElectric = isElectric;
        this.isAvailable = isAvailable;
        this.featuresList = featuresList;
    }

    public String getDemo() {
        int a = 10;
        int b = 20;
        int total = a + b;
        System.out.println(total);
        return demo;
    }


}