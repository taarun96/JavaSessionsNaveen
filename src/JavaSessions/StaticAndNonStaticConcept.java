package JavaSessions;

public class StaticAndNonStaticConcept {
    String name;
    static int age;

    public void getName() {
        System.out.println("get name");
    }

    public static void getInfo() {
        System.out.println("get Info");
    }

    public static void main(String[] args) {

        // how to access non static vars and methods:
        // we have to create the Object of the class:

        StaticAndNonStaticConcept obj = new StaticAndNonStaticConcept();
        obj.name = "tom";
        System.out.println(obj.name);

        obj.getName();

        // how to call static vars and methods:
        // 1. you can call them directly: No need to use the object.
        age = 25;
        System.out.println(age);

        getInfo();

        // 2. you can call them using class Name:
        StaticAndNonStaticConcept.age = 50;
        System.out.println(age);
        StaticAndNonStaticConcept.getInfo();

        //3. Can I use Object to call static vars and methods?
        obj.age = 40;
        obj.getInfo();

    }
}
