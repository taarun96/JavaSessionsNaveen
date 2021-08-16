package Inheritance;

class TestCar {

    public static void main(String[] args) {

        BMW b = new BMW();
        b.start();// overridden
        b.stop();// inherited
        b.refuel();// inherited
        b.autoParking();// child class
        //b.engine();
        System.out.println(b.engine);
        BMW.sunRoof();

        b.musicSystem();
        b.musicSystem("Hollywood");
        b.musicSystem("London", 94.3);

        Car c = new Car();
        c.start();
        c.stop();
        c.refuel();
        System.out.println(c.engine);
        c.engine();
        Car.sunRoof();

        // Top casting:
        Car c1 = new BMW(); // child class object can be referred by parent class ref variable

        c1.start();
        c1.stop();
        c1.refuel();
        //c1.autoParking() ---Not Allowed --->Reference Type Check is done by Java internally additoional security
        // down casting:
       // BMW b1 = (BMW) new Car();// ClassCastException will be thrown at RunTime

        //Static Method cannot be overridden in Java
        //Static ---> Common Memory Allocation --- Objects can be overridden but static which has a CMA cannot be
        //overriden
        //Final prevents inheritance and method overloading as well

    }
}