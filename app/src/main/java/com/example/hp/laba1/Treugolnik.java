package com.example.hp.laba1;

public class Treugolnik extends Figure{
    private int a,b,c;
            private double h,P,S;

    Treugolnik(int a, int b, int c, double h ){
        this.a = a;
        this.b = b;
        this.c = c;
        this.h = h;
    }

    @Override
    double getPerimeter() {
        P = a + b + c;
        return P;
    }

    @Override
    double getArea() {
        S = 0.5 * a * h;
        return S;
    }
}
