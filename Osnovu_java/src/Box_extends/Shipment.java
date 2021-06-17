package Box_extends;

class Shipment extends BoxWeight_1 {//Shipment (партия груза)
    float cost;// добавить поле стоимости доставки
    // сконструировать клон объекта
    Shipment(Shipment ob) {//передать объект конструктору
        super(ob);
        this.cost = ob.cost;
    }
    // конструктор, используемый при указании всех параметров
    Shipment(float width, float height, float depth, float weight,
             float cost) {
        super(width, height, depth, weight); //вызвать конструктор суперкласса
        this.cost = cost;
    }
    // конструктор, применяемый по умолчанию
    Shipment() {
        super();
        cost = - 1;
    }
    // конструктор, применяемый при создании куба
    Shipment(float len, float weight, float cost) {
        super(len, weight);
        cost = cost;
    }
}
