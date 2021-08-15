package JavaSessions;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListMethods {
    public static void main(String[] args) {
        ArrayList<String> arr=new ArrayList<String>();
        arr.add("A");
        arr.add("B");
        arr.add("C");

        System.out.println(arr);
        System.out.println(arr.size());
//        arr.clear();
//        System.out.println(arr);
//        System.out.println(arr.size());

        ArrayList<String> arr2=(ArrayList<String>) arr.clone();
        System.out.println(arr2);

        System.out.println(arr2.contains("C"));

        //for each:jdk 1.8 with lambda:
        arr2.forEach(name -> System.out.println(name));
        arr2.forEach(e -> System.out.println(e.toLowerCase()));

        ArrayList<String> EmpList = new ArrayList<String>();

        EmpList.add("Tom");
        EmpList.add("Peter");
        EmpList.add("Naveen");
        EmpList.add("Daisy");

        System.out.println(EmpList);

        Collections.sort(EmpList);

        System.out.println(EmpList);

        Collections.sort(EmpList, Collections.reverseOrder());
        System.out.println(EmpList);


        ArrayList test = new ArrayList();

        test.add("Pooja is coming");
        test.add("Pooja");


        System.out.println(test);
        System.out.println(test.contains("Pooja"));




    }
}
