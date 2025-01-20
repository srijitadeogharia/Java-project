abstract class Hello{
    abstract void run();
    public void play(){
        System.out.println("we are playing");
    }
    class Example extends Hello{
        void run(){
            System.out.println("task completed");
        }
         void main(String args[]){
           // Hello obj=new Example() {
                //obj.run();
                //obj.play();
            //}
        }
    }
}
