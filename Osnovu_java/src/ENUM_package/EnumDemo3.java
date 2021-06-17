package ENUM_package;

enum Apple3 {
    Jonathan, GoldenDel, RedDel, Winesap, Cortland
}
public class EnumDemo3 {
    public static void main(String args[]) {
        Apple3 ap1, ap2, ap3;
        //получить все порядковые значения с помощью метода ordinal()
        System.out.println("Bce константы сортов яблок " + " и их порядковые значения: ");
        for (Apple3 apple : Apple3.values())
            System.out.println(apple + " " + apple.ordinal());
        ap1 = Apple3.RedDel;
        ap2 = Apple3.GoldenDel;
        ap3 = Apple3.RedDel;
        //применение методов compareTo() и equals()
        if (ap1.compareTo(ap2) < 0)
            System.out.println(ap1 + " предшествует " + ap2);
        if (ap1.compareTo(ap2) > 0)
            System.out.println(ap2 + " предшествует " + ap1);
        if (ap1.compareTo(ap3) == 0)
            System.out.println(ap1 + " равно " + ap3);
        System.out.println();
        if (ap1.equals(ap2))
            System.out.println("Oшибкa ! ");
        if (ap1.equals(ap3))
            System.out.println(ap1 + " равно " + ap3);
        if (ap1 == ap3)
            System.out.println(ap1 + " == " + ap3);
    }}

