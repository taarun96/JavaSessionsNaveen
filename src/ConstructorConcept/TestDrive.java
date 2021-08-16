package ConstructorConcept;

import java.util.ArrayList;

public class TestDrive {

    public static void main(String[] args) {
        CarDesign car_alto = new CarDesign("Alto","Red");

        System.out.println(car_alto.name + " " + car_alto.color + " " + car_alto.price);

        CarDesign car_bmw = new CarDesign("BMW 520d", "Blue", 80, 'Y');

        System.out.println(car_bmw.isAvailable);

        ArrayList<String> audiQ5Features = new ArrayList<String>();
        audiQ5Features.add("Automatic Parking");
        audiQ5Features.add("Turbo Q Engine");
        audiQ5Features.add("Sun Roof");
        audiQ5Features.add("Rear Camera");
        audiQ5Features.add("lane Assist");

        CarDesign audi_q5 = new CarDesign("Audi", "White", 85, 14.4, false, 'Y', audiQ5Features);

        System.out.println(audi_q5.name + " " + audi_q5.color + " " + audi_q5.price);

        System.out.println(audi_q5.featuresList);

        String f1 = audi_q5.featuresList.get(0);
        System.out.println(f1);



    }
}
