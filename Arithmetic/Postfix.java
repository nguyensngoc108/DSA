package Arithmetic;

import java.util.Scanner;
import java.util.Stack;

public class Postfix {
    private Stack<Character> theStack;
    private String input;
    private String output = "";

    public Postfix(String in) {
        input = in;
        int stackSize = input.length();
        theStack = new Stack<>();
    }

    public String doTrans() {
        for (int j = 0; j < input.length(); j++) {
            char ch = input.charAt(j);
            if (Character.isDigit(ch)) {
               
                String number = "";
                while (j < input.length() && Character.isDigit(input.charAt(j))) {
                    number += input.charAt(j);
                    j++;
                }
                output += number + " ";
                j--; 
            } else {
                switch (ch) {
                    case '+':
                    case '-':
                        gotOper(ch, 1);
                        break;
                    case '*':
                    case '/':
                        gotOper(ch, 2);
                        break;
                    case '(':
                        theStack.push(ch);
                        break;
                    case ')':
                        gotParen();
                        break;
                    default:
                        System.out.println("Invalid character");
                        break;
                }
            }
        }
        while (!theStack.isEmpty()) {
            char chx = theStack.pop();
            if (chx == '(') {
                System.out.println("Error: Unmatched parentheses");
                return "";
            }
            output = output + chx + " ";
        }
        return output;
    }
    

    private void gotOper(char opThis, int prec1) {
        while (!theStack.isEmpty()) {
            char opTop = theStack.pop();
            if (opTop == '(') {
                theStack.push(opTop);
                break;
            } else {
                int prec2;
                if (opTop == '+' || opTop == '-')
                    prec2 = 1;
                else
                    prec2 = 2;
                if (prec2 < prec1) {
                    theStack.push(opTop);
                    break;
                } else
                    output = output + opTop;
            }
        }
        theStack.push(opThis);
    }

    private void gotParen() {
        while (!theStack.isEmpty()) {
            char chx = theStack.pop();
            if (chx == '(')
                break;
            else
                output = output + chx;
        }
    }
}
