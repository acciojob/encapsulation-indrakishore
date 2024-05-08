package com.driver;

public class Main {

    public static void main(String[] args) {
        RWOnly rwOnlyObj = new RWOnly();
//        System.out.println(rwOnlyObj.variableName = "Accio"); //variableName has private access in com.driver.RWOnly
        rwOnlyObj.setName("Accio");
        System.out.println(rwOnlyObj.getName());
    }
  
}