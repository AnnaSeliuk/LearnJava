package Constructor;

class SumDemo {
    public static void main(String args[]) {
        Summation s1 = new Summation(5);
        Summation s2 = new Summation(s1);
        System.out.println("sl.sum: " + s1.sum);
        System.out.println("s2.sum: " + s2.sum);

    }}

