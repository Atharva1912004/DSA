package Recursion;

public class Factorial2 {
    public static int factorial(int data){
        if(data==1){
            return 1;
        }
        else{
            return data*factorial(data-1);
        }
    }
    public static void main(String[] args){
        int result=factorial(4);
        System.out.println(result);

    }
}
