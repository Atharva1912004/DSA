package Recursion;
public class DisplayRecursion {
    public static void print(int[] array,int index){
        if(index==array.length){
            return;
        }
        print(array,index+1);
        System.out.print(array[index]+" ");
    }
    public static void main(String[] args){
        int[] array={2,3,4,5,4,5,4,1,};
        print(array,0);
    }
}
