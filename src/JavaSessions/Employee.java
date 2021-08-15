package JavaSessions;

public class Employee {
    //class vars:
    String name;
    int age;
    double salary;
    boolean isActive;

    static String name2;
    static boolean bool;



    @Override
    public void finalize() {
        System.out.println("inside the Employee class finalize method....");
    }

    public static void main(String[] args) {


        //create object of this class:
        //new keyword:

        Employee e1 = new Employee();

        e1.name = "Tom";
        e1.age = 25;
        e1.salary = 34.44;
        e1.isActive = true;
        name2="Taarun";

        System.out.println(e1.name);
        System.out.println(e1.age);
        System.out.println(e1.isActive);
        System.out.println(name2);

        System.out.println(bool);
        Employee e2 = new Employee();
        e2.name = "Lisa";
        e2.age = 24;
        e2.salary = 34.12;
        e2.isActive = false;

        System.out.println(e2.name + " " + e2.age + " " + e2.salary + " " + e2.isActive);

        new Employee();

        Employee e4 = new Employee();
        e4 = null;
        e4.name = "testing";


        //System.gc();

    }

}
