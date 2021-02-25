package MetodFinalize;

public class FDemo {
    int х;
    FDemo(int i) {
        х = i;
    }
    //Вызывается при удалении объекта
    @Override
    protected void finalize() {
        System.out.println("Финaлизaция " + х);
    }
    //Создает объект, который тотчас выходит из области видимости
    void generator(int i) {
        FDemo o = new FDemo(i);
    }}

