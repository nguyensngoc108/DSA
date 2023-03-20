package simplestack;
//Test identical stacks and concatenate 2 stacks
import java.util.Stack;

public class Test {
    public static void main(String[] args) {
        Stack<Integer> stack1 = new Stack<Integer>();
        Stack<Integer> stack2 = new Stack<Integer>();
        Stack<Integer> stack3 = new Stack<Integer>();
        stack1.push(1);
        stack1.push(2);
        stack1.push(3);
        stack2.push(1);
        stack2.push(2);
        stack2.push(3);
        stack3.push(1);
        stack3.push(2);
        stack3.push(4);
        System.out.println("Stack1 and Stack2 are identical: "+Identical.isIdentical(stack1, stack2));
        System.out.println("Stack1 and Stack3 are identical: "+Identical.isIdentical(stack1, stack3));
        System.out.println("Stack1 and Stack2 are identical: "+Identical.isIdentical(stack2, stack3));
        System.out.println("Concatenated stack is: "+Concatenate2stack.concateStack(stack1, stack2));
    }
}
