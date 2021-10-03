package org.example.pr1;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");
        Myclass myclass = new Myclass();
        myclass.main1 = "tekst1";
        myclass.main2 = "tekst2";
        myclass.main3 = "tekst3";

        myclass.print();
    }
}
