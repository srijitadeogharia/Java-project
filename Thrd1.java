//creating thread with the help of runnable interface
public class Thrd1 implements Runnable{
    public void run(){
        for(int i=1;i<=5;i++){
            try{
                Thread.sleep(5005);
            }
            catch(Exception e){
                System.out.println("you must enter the correct value");
            }
            System.out.println(i);
        }
    }
    public static void main(String args[]){
        Thrd1 g1=new Thrd1();
        Thread t1=new Thread(g1);
        t1.start();
    }
}