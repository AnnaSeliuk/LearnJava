package MetodFinalize;

public class Power {
    double b;
    int e;
    double val;
    Power(double base, int exp) {
        b = base;
        e = exp;
        val = 1;
        if (exp == 0) {
            return;
        }
        for (; exp > 0; exp--) {
            val *= base;
        }}
    double getPower() {
        return val;
    }}

class DemoPwr {
    public static void main(String args[]) {
        Power x = new Power(4.0, 2);
        Power y = new Power(2.5, 1);
        Power z = new Power(5.7, 0);
        System.out.println(x.b + " в степени " + x.e + " равно " +
                x.getPower());
        System.out.println(y.b + " в степени " + y.e + " равно " +
                y.getPower());
        System.out.println(z.b + " в степени " + z.e + " равно " +
                z.getPower());
    }}

