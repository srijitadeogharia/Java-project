public class Swap {
    public static void main(String args[]){
        int a=10;
        int b=20;
        //a is 10 and b is 20
        System.out.println("a is " +a+ " and b i " +b);
        a=a+b;
        b=a-b;
        a=a-b;
        //After swapping a is 20 and b is 10
        System.out.println("After swapping, a is " +a+ " and b is " +b);
    }
}
