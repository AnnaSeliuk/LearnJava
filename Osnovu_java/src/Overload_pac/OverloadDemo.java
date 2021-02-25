package Overload_pac;

class OverloadDemo {
    public static void main(String args[]) {
        Overload ob = new Overload();
        int resI;
        double resD;
        Overload2 obj = new Overload2();
        int i = 10;
        double d = 10.1;
        byte b = 99;
        short s = 10;
        float f = 11.5F;
        obj.f(i); //вызов метода ob.f(int)
        obj.f(d); //вызов метода ob.f(double)
        obj.f(b); //вызов метода ob.f(int) с преобразованием типов
        obj.f(s); //вызов метода ob.f(int) с преобразованием типов
        obj.f(f);//вызов метода ob.f(double) с преобразованием типов
        //Поочередно вызвать все версии метода sum()
        ob.sum();
        System.out.println();
        ob.sum(2);
        System.out.println();
        resI = ob.sum(4, 6);
        System.out.println("Результат вызова ob. sum(4, 6): " +
                resI);
        System.out.println();
        resD = ob.sum(1.1, 2.32);
        System.out.println("Результат вызова ob. sum(l.l, 2.32): "
                + resD);
    }}

