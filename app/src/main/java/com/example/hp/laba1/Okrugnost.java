package com.example.hp.laba1;

import static java.lang.Math.PI;

public class Okrugnost extends Figure {
    private int radius ;
    private double S,P ;

    Okrugnost(int radius){
        this.radius = radius;
    }


    @Override
    double getPerimeter() {
        P = 2*PI*radius;
        return P;
    }

    @Override
    double getArea() {
        S = PI*(radius*radius);
        return S;
    }
}
