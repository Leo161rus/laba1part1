package com.example.hp.laba1;

public class Romb extends Figure {
    private double a;
            private double h,P,S;

    Romb(double a, double h){
        this.a = a;
        this.h = h;
    }
    @Override
    double getPerimeter() {
        P = 4 * a;
        return P;
    }

    @Override
    double getArea() {
        S = a * h;
        return S;
    }
}
