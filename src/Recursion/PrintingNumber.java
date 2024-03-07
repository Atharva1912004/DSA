package Recursion;

public class PrintingNumber {
    public static void printIt(int n) {
        if (n == 0) return;
        System.out.println(n);
        printIt(n - 1);
    }

    public static void main(String[] args) {
        printIt(5);
    }
}
