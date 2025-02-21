package org.example.advantage;

import java.util.ArrayList;
import java.util.Iterator;

public class BFullGenericsExample {

    public static void main (String[] args) {
        ArrayList<String> names = new ArrayList<String>();
        names.add("mohamed");
        names.add("zakaria");
        //names.add(23);  //  compile-time error

        String nameOne = names.get(0);  // time casting not required
        System.out.println("first name is list is :" + nameOne);


        Iterator<String> iterable = names.iterator();
        while (iterable.hasNext()) {
            System.out.println(iterable.next());
        }

    }
}
