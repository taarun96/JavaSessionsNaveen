package Inheritance;

    public class BMW extends Car {

        // Method Overridding: Poly + morphism (Run time/Dynamic )
        // when we have a parent class having the same method with the same name and
        // same number of
        // parameters in child class -- is called method overridding

        @Override
        public void start() {
            System.out.println("BMW -- start");
        }

        public void autoParking() {
            System.out.println("BMW -- auto parking");
        }

        public static void sunRoof() {
            System.out.println("Car - sunRoof");
        }

        // method overloading: Poly + morphism (Compile time)
        public void musicSystem() {
            System.out.println("BMW -- musicSystem");
        }

        public void musicSystem(String CD) {
            System.out.println("BMW -- musicSystem with " + CD);

        }

        public void musicSystem(String Radio, double radioFrequecny) {
            System.out.println("BMW -- musicSystem with " + Radio + " frq - >" + radioFrequecny);

        }
}
