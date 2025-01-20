public class Thrd2 extends Thread {
    public void run(){
        for (int i=0;i<=5;i++){
            try{
                Thread.yield();
            }
            catch(Exception e){
                System.out.println("Value enter in sleep is wrong:"+e);
            }
            System.out.println(i);
        }
    } 
    public static void main(String[] args) {
        Thrd2 g1=new Thrd2();
        g1.start();
    }  
}
