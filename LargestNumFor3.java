import java.util.*;
class LargestNumFor3{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the value of a:");
        int a;
        a=sc.nextInt();
        System.out.print("Enter the value of b:");
        int b;
        b=sc.nextInt();
        System.out.print("Enter the value of c:");
        int c;
        c=sc.nextInt();
        //condition
        // ||-> is for or sign and && -> is for and 
        /**
         * 2nd approch to solve this q 
         * int a=largest;
         * if(b>largest){
         * largest=b;
         * }
         * if(c>largest){
         * largest = c;
         * }
         * System.out.println("The largest number is: " + largest);
         */
        if(a>b && a>c){
            System.out.print(a+" i.e a is the greater than b and c");
        }
        else if(b>a && b>c){
            System.out.print(b+" i.e b is the greater than a and c");
        }
        else if(c>a && c>b){
            System.out.print(c+" i.e c is the greater than b and a");
        }
        else{
            System.out.print("Invalid input");
        }  
        sc.close();  
    }
}
