package Box_extends;

class Box {
    private float width;
    private float height;
    private float depth;
    //сконструировать клон объекта
    Box(Box ob) {//передать объект конструктору
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }
    //конструктор, применяемый при указании всех размеров
    Box(float width, float height, float depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }
    //конструктор, применяемый при отсутствии размеров
    Box(){
        width = - 1;//значения - 1 служат для обозначения неинициализированного параллелепипеда
        height = - 1;
        depth = - 1;
    }
    // конструктор, применяем при создании куба
    Box(float len) {width = height = depth = len;}
    //рассчитать и возвратить объем
    float volume() {return width * height * depth;}
}
