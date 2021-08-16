package JavaSessions;

public class MainMethodOverLoading {

    public static void main(String a[]) {
        System.out.println("Hello World");
        System.out.println(a.length);//0
        //System.out.println(a[0]);

        main(10);
        main(10,20);
        main(10, "testing");

    }

    public static void main(int a) {
        System.out.println(a);

    }

    public static void main(int a, int b) {
        System.out.println(a + b);

    }

    public static void main(int a, String c) {
        System.out.println(a + c);

    }
}
