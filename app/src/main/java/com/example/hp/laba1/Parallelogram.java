package com.example.hp.laba1;

public class Parallelogram extends Figure {
    private int a,b;
    private double h,S,P;

    Parallelogram(int a, int b, double h){
        this.a = a;
        this.b = b;
        this.h = h;
    }

    @Override
    double getPerimeter() {
        P = 2 * ( a + b);
        return P;
    }

    @Override
    double getArea() {
        S = a * h;
        return S;
    }
}
