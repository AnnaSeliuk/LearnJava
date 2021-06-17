package AbstractClass;

class AbstractAreas {
    public static void main(String args[]) {
       //Figure figure = new Figure (10, 10); //теперь недопустимо
        Rectangle rectangle = new Rectangle(9, 5);
        Triangle triangle = new Triangle(10, 8);
        Figure figure; //верно, но объект не создается
        figure = rectangle;
        System.out.println("Плoщaдь равна " + figure.area());
        figure = triangle;
        System.out.println("Плoщaдь равна " + figure.area());
    }}

