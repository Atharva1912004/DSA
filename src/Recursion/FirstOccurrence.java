package Recursion;

public class FirstOccurrence {
    public static int firstOccurrence(int[] array, int index, int data) {
        if (index == array.length) {
            return -1;
        }
        if (array[index] == data) {
            return index;
        } else {
            return firstOccurrence(array, index + 1, data);
        }
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 7, 1, 2, 8, 2, 5, 1, 7, 2};
        System.out.println(firstOccurrence(array, 0, 7));
    }
}
