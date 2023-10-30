package Static;

public class StaticUse {
    static int no = 1;
    static int no1 ;

    static void print(int no2){
        System.out.println("No2 ="+no2);
        System.out.println("No1 ="+no1);
        System.out.println("No ="+no);

    }
    //this will be executed only once , when the class loads
    static {
        System.out.println("running......");
        no1 = 1+no;
    }

    public static void main(String args[]){
        print(23);
    }

}
