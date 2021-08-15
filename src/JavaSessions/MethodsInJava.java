package JavaSessions;

public class MethodsInJava {
    //can not create a method inside a method

    public static void main(String[] args) {

        //create the object:
        MethodsInJava obj = new MethodsInJava();

        obj.test();
        int p = obj.getMarks();
        System.out.println(p+100);

        String val = obj.getName();
        System.out.println(val);

        int s1 = obj.sum(10, 20);
        System.out.println(s1);

        System.out.println(obj.sum(40, 50));


    }


    //1. no input and no return
    //void -- does not return any value
    //return type: void
    public void test() {
        System.out.println("test method");
    }

    //2. no input but some return
    //return type: int
    public int getMarks() {
        System.out.println("get marks");
        int total = 100;
        int bonus = 50;
        int totalMarks = total + bonus;//150

        return totalMarks;
    }

    public String getName() {
        System.out.println("get name method");
        String s = "Naveen";
        return s;
    }

    //3. some input and some return:

    public int sum(int a, int b) {
        System.out.println("sum method");
        int z = a+b;
        return z;
    }


}
