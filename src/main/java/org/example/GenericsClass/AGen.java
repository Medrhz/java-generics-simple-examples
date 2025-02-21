package org.example.GenericsClass;


/*

  - A class that can refer to any type is known as generic class.
  - here we are using the T type parameter to create generics class of specific type
 */

// the T Type indicates that it can refer to any type
//! type Parameters
/*
   naming conventions are important to learn generics
     - The Common type parameters are as follows
       - T-Type
       - E-Element
       - k-key
       - N-Number
       - V-Value
*/


public class AGen<T> {

    T obj;

    void add (T obj) {
        this.obj = obj;
    }

    T getObj () {
        return this.obj;
    }
}
