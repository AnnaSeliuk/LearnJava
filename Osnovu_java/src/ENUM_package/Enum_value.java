package ENUM_package;

enum Apple1 {Jonathan, GoldenDel, RedDel, Winesap, Cortland}
class EnuDemo1 {
    public static void main(String args[]) {
        Apple1 ар;
        System.out.println("Koнcтaнты перечисляемого типа Apple: ");
        // применить метод values() для получения списка констант
        Apple1 allApples[] = Apple1.values();
        for (Apple1 a : allApples) System.out.println(a);
        // применить метод valueOf()
        ар = Apple1.valueOf("Winesap");
        System.out.println("Пepeмeннaя ар содержит " + ар);
    }}
