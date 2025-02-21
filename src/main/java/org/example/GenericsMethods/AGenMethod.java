package org.example.GenericsMethods;

public class AGenMethod {


    // we can create a generic method that can accept any type of arguments.
    public static <E> void printElements (E[] elements) {
        for (E element : elements) {
            System.out.println(element);
        }
        System.out.println();
    }

    public static void main (String[] args) {
        Integer[] integers = {1, 2, 3, 4, 5};
        Character[] charArray = {'M', 'O', 'H', 'A', 'M', 'E', 'D'};
        System.out.println("array of integer");
        printElements(integers);
        System.out.println("array of chars");
        printElements(charArray);
    }
}
