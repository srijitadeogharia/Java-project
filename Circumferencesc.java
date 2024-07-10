import java.util.*;
class Circumferencesc{
    public static void main(String args[]){
        try(Scanner sc= new Scanner(System.in)){
         double pi=sc.nextDouble();
         double r=sc.nextDouble();
         double circle=2*pi*r;
         System.out.println("The circumference of circle is--->"+(circle));
        }
     }
}
