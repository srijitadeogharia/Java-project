class prg1{
    int x=5, y=6, z;
    void sum(){
        z=x+y;
        System.out.println("the sum of number is="+z);
    }
    void sum(int a,int b){
        x=a;
        y=b;
        z=x+y;
        System.out.println("the sum of numbers are="+z);
    }
    void sum(int a){
        x=a;
        System.out.println("the value of a is="+a);
        //z=x+y;
        //return z;
    }
}
class OverLoading{
    public static void main(String args[]){
    prg1 obj=new prg1();
    obj.sum();
    obj.sum(3,4);
    obj.sum(3);
    }
}
