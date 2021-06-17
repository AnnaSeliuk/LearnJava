package ENUM_package;

import java.math.BigDecimal;
enum Apple2 {
    Jonathan(BigDecimal.valueOf(10.5)),
    GoldenDel(BigDecimal.valueOf(9.5)), RedDel(BigDecimal.valueOf(5)),
    Winesap(BigDecimal.valueOf(15)), Cortland(BigDecimal.valueOf(8.5));
    private BigDecimal price;// цена яблока каждого сорта
    // Конструктор
    Apple2(BigDecimal рrice) {this.price = рrice;}
    BigDecimal getPrice() {return price;}
}
class EnumDemo2 {
    public static void main(String args[]) {
        // вывести цену яблок сорта Winesap
        System.out.println("Яблoкo сорта Winesap стоит " +
                Apple2.Winesap.getPrice()+ " рублей.");
        // вывести цены всех сортов яблок
        System.out.println("Цeны на все сорта яблок:");
        for (Apple2 apple : Apple2.values()) {
            System.out.println("Килограмм яблок сорта \""+apple + "\" стоит " + apple.getPrice() + " рублей.");
        }}}

