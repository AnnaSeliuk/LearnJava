package Tipclass;

    class FailSoftArray {
        private int arr[];//ссылка на массив
        private int errVal;//значение, возвращаемое в случае возникновения ошибки при выполнении метода get()
        public int length; //открытая переменная
        /*Конструктору класса передается размер массива и значение, которое
        должен возвращать метод get() при возникновении ошибки.*/
        public FailSoftArray(int size, int errVal) {
            arr= new int[size];
            this.errVal = errVal;
            length = size;
        }
        //Возвратить значение элемента массива с заданным индексом
        public int get(int index) {
            if(indexOK(index)){//Отслеживание попытки выхода за границы массива
                return arr[index];
            }
            return errVal;
        }
        //Установить значение элемента с заданным индексом.
        //Если возникнет ошибка, возвратить логическое значение false.
        public boolean put(int index, int val) {
            if (indexOK(index)) {
                arr[index] = val;
                return true;
            }
            return false;
        }
        //Вернуть логическое значение true, если индекс не выходит за границы массива
        private boolean indexOK(int index) {
            if (index >= 0 & index < length) {
                return true;
            }
            return false;
        }}
    //Демонстрация работы с "отказоустойчивы" массивом
    class FSDemo {

        public static void main(String args[]) {
            FailSoftArray fs = new FailSoftArray(5, -1);
            int x;
            //Демонстрация корректной обработки ошибок
            System.out.println("Заполнение массива без вывода отчета.");
            for (int i = 0; i < (fs.length * 2); i++) {
                fs.put(i, i*10);//для обращения к элементам массива должны использоваться методы доступа
            }
            System.out.println("Вывод элементов массива без вывода отчета.");
            for (int i = 0; i < (fs.length * 2); i++) {
                x = fs.get(i);
                if (x != -1) System.out.print(x + " ");
            }
            System.out.println("");
            System.out.println("Заполнение массива с выводом отчета.");
            for (int i = 0; i < (fs.length * 2); i++) {
                if (!fs.put(i, i * 10)) {
                    System.out.println("Индeкc " + i +" вне допустимого диапазона");
                }
            }
            System.out.println("Вывод элементов массива с выводом отчета.");
            for (int i = 0; i < (fs.length * 2); i++) {
                x = fs.get(i);
                if (x != -1) {
                    System.out.print(x + " ");
                } else {
                    System.out.println("Индeкc " + i + " вне допустимого диапазона");
                }
            }}}


