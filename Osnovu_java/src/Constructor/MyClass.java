package Constructor;

class MyClass {
    int x;
    MyClass() {//Конструирование объектов разными способами
        System.out.println("Bнyтpи MyClass().");
        x = 0;
    }
    MyClass(int i) {
        System.out.println("Bнyтpи MyClass(int).");
        x = i;
    }
    MyClass(double d) {
        System.out.println("Bнyтpи MyClass(double).");
        x = (int) d;
    }
    MyClass(int i, int j) {
        System.out.println("Bнyтpи MyClass(int, int).");
        x = i * j;
    }}
