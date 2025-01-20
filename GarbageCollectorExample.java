public class GarbageCollectorExample {
    public static void main(String[] args) {
        int number=Integer.parseInt(args[0]);
        int reverse=0;
        int temp;
        temp=number;
        while(number!=0){
            int remainder=number%10;
            reverse=(reverse*10)+remainder;
            number=number/10;
        }
        if(temp==reverse){
            System.out.println("The number is a palindorm");
        }
        else{
            System.out.println("The number is not a palindorm");
        }
        new GarbageCollectorExample();
        System.gc();
        System.out.println("garbage collector required");
    }
}
