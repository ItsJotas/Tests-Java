package testingList;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TestListToString {

    public static void main(String[] args) {
        List<String> stringList1 = new ArrayList<>();

        stringList1.add("This is ");
        stringList1.add("just a ");
        stringList1.add("test!");

        String test1 = stringList1.toString();
        String test2 = stringList1.stream().collect(Collectors.joining(" "));

        System.out.println("stringList: " + stringList1);
        System.out.println("Using toString: " + test1);
        System.out.println("Using Collector.joining: " + test2);

        List<String> stringList2 = new ArrayList<>();
        stringList2.add("This is");
        stringList2.add("just a");
        stringList2.add("test!");

        String test3 = stringList2.toString();
        String test4 = stringList2.stream().collect(Collectors.joining(" "));

        System.out.println("\nWithout space: ");
        System.out.println("stringList: " + stringList2);
        System.out.println("Using toString: " + test3);
        System.out.println("Using Collector.joining: " + test4);
    }
}
