import java.util.Scanner;
class ReadDataType{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

       // int ,float,double,string

       System.out.print("enter integer:");
       int ivalue=sc.nextInt();

       System.out.print("Enter float:");
       float fvalue=sc.nextFloat();

       System.out.print("Enter double:");
       double dvalue=sc.nextDouble();
       sc.nextLine();

       System.out.print("Enter string:");
       String svalue=sc.nextLine();

       System.out.println("Integer:"+ivalue);
       System.out.println("Float:"+fvalue);
       System.out.println("Double:"+dvalue);
       System.out.println("String:"+svalue);
        sc.close();
    }
}
