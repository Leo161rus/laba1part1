package com.example.hp.laba1;

public class Kvadrat extends Figure{
    private double P,S;
    private int a;

    Kvadrat(int a){
        this.a = a;
    }

    @Override
    double getPerimeter() {
        P = 4 * a;
        return P;
    }

    @Override
    double getArea() {
        S = a * a;
        return S;
    }
}
