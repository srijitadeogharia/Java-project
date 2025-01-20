import java.io.*;

class Palindrombfr{
    public static void main(String args[]){
        int num=0,rev=0;
        int temp;
       try{
        InputStreamReader read=new InputStreamReader(System.in);
       BufferedReader in=new BufferedReader(read);
       System.out.print("Enter the number:");
       num=Integer.parseInt(in.readLine());
       temp=num;
        while(num!=0){
            int remainder=num%10;
            rev=num*10+remainder;
            num=num/10;
        }
        if(temp==rev){
            System.out.println("the number is a palindrom");
        }
        else{
            System.out.println("please input the coreect data");
        } 
       }
       catch(Exception e){
        System.out.println("ERROR!!");
       }

    }
}
