/*
*  1) * * * * *
*  2) * * * * *
*  3) * * * * *
*  4) * * * * *
*  5) * * * * *
* number of lines=number of stars=5
* i=n and j=n(n-number input through keyboard)
*/
import java.util.*;
class SquarePattern{
   public static void main(String args[]){
       Scanner sc=new Scanner(System.in);
       System.out.print("Enter the number:");
       int n;
       n=sc.nextInt();
       for(int i=1;i<=n;i++){
           for(int j=1;j<=n;j++){
               System.out.print("* ");
           }
           System.out.println();
       }
       sc.close();
    }
}
