package Stack;

import java.util.Scanner;
import java.util.Stack;

public class FindBiggerRightElement {
    public static int[] nextGreaterElement(int[] array) {
        int[] answer = new int[array.length];
        Stack<Integer> stack = new Stack<>();
        stack.push(array[array.length - 1]);
        answer[array.length - 1] = -1;
        for (int i = array.length - 2; i >= 0; i--) {
            while (stack.size() > 0 && array[i] > stack.peek()) {
                stack.pop();
            }
            if (stack.size() == 0) {
                answer[i] = 1;
            } else {
                answer[i] = stack.peek();
            }
            stack.push(array[i]);
        }
        return answer;


    }

    public static void main(String[] args) {
        int[] newArray = nextGreaterElement(new int[]{2, 5, 4, 10, 1, 12, 6, 8, 7});
        for (int a : newArray) {
            System.out.print(a+ " ");
        }

    }
}

