package QUESTIONS;

import java.util.Scanner;

public class CalculateArray {
    public static void main(String[] args) {


        int[] array = {1, 2, 3, 1, 5, 1, 65};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first position");

        int first = sc.nextInt();
        System.out.println("Enter the second position");
        int second = sc.nextInt();
        int count=0;
        for(int i=first;i<=second;i++){
            count=count+array[i];
 
        }
        System.out.println("the value is"+" "+ count);


    }
}