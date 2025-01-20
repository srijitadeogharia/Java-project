import java.util.Stack;
public class Stk {
    public static void main(String args[]){
       Stack <Character> Stk1=new Stack<>();
       System.out.println("A new stack has been created");
       Stk1.push('a');
       Stk1.push('b');
       Stk1.push('c');
       Stk1.push('d');
       Stk1.push('w');
       Stk1.push('j');
       System.out.println("Members of stack are"+Stk1);
       Stk1.pop();
       Stk1.pop();
       Stk1.pop();
       System.out.println("Members of stack are"+Stk1);
    }
}
