package VariableArgs;

class VarArgs3 {
    static void varTest(int... v) {//Первая версия метода varTest()
        System.out.println("varTest(int...): " + "Количество аргументов: " + v.length);
        System.out.println("Coдepжимoe: ");
        for (int i = 0; i < v.length; i++)
            System.out.println(" arg " + i + ": " + v[i]);
        System.out.println();
    }
 static void varTest(boolean... v) {//Вторая версия метода varTest()
        System.out.println("varTest(boolean...): " + "Количество аргументов: " + v.length);
        System.out.println("Coдepжимoe: ");
        for (int i = 0; i < v.length; i++)
            System.out.println(" arg " + i + ": " + v[i]);
        System.out.println();
    }
    static void varTest(String msg, int... v){//Третья версия метода varTest()
        System.out.println("varTest(String, int...): " + msg +
                v.length);
        System.out.println("Coдepжимoe: ");
        for (int i = 0; i < v.length; i++)
            System.out.println(" arg " + i + ": " + v[i]);
        System.out.println();
    }
    public static void main(String args[]) {
        varTest(1, 2, 3);
        varTest("Тестирование: ", 10, 20);
        varTest(true, false, false);
    }}

