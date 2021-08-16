package JavaSessions;

public class Persons {
    public static void main(String[] args) {
    Persons p1 = new Persons();
		p1.getName();
}

    public void getName() {

        getFirstName();
        getPhone();
    }

    public void getFirstName() {
        getCity();
        getAddress();
    }

    public void getCity() {
        System.out.println("Bangalore");

    }

    public void getAddress() {
        getCity();
        System.out.println("Bangalore 56000011");
    }

    public void getPhone() {
        System.out.println("99999");
    }
}
