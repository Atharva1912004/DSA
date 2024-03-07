package Recursion;

public class AllIndices {
    public static int[] allIndices(int[] array ,int data, int index, int founds) {
        if (index == array.length) {
            return new int[founds];
        }
        if (array[index] == data) {
            int[] iArray = allIndices(array, data, index + 1, founds + 1);
            iArray[founds] = index;
            return iArray;
        } else {
            int[] iArray = allIndices(array, data, index + 1, founds);
                return iArray;
        }
    }
    public static void main(String[] args){
        int[] array=allIndices(new int[]{1,2,5,5,4,5,4,6,7},5,0,0);
        for(int a:array){
            System.out.println(a);
        }
    }
}
