package TypeOfClass.SingleTon;

public class Singleton {
    private static Singleton instance;

    private Singleton(){
        System.out.println("created....");
    }

    public static Singleton getInstance (){
        if(instance == null){
            instance = new Singleton();

        }
        return instance;
    }

    public void someMessage(){
        System.out.println("called......");
    }


}
