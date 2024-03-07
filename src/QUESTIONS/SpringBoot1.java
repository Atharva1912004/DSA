package QUESTIONS;

import java.util.Scanner;

class SpringBoot1{
    public static int[] ok(int[]array31) {
        Scanner ab=new Scanner(System.in);
        System.out.println("Enter th length of first Array.array");
        int length=ab.nextInt();
        System.out.println("Enter the your first Array.array");
        int[] array=new int[length];
        for(int i=0;i<array.length;i++){
            array[i]=ab.nextInt();
        }

        System.out.println("Enter the length of second Array.array");
        int lenght2=ab.nextInt();
        System.out.println("Enter the Second Array.array");
        int[] array2=new int[lenght2];
        for(int i=0;i<array2.length;i++){
            array2[i]=ab.nextInt();
        }
        int max=Math.max( length, lenght2);
        int[] array3=new int[max];


        return array3;
    }


    public static void main(String[] args) {
        int[] ag=new int[]{};
        ok(ag);

    }
}
