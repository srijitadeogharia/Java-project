import java.util.*;
class LargestNum{
    public static void main(String args[]){
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter value of a: ");
    int a;
    a=sc.nextInt();
    System.out.println("Enter value of b: ");
    int b;
    b=sc.nextInt();
    //checking largest
    if(a>b){
        System.out.println(a+" that is a is greater than b which is "+b);
        }
        else if(b>a){
            System.out.println(b+" that is a is greater than a which is "+a);
        }
        else{
            System.out.println("Invalid input form the user");
        }
    }
}
