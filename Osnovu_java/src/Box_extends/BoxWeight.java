package Box_extends;

class BoxWeight extends Box {
    float weight; //вес параллелепипеда
    //сконструировать клон объекта
    BoxWeight(BoxWeight ob) {
        super(ob); //передать объект конструктору суперкласса
        this.weight = ob.weight;
    }
    //конструктор, применяемый при указании всех параметров
    BoxWeight(float width,float height, float depth, float weight){
        super(width, height, depth); //вызвать конструктор суперкласса
        this.weight = weight;
    }
    //конструктор, применяемый по умолчанию
    BoxWeight() {
        super(); //вызвать конструктор суперкласса
        weight = -1;
    }
    // конструктор, применяемый при создании куба
    BoxWeight(float len, float wieght) {
        super(len); //вызвать конструктор суперкласса
        this.weight = weight;
    }}

