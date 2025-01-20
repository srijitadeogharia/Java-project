import java.io.*;
class Abc133{
    public static void main(String args[])throws IOException{
        int x;
        double t;
        try {
            InputStreamReader read=new InputStreamReader(System.in);
            BufferedReader meaw=new BufferedReader(read);
            System.out.println("Enter the number:");
            x=Integer.parseInt(meaw.readLine());
            t=Math.sqrt(x);
            System.out.println("Square root of "+x+" is: "+t);
        }
       catch(Exception e){
        System.out.println("please enter correct value:");
       }
    }
}
