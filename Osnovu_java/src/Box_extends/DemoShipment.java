package Box_extends;

class DemoShipment {
    public static void main(String args[]) {
        Shipment shipment1 = new Shipment(10, 20, 15, 10, 3.41f);
        Shipment shipment2 = new Shipment(2, 3, 4, 0.76f, 1.28f);
        System.out.println("Объем shipment1 равен "+ shipment1.volume());
        System.out.println("Bec shipment1 равен "+shipment1.weight);
        System.out.println("Cтoимocть доставки: $ "+shipment1.cost);
        System.out.println();
        System.out.println("Объем shipment2 равен "+ shipment2.volume());
        System.out.println("Bec shipment2 равен "+shipment2.weight);
        System.out.println("Cтoимocть доставки: $ "+shipment2.cost);
    }}

