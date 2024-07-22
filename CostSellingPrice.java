import java.util.*;
class CostSellingPrice{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        //cost price and selling orice is input through the keyboard
        System.out.print("enter the cost price :");
        int cp=sc.nextInt();
        System.out.print("enter the selling price :");
        int sp=sc.nextInt();
        //wap to determine wether the seller has incurred a profit or a loss
        if(sp>cp){
            System.out.println("The seller has incurred a profit");
            int profit=sp-cp;
            System.out.println("The seller has incurred a profit of="+profit);
        }
        else if(sp<cp){
            System.out.println("The seller has incurred a loss");
            int loss=cp-sp;
            System.out.println("The seller has incurred a loss of="+loss);
        }
        else{
            System.out.println("The seller has incurred neigther a profit nor loss");
        }
        //how much profit or loss he gained
        //profit=sp-cp;
        //loss=cp-sp;
        sc.close();
    }
}