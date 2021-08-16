package InterfaceConcept;

public class TestHospital {

    public static void main(String[] args) {

        FortisHospital fh = new FortisHospital();

        fh.cardioServices();
        fh.emergencyServices();
        fh.ENTServices();
        fh.gyncServices();

        fh.pathologyServices();
        fh.medicalInsurance();
        fh.totalDoctors(100);
        USMedical.hospitalAdmin();

        fh.medicalTraining();

        fh.covidTest();

        fh.billing();

        fh.medicalResearch();

        System.out.println(USMedical.min_fee);

        //Top Casting
        USMedical us = new FortisHospital();//child class object can be referred by parent interface ref variable

        us.orthoServices();
        us.physioServices();
        us.cardioServices();
        us.emergencyServices();

        //down casting:
        //FortisHospital fh1 = new USMedical();



    }
}
