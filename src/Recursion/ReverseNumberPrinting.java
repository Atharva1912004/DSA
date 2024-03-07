package Recursion;

public class ReverseNumberPrinting {
    public static void reversePrint(int n){
        if(n==0){
            return;
        }
        reversePrint(n-1);
        System.out.println(n);
    }
    public static void main(String[] args){
        reversePrint(5);
    }
}
