package JavaSessions;

public class LoginPage {

    public static void main(String[] args) {

        LoginPage lp = new LoginPage();
        lp.login("admin", "admin123");
        lp.search("iPhone12", 80000);
        lp.doPayment(12121212, 111);


    }

    // Method Overloading: (Compile Time) OOP - Poly+Morphism
    // within the same class, when we have diff methods
    // with the same name and
    // different ip parameters
    // sequence of the params is also different

    public void login() {// 0
        System.out.println("login to app");
    }

    public void login(int a) {// 1

    }

    public void login(int a, int b) {// 2

    }

    public void login(int a, String b) {// 2

    }

    public void login(String a, int b) {// 2

    }

    public void login(String un, String pwd) {
        System.out.println("login with : " + un + " and " + pwd);
    }

    public void login(String un, String pwd, int otp) {

    }

    public void login(String un, String pwd, int otp, String role) {

    }

    public void login(String un, String pwd, long phone) {

    }

    //
    public void search() {

    }

    public void search(String name) {

    }

    public void search(String name, int price) {
        System.out.println("product name : " + name);
        System.out.println("price is: " + price);

    }

    public void search(String name, int price, String color) {

    }

    public void search(String sellerName, int price, boolean available) {

    }

    //
    public void doPayment(String UPI) {

    }

    public void doPayment(String UPI, long phone) {

    }

    public void doPayment(long CC, int cvv) {
        System.out.println("make the payment with " + CC + " and " + " CVV is " + cvv);
    }

    public void doPayment(long phone, String pwd) {

    }

    public void booking(String type) {

    }

}
