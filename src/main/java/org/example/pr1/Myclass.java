package org.example.pr1;

public class Myclass implements MyInterface, MyInterface2{

    public String main1;
    protected String main2;
    String main3;
    private String main4;
    @Override
    public void print(){
        System.out.println("main1: "+main1);
        System.out.println("main2: "+main2);
        System.out.println("main3: "+main3);
        System.out.println("main4: "+main4);
    }
}
