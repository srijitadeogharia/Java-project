import java.util.*;
class Fibonacii{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter count:");
        int count=sc.nextInt();
        int n1=0;
        int n2=1;
        for (int i=2;i<=count;++i){
            int n3=n1+n2;
            System.out.println(""+n3);
            n1=n2;
            n2=n3;
        }
        sc.close();
    }
}