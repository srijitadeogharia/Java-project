import java.util.*;
class SumDoubleArray{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array:");
        int count=sc.nextInt();
        int arr[]=new int[count];
        
        System.out.println("enter the values into array:");
        for(int i=0;i<count;i++){
            arr[i]=sc.nextInt();
        }
        int sum=0;
        for(int i=0;i<count;i++){
            sum=sum/count;
        }
        System.out.println("sum of array elements="+sum);
        sc.close();
    }
}