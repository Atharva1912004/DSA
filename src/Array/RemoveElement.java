package Array;

import java.util.Scanner;
class RemoveElement{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[] array={1,2,3,4,5};
        int number=sc.nextInt();

        for(int i=0;i<array.length;i++){
            if(array[i]!=number){
                System.out.print(array[i]+" ");

            }
        }

    }
}