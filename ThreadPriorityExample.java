public class ThreadPriorityExample extends Thread{
    public void run(){
        System.out.println("We are inside run()");
    }
    public static void main(String args[]){
        ThreadPriorityExample t1=new ThreadPriorityExample();
        ThreadPriorityExample t2=new ThreadPriorityExample();
        ThreadPriorityExample t3=new ThreadPriorityExample();
        t1.start();
        t2.start();
        t3.start();
        System.out.println("Priority of t1 is:"+t1.getPriority());
        System.out.println("Priority of t2 is:"+t2.getPriority());
        System.out.println("Priority of t3 is:"+t3.getPriority());

        t1.setPriority(7);
        t2.setPriority(8);
        t3.setPriority(4);

        System.out.println("priority has been changed");

        System.out.println("Priority of t1 is:"+t1.getPriority());
        System.out.println("Priority of t2 is:"+t2.getPriority());
        System.out.println("Priority of t3 is:"+t3.getPriority());

        System.out.println("current thread working is:"+Thread.currentThread().getName());
        System.out.println("current thread working is:"+Thread.currentThread().getName());
    }
}
