package org.example.advantage;

import java.util.ArrayList;
import java.util.List;

public class AGenericsAdvantage {
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
        List<Integer> integerList = new ArrayList<>();
        integerList.add(10);
        //integerList.add("10");  // compile-time error


           /*
           2 - type casting not required :
               - there is no need to typecast the object
         */
        // before generics we need to type cast.
        List list2 = new ArrayList();
        list.add("name one");
        list.add("name two");
        String name = (String) list2.get(0);

        // after generics, we don't need to type cast
        List<String> stringList = new ArrayList();
        stringList.add("name one");
        stringList.add("name two");
        String nameGenerics = stringList.get(0);

           /*
           3 - compile-time checking:
               - checked at compile time so the problem will not occur at runtime
               - good strategy says "it is far better to handel the problem at compile time then runtime"
         */
        List<String> stringList1 = new ArrayList<String>();
        stringList1.add("hello");
        //stringList1.add(32);  //Compile Time Error


    }
}
