package ENUM_package;

enum Apple {Jonathan, GoldenDel, RedDel, Winesap, Cortland}
class EnumDemo {
    public static void main(String args[]) {
        Apple ap;
        ap = Apple.RedDel;
        // вывести значение переменной перечислимого типа
        System.out.println("Знaчeниe ар: " + ap+"\n");
        ap = Apple.GoldenDel;
        // сравнить два значения перечислимого типа
        if (ap == Apple.GoldenDel)
            System.out.println("Пepeмeннaя ар содержит значение  GoldenDel.\n");
                    // применить перечисление для управления оператором switch
        switch (ap) {
            case Jonathan:
                System.out.println("Copт Jonathan красный.");
                break;
            case GoldenDel:
                System.out.println("Copт Golden Delicious  желтый.");
                break;
            case RedDel:
                System.out.println("Copт Red Delicious красный.");
                break;
            case Winesap:
                System.out.println("Copт Winesap красный.");
                break;
            case Cortland:
                System.out.println("Copт Cortland красный.");
                break;
            default:
                throw new AssertionError(ap.name());
        }}}
