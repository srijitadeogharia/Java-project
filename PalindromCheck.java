import java.util.*;
class PalindromCheck{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:");
        int number=sc.nextInt();
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
        sc.close();
    }
}

