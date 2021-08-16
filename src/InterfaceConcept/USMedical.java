package InterfaceConcept;

public interface USMedical  extends WHO, UN {
    int min_fee = 10;

    //Interface can not have method body
    //only method prototype
    //only method declaration
    //can not create the object of Interface
    //all the vars in Interface are static and final by default

    //100% abstraction in Interface

    //abstract methods
    public void orthoServices();

    public void physioServices();

    public void cardioServices();

    public void emergencyServices();

    public void totalDoctors(int count);


    //after JDK 1.8:
    //1. we can have static methods in Interface with method body:

    public static void hospitalAdmin() {
        System.out.println("US - hospitalAdmin");
    }

    //2. can have default method:

    public default void billing() {
        System.out.println("US - billing");
    }






}