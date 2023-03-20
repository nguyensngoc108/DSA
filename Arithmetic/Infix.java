

package Arithmetic;

import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Infix{
    public static void main(String[] args) throws IOException {
        String input, output;
        while(true) {
            System.out.print("Enter infix: ");
            System.out.flush();
            input = getString(); 
            if(input.equals("")) 
                break;
          
            Postfix theTrans = new Postfix(input);
            output = theTrans.doTrans();
            System.out.println("Postfix is " + output + '\n');
        } 
    } 

    public static String getString() throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String s = br.readLine();
        return s;
    }


}
