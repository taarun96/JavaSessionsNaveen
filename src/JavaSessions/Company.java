package JavaSessions;

import java.util.ArrayList;

public class Company {

    String name;
    int empCount;

    public String getCEOName() {
        return "Tom";
    }

    public int getTotalCount() {
        System.out.println("get total count of the shares");
        int totalShare = 2000;

        return totalShare;
    }

    public String[] getCoFounders() {

        System.out.println("get cofounders");

        String founder[] = new String[3];
        founder[0] = "Tom";
        founder[1] = "Peter";
        founder[2] = "Steve";

        return founder;

    }

    public ArrayList<String> getCustomersList() {
        System.out.println("get customer list");

        ArrayList<String> custList = new ArrayList<String>();
        custList.add("Nestle");
        custList.add("Pepsi");
        custList.add("Deo");

        return custList;

    }

    public static void main(String[] args) {

        Company comp = new Company();
        System.out.println(comp.getCEOName());

        int shares = comp.getTotalCount();
        System.out.println(shares);

        String founderArr[] = comp.getCoFounders();
        System.out.println(founderArr.length);
        for (String e : founderArr) {
            System.out.println(e);
        }

        ArrayList<String> ar = comp.getCustomersList();
        System.out.println("total number of customers: " + ar.size());
        for(String e: ar) {
            System.out.println(e);
        }

    }
}
