import java.util.*;
class Divisible3And5{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number:");
        int n=sc.nextInt();
        if(n%5==0 && n%3!=0){
            System.out.println("The number is divisible by 5 but not by 3");
        }
        else if(n%5!=0 && n%3==0){
            System.out.println("The number is divisible by 3 but not by 5");
        }
        else if(n%5==0 && n%3==0){
            System.out.println("The number is divisible by 5 and 3 both");
        }
        else{
            System.out.println("Invalid input");
        }
        sc.close();
    }
}