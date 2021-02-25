package MetodFinalize;

public class Finalize {
    public static void main(String args[]) {
        int count;
        FDemo ob = new FDemo(0);
/*Генерируется большое количество объектов. В какой-то момент
времени должна начаться сборка мусора. Возможно, для того чтобы
активизировать систему сборки мусора, количество генерируемх
объектов придется увеличить*/
        for (count = 1; count < 1000000; count++) {
            ob.generator(count);
        }
    }}

