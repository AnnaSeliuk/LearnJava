package VariableArgs;

class VarArgs {
    //Метод varTest() допускает переменное число аргументов
    static void varTest1(int... v) {
        System.out.println("Koличecтвo аргументов: " + v.length);
        System.out.println("Coдepжимoe: ");
        for (int i = 0; i < v.length; i++) {
            System.out.println(" arg " + i + ": " + v[i]);
        }
        System.out.println();
    }
    public static void main(String args[]) {
//Метод varTest() может вызываться с переменным числом аргументов
        varTest1(10);
        varTest1(1, 2, 3);
        varTest1();
    }}

