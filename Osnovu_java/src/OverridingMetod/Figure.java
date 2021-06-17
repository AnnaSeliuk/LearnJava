package OverridingMetod;

class Figure {
    float dim1, dim2;
    Figure(float dim1, float dim2) {
        this.dim1 = dim1;
        this.dim2 = dim2;
    }
    float area() {
        System.out.println("Плoщaдь фигуры не определена. ");
        return 0;
    }}

