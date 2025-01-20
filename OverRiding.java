class A{
    void show(){
        System.out.println("hello");
    }
}
class B extends A{
    void show(){
        System.out.println("how are you");
        super.show();//parent class ka functionality inherit kr lia by over-riding class B
    }
}
class OverRiding {
    public static void main(String args[]){
        //ye dono object creation and ob.show dono class B ka hai
        B obj=new B();
        obj.show();//hello and how are you pass kia hua h ussme vahi aaega
        
        A in=new A();
        in.show();//issme buss hello likhe hai to hello aara hai
       
        //obj.show();
    }
}

