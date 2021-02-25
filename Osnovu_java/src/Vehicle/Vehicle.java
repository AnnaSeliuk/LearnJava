package Vehicle;

public class Vehicle {
    int passengers; //количество пассажиров
    int fuelcap; //емкость топливного бака
    int mpg; //потребление топлива в милях на галлон
    Vehicle(int р, int f, int m) {//Конструкор класса VehConsDemo
        passengers = р;
        fuelcap = f;
        mpg = m;
    }


    //рассчитать и отобразить дальность поездки
    void range() {
        System.out.println("Дaльнocть поездки транспортного средства " + fuelcap * mpg + " миль.");
                //Обратите внимание на указание переменных fuelcap и mpg без использования точечной нотации
    }
    int range_1() {
        return mpg*fuelcap;//Возврат дальности поездки
    }
    //Рассчитать объем топлива, для преодоления заданного расстояния
    double fuelNeeded(int miles) {
        return (double) miles / mpg;
    }

}
