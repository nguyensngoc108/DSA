package simplestack;

import java.util.*;
import java.util.Stack;


public class Concatenate2stack{
    public static Stack<Integer> concateStack(Stack<Integer> stack1,Stack<Integer> stack2){
        Stack<Integer> stack3 = new Stack<Integer>();
        while(!stack1.isEmpty()){
            stack3.push(stack1.pop());
        }
        while(!stack2.isEmpty()){
            stack3.push(stack2.pop());
        }
        return stack3;
    }
}


