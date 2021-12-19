package BaiTap;

import java.util.ArrayList;
// import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class RunMain {
    public static void main(String[] args) {
        List<Person> listPersons = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int sl;
        System.out.println("Enter Quantity: ");
        sl = sc.nextInt();
        try {
        {
            for(int i = 0 ; i < sl ;i++) {
                Person xPerson= new Person();
                xPerson.Input();
                listPersons.add(xPerson);
            }
        }
            sc.close();
        } catch (Exception e) {
            //TODO: handle exception
            System.out.println(e.getMessage());
        }
        Collections.sort(listPersons);
        System.out.println("Sorted by ID");
        for(Person x : listPersons) {
            System.out.println(x.toString());
        }
        Collections.sort(listPersons,new Comparator<Person>() {
            @Override
            public int compare(Person ps1, Person ps2) {
                return ps1.getName().compareTo(ps2.getName());
            }
        });
        System.out.println("Sorted by Name: ");
        for(Person ps : listPersons) {
            System.out.println(ps.toString());
        }
    }
}
