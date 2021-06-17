package OverridingMetod;

class FindAreas {
    public static void main(String args[]) {
        Figure figure = new Figure(10, 10);
        Rectangle rectangle = new Rectangle(9, 5);
        Triangle triangle = new Triangle(10, 8);
        System.out.println("Плoщaдь равна " + figure.area());
        figure = rectangle;
        System.out.println("Плoщaдь равна " + figure.area());
        figure = triangle;
        System.out.println("Плoщaдь равна " + figure.area());
    }}
