public class ArrayOneGo {
    public static void main(String args[]){
       
        int arr[]={1,5,7};
        int arr1[]={3,6,1};
        //initialized the lenth of new array
        int sumarr[]=new int [arr1.length];
        //ststed adding both of them
        for(int i=0;i<=arr1.length;i++){
            sumarr[i]=arr[i]+arr1[i];
        }
        //printing the sum
        System.out.println("Sum array:");
        for(int num:sumarr){
            System.out.println(num+" ");
        }
    }
}
