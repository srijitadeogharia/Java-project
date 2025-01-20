public class Main3{
    public static void main(String args[]){
        String first="java";
        System.out.println("First string:"+first);

        String second="javA";
        System.out.println("Second string:"+second);

        String third="Python";
        System.out.println("third string:"+third);

        String forth="PythOn";
        System.out.println("third string:"+forth);

        boolean result1=first.equals(second);
        System.out.println("resultant string is:"+result1);

        boolean result2=first.equals(third);
        System.out.println("resultant string is:"+result2);

        boolean result3=second.equals(third);
        System.out.println("resultant string is:"+result3);

        boolean result4=third.equals(forth);
        System.out.println("resultant string is:"+result4);
    }
}