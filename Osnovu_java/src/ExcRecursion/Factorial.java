package ExcRecursion;

class Factorial {
    //Рекурсивный метод
    int factR(int n) {
        int result;
        if (n == 1) {
            return 1;
        }
        result = factR(n - 1) * n; //Рекурсивный вызов метода factR
        return result;
    }
    //Вариант программ, вычисляющий факториал итеративны способом
    int factI(int n) {
        int t, result;
        result = 1;
        for (t = 1; t <= n; t++) {
            result *= t;
        }
        return result;
    }}

