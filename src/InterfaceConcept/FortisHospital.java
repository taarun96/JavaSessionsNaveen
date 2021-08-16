package InterfaceConcept;


public class FortisHospital extends MedicalAssociation implements USMedical, UKMedical, IndianMedical {

    // USA:
    @Override
    public void orthoServices() {
        System.out.println("FH -- orthoServices");
    }

    @Override
    public void physioServices() {
        System.out.println("FH -- physioServices");

    }

    @Override
    public void cardioServices() {
        System.out.println("FH -- cardioServices");

    }

    @Override
    public void totalDoctors(int count) {
        System.out.println("total doctors= " + count);
    }

    // UK:
    @Override
    public void pediaServices() {
        System.out.println("FH -- pediaServices");

    }

    @Override
    public void ENTServices() {
        System.out.println("FH -- ENTServices");

    }

    @Override
    public void emergencyServices() {
        System.out.println("FH -- emergencyServices");
    }

    // India:
    @Override
    public void gyncServices() {
        System.out.println("FH -- gyncServices");

    }

    @Override
    public void neuroServices() {
        System.out.println("FH -- neuroServices");

    }

    @Override
    public void oncologyServices() {
        System.out.println("FH -- oncologyServices");
    }


    //
    public void pathologyServices() {
        System.out.println("FH -- pathologyServices");
    }

    public void medicalInsurance() {
        System.out.println("FH -- medicalInsurance");

    }

    @Override
    public void billing() {
        System.out.println("FH - billing");
    }

    //WHO
    @Override
    public void covidTest() {
        System.out.println("FH -- Covid 19 test");
    }



}