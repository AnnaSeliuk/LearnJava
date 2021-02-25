package Vehicle;

public class TwoVehicles {
    public static void main(String args[]) {
        Vehicle minivan = new Vehicle(7, 16, 21);
        Vehicle sportscar = new Vehicle(2, 14, 12);

        int range1, range2;//расстояния
        //Присвоить значения полям объекта minivan 7
        minivan.passengers = 7;
        minivan.fuelcap = 16;
        minivan.mpg = 21;
        //Присвоить значения полям объекта sportscar
        sportscar.passengers = 2;
        sportscar.fuelcap = 14;
        sportscar.mpg = 12;
        //Рассчитать дальность поездки при полном баке
        range1 = minivan.fuelcap * minivan.mpg;
        range2 = sportscar.fuelcap * sportscar.mpg;
        System.out.println("Мини-фypгoн может перевезти " +
                        minivan.passengers + " пассажиров на расстояние " + range1 + " миль");
                System.out.println("Cпopтивный автомобиль может перевезти "
                                + sportscar.passengers + " пассажиров на расстояние " + range2 + " миль");
    }}

