package OverridingMetod;

class Rectangle extends Figure {
    Rectangle(float a, float b) {super(a, b);}
    // переопределить метод area() для четырехугольника
    float area() {
        System.out.println("Работа с четырехугольником");
        return dim1 * dim2;
    }}

