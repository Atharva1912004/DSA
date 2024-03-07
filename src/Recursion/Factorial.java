package Recursion;

public class Factorial {
    public static int factorialMethod(int data){
        if(data==1){
            return 1;
        }
        return data*factorialMethod(data-1);
    }
    public static void main(String[] args){
        int result=factorialMethod(4);
        System.out.println(result);
    }
}
