package TypeOfClass.SingleTon;

public class Main {

    public static void main(String[] args) {
        Singleton obj = Singleton.getInstance();
        obj.someMessage();

        Singleton obj2 = Singleton.getInstance();

        if(obj == obj2){
            System.out.println("same");
        }else{
            System.out.println("!same");
        }


    }
}
