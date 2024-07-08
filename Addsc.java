import java.util.*;
public class Addsc{
    public static void main(String args[]){
        try(Scanner sc= new Scanner(System.in)){
         int a=sc.nextInt();
         int b=sc.nextInt();
         double c=sc.nextDouble();
         float d=sc.nextFloat();
         double calculate=a + b * c / d  ;
         System.out.println(calculate);
        }
    }
}
