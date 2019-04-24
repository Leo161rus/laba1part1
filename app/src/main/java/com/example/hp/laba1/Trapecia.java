package com.example.hp.laba1;

public class Trapecia extends Figure {
    private int a,b,c;
    private double d,h,S,P;

    Trapecia(int a, int b, int c, double d, double h){
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.h = h;
    }
    @Override
    double getPerimeter() {
        P = a + b + c + d;
        return P;
    }

    @Override
    double getArea() {
        S = 0.5 * (a + b)* h;
        return S;
    }
}
