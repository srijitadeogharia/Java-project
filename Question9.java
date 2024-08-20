/*
 * 1) *
 * 2) **
 * 3) ***
 * 4) ****
 * 5) *****
 * 6) ****
 * 7) ***
 * 8) **
 * 9) *
 * till line number 5 we have a right angled traingle
 * then after 5th line the triangle turns to be inverted right angled traingle
 */
class Question9{
    public static void main(String args[]){
        //right angled triangled triamgle
        for(int i=1;i<=4;i++){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        //inverted right angled traingle
        for(int i=1;i<=6;i++){
            for(int j=1;j<=6-i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
