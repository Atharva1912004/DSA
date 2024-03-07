package Array;

public class SeePresent {
    public static void main(String[] args) {
        int[] array = {1, 1, 2, 2, 2, 3, 5};
        int[] array2 = {1, 1, 1, 2, 2, 4, 5};
        int count = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array[i] == array2[j]) {
                    count++;
                    int[] array3 = new int[count];
                    array3[i] = array[i];
                    System.out.print(array3[i]);


                }
            }

        }


    }

    public static class BarChart {
        public static void main(String[] args){
            int[] array={1,2,3,4,5,6,7};
            int max=array[0];
            for(int a:array){
                if(a>max){
                    max=a;
                }
            }
            for(int i=max;i>=1;i--){
                for (int k : array) {
                    if (k >= i) {
                        System.out.print("|\t");
                    } else {
                        System.out.print("\t");
                    }
                }
                System.out.println();
            }

        }

    }

    public static class RotateArray {
        public static void reverse(int[] array, int low, int high) {
            int li = low;
            int hi = high;
            while (li < hi) {
                int temp = array[li];
                array[li] = array[hi];
                array[hi] = temp;
                li++;
                hi--;
            }

        }

        public static void rotate(int[] array, int k) {
            reverse(array, 0, array.length - k - 1);
            reverse(array, array.length - k, array.length - 1);
            reverse(array,0, array.length - 1);
        }

        public static void print(int[] array) {
            for (int a : array) {
                System.out.print(a);
            }
        }
        public static void main(String[] args){
           int[] array={1,2,3,4,5,6,7,8,9};
            rotate(array,2);
           print(array);
        }
    }

    public static class SpanOfArray {
        public static void main(String[] args){
            int[] array={1,2,4,5,6,7};
            int max=array[0];
            int x=array.length-1;
            int min=array[x];
            for(int a:array){
                if(a>max){
                    a=max;
                }
            }
            for(int b=array.length-1;b>=1;b++){
                if(b<min){
                    b=min;
                }

            }
            int c=max-min;
            System.out.println(c);
        }
    }

    public static class SubArray {
        public static void main(String[] args){
            int[] array={1,2,3,4,5,6,7};
            for(int i=0;i<array.length;i++){
                for(int j=i;j<array.length;j++){
                    for(int k=i;k<j;k++){
                        System.out.print(array[k]);
                    }
                    System.out.println();
                }
            }
        }


    }
}

