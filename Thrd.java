//creating thread with the help of thread class
public class Thrd extends Thread{
    public void run(){
        int a=5;
        int b=10;
        int c=a+b;
        System.out.println("the value od a+b is="+c);
    }
        public static void main(String args[]){
        Thrd g1=new Thrd();
        g1.start();
      // g1.stop();-unsafe
       //start()to ignite the thread or to make it runnable
    }
}