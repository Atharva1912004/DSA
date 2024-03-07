package Array;

class Basic{
    public static void reverse(int[] array,int low,int high){
        int li=low;
        int hi=high;
        while(li<hi){
            int temp=array[li];
            array[li]=array[hi];
            array[hi]=temp;
            li++;
            hi--;
        }
    }
    public static void rotate(int[] array , int k){
        reverse(array,0,array.length-k-1);
        reverse(array,array.length-k,array.length-1);
        reverse(array,0,array.length-1);

    }
    public static void print(int[] array){
        for(int a:array){
            System.out.print(a);
        }
    }
    public static void main(String[] args){
        int[] array={1,2,4,5,6,7,9};
        rotate(array,2);
        print(array);

    }
}