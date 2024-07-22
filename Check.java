import java.util.*;
class Check{
    public static void main(String args[]){
        Scanner sc=new Scanner (System.in);

        System.out.print("Enter the number: ");
        int n;
        n=sc.nextInt();

       //condition
       if(n<5){
        System.out.println("The square of the number is: " +(n*n));
       }
       else{
        System.out.println("The cube of the number is: "+ (n*n*n));
       }
       sc.close();
    }
}