package Class;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        //Classname variable-name = new Classname();



        Car ferrari = new Car();
        Car nissan = new Car();

        nissan.brand = "nissan";
        nissan.price = 200;

        ferrari.brand = "ferrari";
        ferrari.price = 200;

        System.out.println(ferrari.price + " " + ferrari.brand);
        System.out.println(nissan.price + " " + nissan.brand);
    }
}
