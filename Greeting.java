import java.util.*;
class Greeting{
public static void main(String args[]){
try(Scanner sc=new Scanner(System.in)){

    System.out.print("enter your name? -->");
    String name=sc.nextLine();

    System.out.print("what is your age? -->");
    int age=sc.nextInt();

    System.out.println("where do you live? -->");
    String address=sc.nextLine();

    System.out.println("Hello my name is "+name+" i am "+age+" years old and i live in "+address);
   }
 }
}
