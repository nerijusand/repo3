package com.company;

public class A {
    public void metodas1(){
        B b = new B();
      try {
          b.metodas2();
      }catch (ArithmeticException e){
          System.out.println("Pagauta klaida");
      }

    }
}
