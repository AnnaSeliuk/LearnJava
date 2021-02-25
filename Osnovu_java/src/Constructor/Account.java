package Constructor;

class Account {
        int ID;
        Account(int ID) {//Конструкор класса Account
            this.ID = ID;
        }}
    class ConsDemo {
        public static void main(String args[]) {
            Account creditAccount = new Account(10001);
            Account depositAccount = new Account(80001);
            System.out.println("ID кредитного счета:"+creditAccount.ID);
            System.out.println("ID депозитного счета:" + +
                    depositAccount.ID);
        }}


