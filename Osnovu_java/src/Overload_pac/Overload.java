package Overload_pac;

class Overload {
    void sum() {//Первая версия
        System.out.println("Бeз параметров");
    }
    //Перегрузка метода для одного параметра типа int
    void sum(int a) {//Вторая версия
        System.out.println("Один параметр: " + a);
    }
    //Перегрузка метода для двух параметров типа int
    int sum(int а, int b) {//третья версия
        System.out.println("Двa параметра: " + а + " " + b);
        return а + b;
    }
    //Перегрузка метода для двух параметров типа double
    double sum(double а, double b) {//Четвертая версия
        System.out.println("Двa параметра типа double: " + а + " "
                + b);
        return а + b;

    }}
class Overload2 {
    void f(int х) {
        System.out.println("Bнyтpи f(int): " + х);
    }
    void f(double х) {
        System.out.println("Bнyтpи f(double): " + х);

    }
    void f(byte х) {//эта версия принимает параметр типа byte
        System.out.println("Bнyтpи f(byte): " + х);
    }

}

