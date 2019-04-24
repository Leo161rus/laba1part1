package com.example.hp.laba1;

import java.util.ArrayList;


import static java.lang.System.out;

public class Result {
    public static void main(String[] args){
        Figure krug_1 = new Okrugnost(12);
        Pryamougolnik pryamougolnik_1 = new Pryamougolnik(4,5.4);
        Pryamougolnik kvadrat_1 = new Pryamougolnik(3);
        Treugolnik treugolnik_1 = new Treugolnik(4,5,6, 5.6);
        Parallelogram parallelogram_1 = new Parallelogram(2,3,6.8);
        Romb romb_1 = new Romb(6,2.4);
        Trapecia trapecia_1 = new Trapecia(2,3,4,5.4,6.2);

        ArrayList<Figure> figures = new ArrayList<>();
        figures.add(krug_1);
        figures.add(pryamougolnik_1);
        figures.add(kvadrat_1);
        figures.add(treugolnik_1);
        figures.add(parallelogram_1);
        figures.add(romb_1);
        figures.add(trapecia_1);



        out.println("Периметр окружности равна: " + krug_1.getPerimeter());
        out.println("Площадь окружности равна: "+ krug_1.getArea());

        out.println("Периметр прямоугольника: " + pryamougolnik_1.getPerimeter());
        out.println("Площадь прямоугольника: " + pryamougolnik_1.getArea());

        out.println("Периметр квадрата: " + kvadrat_1.getPerimeter());
        out.println("Площадь квадрата: " + kvadrat_1.getArea());

        out.println("Периметр треугольника: " + treugolnik_1.getPerimeter());
        out.println("Площадь треугольника: " + treugolnik_1.getArea());

        out.println("Периметр параллелограма: " + parallelogram_1.getPerimeter());
        out.println("Площадь параллелограма: " + parallelogram_1.getArea());

        out.println("Периметр ромба: " + romb_1.getPerimeter());
        out.println("Площадь ромба: " + romb_1.getArea());

        out.println("Периметр трапеции: " + trapecia_1.getPerimeter());
        out.println("Площадь трапеции: " + trapecia_1.getArea());

        for (Figure allAreas: figures){
            out.println(allAreas.getArea() + " ");
        }



        Triple<String,Integer,Boolean> triple = new Triple<>("Евгений",25, null);
        String name = triple.getStudentName();
        out.println(name);
        Integer age = triple.getAge();
        out.println(age);
        Boolean access = triple.getAccess();
        out.println(triple.toString());


    }
}
