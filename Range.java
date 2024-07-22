import java.util.*;
class Range{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n;
        n=sc.nextInt();
        //if the number is between 1-10
        if(n>=1 && n<=10){
            System.out.println("The number lies between 1 to 10");
        }
         //if the number is between 11-20
        else if(n>=11 && n<=20){
            System.out.println("The number lies between 11 to 20");
        }
         //if the number is between 21-30
         else if(n>=21 && n<=30){
            System.out.println("The number lies between 21 to 30");
         }
         else {
            System.out.println("The number is greater than 30");
         }
         sc.close();
    }
}
/**
 * Mistake
 * 9 is incorrect 10 hona cahiye tha
 * >=and<= hum < and > likh die the
*/