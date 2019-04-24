package com.example.hp.laba1;

import static java.lang.System.out;

public class Pryamougolnik extends Figure{
     private int a;
     private double b,P,S;


     Pryamougolnik(int a,double b){
         this.a = a;
         this.b = b;
     }

     Pryamougolnik(int a){
         this.a = a;
     }

    @Override
    double getPerimeter() {
         if(b == 0){
             P = 4 * a;
             return  P;
         }
            else {
             P = (a + b) * 2;
             return P;
         }

    }

    @Override
    double getArea() {
         if(b == 0){
             S = a * a;
             return S;
         }
       else{ S = a * b;
        return S;}
    }


}
