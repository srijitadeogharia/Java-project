import java.util.*;
class AbsoluteValue{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:");
        int n=sc.nextInt();
        if(n<0){
            n=n*(-1);
            System.out.print("the absolute value is:"+n);
        }
        else{
            System.out.print("the absolute value is:"+n);
        }
        sc.close();
    }
}
