package org.example.advantage;

import java.util.ArrayList;
import java.util.List;

public class GenericsAdvantage {
    public static void main (String[] args) {


        /*
           1 - type safety :
               - we can hold a single type of objects in generics
               - it does not allow to store other type of objects
         */

        // without generics
        List list = new ArrayList();
        list.add(10);
        list.add("10");
        list.add(false);
        // with generics

    }
}
