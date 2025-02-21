package org.example.GenericsClass;

public class AGenTest {
    public static void main (String[] args) {
        AGen<Integer> m = new AGen<>();
        //m.add("mohamed"); // compile-time error
        m.add(12);
        System.out.println(m.getObj());

        AGen<String> s = new AGen<>();
        s.add("mohamed");
        System.out.println(s.getObj());
    }
}
