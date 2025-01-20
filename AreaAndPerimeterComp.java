import java.util.*;
class AreaAndPerimeterCom{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        //area of rectrangle and perimeter of rectangle
        System.out.println("Enter length:");
        float l=sc.nextFloat();
        System.out.println("Enter breath:");
        float b=sc.nextFloat();
        double area=l*b;
        System.out.println("The area of rectrangle is:"+area);
        double perimeter=2*(l+b);
        System.out.println("The perimeter of rectangle is:"+perimeter);
        //compararison
        if(area>perimeter){
            System.out.println("The area of rectangle is greater");
        }
        //agar yaha else laga de aur l and b dono ka value same daale to else vala ;
        //condition hit ho jaega kuki if vala condition false ho jaega uss case me;
        //so here we have to use else if ladder
        else if(perimeter>area){
              System.out.println("The perimeter if grrater");
        }

        else if(perimeter==area){
            System.out.println("The perimeter is equal to area of rectangle");
        }
        else{
            System.out.println("Invalid input");
        }
        sc.close();
    }
}
