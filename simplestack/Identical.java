

package simplestack;

import java.util.Stack;

public class Identical {
    public static <T> boolean isIdentical(Stack<T> stack1,Stack<T> stack2){
        if(stack1.size()!=stack2.size()){
            return false;
        }
        while(!stack1.isEmpty()){
            if(!stack1.pop().equals(stack2.pop())){
                return false;
            }
        }
        return true;
    }
}
