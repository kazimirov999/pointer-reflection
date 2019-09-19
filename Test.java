package com.reflection;

public class Test extends Lab{
    private String title;
    private int id;
    private double result;

    Test(String title, int id, double result) {
        this.title = title;
        this.id = id;
        this.result = result;
    }

    private void runTest(){
        conductTest();
    }

    public String getTitle() {
        return title;
    }

    public double getResult() {
        return result;
    }

    static void giveResult(){}

    protected int giveId(){
        return id;
    }

}
