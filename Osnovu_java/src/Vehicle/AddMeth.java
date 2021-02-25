package Vehicle;

public class AddMeth {
    public static void main(String args[]) {
        Vehicle minivan = new Vehicle(6, 15, 22);
        Vehicle sportscar = new Vehicle(3, 13, 15);

        //добавим параиетры для рассчета количества топлива
        double gallons;
        int dist = 252;
        //Присвоить значения полям в объекте minivan
        int range1, range2;
        /*minivan.passengers = 7;
        minivan.fuelcap = 16;
        minivan.mpg = 21;
        //Присвоить значения полям в объекте sportscar
        sportscar.passengers = 2;
        sportscar.fuelcap = 14;
        sportscar.mpg = 12; */
        range1 = minivan.range_1();
        range2 = sportscar.range_1();
        System.out.print("Мини-фypгoн может перевезти " +
                minivan.passengers + " пассажиров. ");
        minivan.range();
        //отобразить дальность поездки мини-фургона
        System.out.print("Cпopтивный автомобиль может перевезти " +
                sportscar.passengers + " пассажров. ");
        sportscar.range();
        //отобразить дальность поездки спортивного автомобиля
        System.out.println();
        System.out.println("Мини-фypгoн может перевезти " +
                minivan.passengers + " на расстояние " + range1 + " миль");
        System.out.println("Cпopтивный автомобиль может перевезти "
                + sportscar.passengers + " на расстояние " + range2 + " миль");
        //сравнение расстояния
        if( minivan.range_1() > sportscar.range_1())
        System.out.println("дальность v1 больше, чем v2");
        // использование орератора ?
         int v=minivan.range_1() > sportscar.range_1() ? minivan.range_1() : sportscar.range_1();
            System.out.println(v);

    //параметризованный метод(расчет топлива)
        gallons = minivan.fuelNeeded(dist);
        System.out.println("Для преодоления " + dist + " миль минифургону требуется "
                + gallons + " галлонов топлива");
        gallons = sportscar.fuelNeeded(dist);
        System.out.println("Для преодоления " + dist + " миль спортивному автомобилю требуется "
                + gallons + " галлонов топлива");
    }
}
