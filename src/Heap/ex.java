package Heap;

public class ex {

    public static void tower(int plates, int a, int b, int c) {
        if (plates == 0) {
            return;
        }
        tower(plates - 1, a, c, b);
        System.out.println(plates + " [ " + a + " -> " + b + " ] ");
        tower(plates - 1, c, b, a);
    }

    public static void main(String[] args) {
        tower(3, 10, 11, 12);
    }
}