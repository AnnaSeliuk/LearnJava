package Box_extends;

    class BoxWeight_1 extends Box {
        float weight; //вес параллелепипеда
        // сконструировать клон объекта
        BoxWeight_1(BoxWeight_1 ob) {// передать объект конструктору
            super(ob);
            weight = ob.weight;
        }
        // конструктор, применяемый при указании всех параметров
        BoxWeight_1(float width,float height, float depth, float weight){
            super(width, height, depth);//вызвать конструктор суперкласса
            this.weight = weight;
        }
        // конструктор, применяемый по умолчанию
        BoxWeight_1() {
            super();
            weight = - 1;
        }
        // конструктор, применяемый при создании куба
        BoxWeight_1(float len, float weight) {
            super(len);
            weight = weight;
        }}

