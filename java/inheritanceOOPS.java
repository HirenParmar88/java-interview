//Inheritance in java

import java.util.*;
import bank;

//base class
class Shape{
    //String color;
    public void area(){
        System.out.println("display area");
    }
}

class Triangle extends Shape{
    public void area(int l,int h){
        System.out.println(1/2*l*h);
    }
}

class Circle extends Shape{
    public void area(int r){
        System.out.println((3.14)*r*r);
    }
}

public class inheritanceOOPS {
  public static void main(String[] args) {
    final bank.Account acc1=new bank.Account();
    acc1.name="cus1";
  } 
}
