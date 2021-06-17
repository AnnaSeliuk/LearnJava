package AbstractClass;

class Triangle extends Figure {
    Triangle(float а, float b) {super(а, b);}
    // переопределить метод area() для треугольника
    float area() {
        System.out.println("Работа с треугольником");
        return dim1 * dim2 / 2;
    }}

