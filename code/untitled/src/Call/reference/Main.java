package Call.reference;

import Call.reference.Car;

public class Main {

    public static void change(Car oldCar){
        oldCar.setCarName("lambo");
    }
    public static void main(String[] args) {

     Car newCar = new Car("Ferrari");
     System.out.println(newCar.getCarName());

     change(newCar);
     System.out.println(newCar.getCarName());
    }
}
