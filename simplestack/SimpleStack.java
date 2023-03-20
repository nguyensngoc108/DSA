package simplestack;

/*Write a program to 
i. Convert a decimal number to its octal form.
 */
import java.util.*;

public class SimpleStack {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a decimal number");
        int n = sc.nextInt();
        Stack<Integer> s = new Stack<Integer>();
        while (n > 0) {
            s.push(n % 8);
            n = n / 8;
        }
        System.out.println("Octal form of the number is");
        while (!s.isEmpty()) {
            System.out.print(s.pop());
        }
    }
}


