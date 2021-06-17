package Box_extends;

 class Vehicle_1 {
        int maxSpeed = 120;
    }
    /* sub class Car extending vehicle */
    class Car extends Vehicle_1{
        int maxSpeed = 360;
        void display(){
            // print maxSpeed of derived and base class (vehicle)
            System.out.println("Maximum speed of Car: " + maxSpeed);
            System.out.println("Maximum speed of Vehicle: " +
                    super.maxSpeed);
        }
    }
    /* Driver program to test */
    class Test{
        public static void main(String[] args) {
            Car myCar = new Car();
            myCar.display();
        }}


