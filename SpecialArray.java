
import java.util.*;
import java.util.Stack;
import java.util.Arrays;
import java.util.Random;


public class SpecialArray{
    public static void main(String[] args) {
        int[] arr = new int[20];
        Random rand = new Random();
        for(int i=0;i<20;i++){
            arr[i] = rand.nextInt(100);
        }
        System.out.println("The array is: "+Arrays.toString(arr));
        Stack<int[]> stack1 = new Stack<int[]>();
        Stack<int[]> stack2 = new Stack<int[]>();
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("Enter 1 to update the value at a position in the array");
            System.out.println("Enter 2 to undo the updating");
            System.out.println("Enter 3 to redo the updating");
            System.out.println("Enter 4 to display content of the array");
            System.out.println("Enter 5 to exit");
            int choice = sc.nextInt();
            switch(choice){
                case 1:
                    System.out.println("Enter the position to update");
                    int pos = sc.nextInt();
                    System.out.println("Enter the value to update");
                    int val = sc.nextInt();
                    stack1.push(arr);
                    arr[pos] = val;
                    System.out.println("The array is: "+Arrays.toString(arr));
                    break;
                case 2:
                    if(stack1.isEmpty()){
                        System.out.println("No more undo");
                    }
                    else{
                        stack2.push(arr);
                        arr = stack1.pop();
                        System.out.println("The array is: "+Arrays.toString(arr));
                    }
                    break;
                case 3:
                    if(stack2.isEmpty()){
                        System.out.println("No more redo");
                    }
                    else{
                        stack1.push(arr);
                        arr = stack2.pop();
                        System.out.println("The array is: "+Arrays.toString(arr));
                    }
                    break;
                case 4:
                    System.out.println("The array is: "+Arrays.toString(arr));
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        }
    }
}
