import java.util.*;
class Sum121{
    Scanner sc=new Scanner(System.in);
    int x,y,z;
    void input(){
        System.out.println("enter the numbers:");
        x=sc.nextInt();
        y=sc.nextInt();
    }
    void process(){
        z=x+y;
    }
    void output(){
        System.out.println("sum="+z);
    }
    class Abc121{
        void main(String args[]){
            Sum121 obj=new Sum121();
            obj.input();
            obj.process();
            obj.output();
        }
    }
}
