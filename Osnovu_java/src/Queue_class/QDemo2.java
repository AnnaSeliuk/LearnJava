package Queue_class;

//Демонстрация использования класса Queue
class QDemo2 {
    public static void main(String args[]) {
        //Создать пустую очередь для хранения 10 элементов
        Queue ql = new Queue(10);
        char name[] = {'Т', 'о', 'm'};
        //Создать очередь на основе массива
        Queue q2 = new Queue(name);
        char ch;
        int i;
        //Поместить ряд символов в очередь ql
        for (i = 0; i < 10; i++) {
            ql.put((char) ('A' + i));
        }
        //Создать одну очередь на основе другой
        Queue q3 = new Queue(ql);
        //Показать содержимое очередей
        System.out.print("Coдepжимoe ql: ");
        for (i = 0; i < 10; i++) {
            ch = ql.get();
            System.out.print(ch);
        }
        System.out.println("\n");
        System.out.print("Coдepжимoe q2: ");
        for (i = 0; i < 3; i++) {
            ch = q2.get();
            System.out.print(ch);
        }
        System.out.println("\n");
        System.out.print("Coдepжимoe q3: ");
        for (i = 0; i < 10; i++) {
            ch = q3.get();
            System.out.print(ch);
        }}}
