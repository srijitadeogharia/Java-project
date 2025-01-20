/* 
 *                * * * * * * * * *
 *                 *             *
 *                   *         *
 *                     *      *
 *                       *   *
 *                         *
 */
public class HollowTraingle {
    public static void main(String args[]){
        for (int i=1;i<=10;i++){
            for(int k=1; k<i;k++){
                System.out.print(" ");
            }
            if (i==1){
                System.out.print("* * * * * * * *");
            }
            else if(i==6){
                System.out.print("*");
            }
            else{
                System.out.print("*");
                for(int j=7;j>=(2*i-1);j--){
                    System.out.print(" ");
                   
                }
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
