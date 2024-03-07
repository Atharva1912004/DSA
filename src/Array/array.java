package Array;

class array{
    public static void main(String[] args){
        int[] array={1,2,4,5,6};
        for(int i=0;i<array.length;i++){
            for(int j=i;j<array.length;j++){
                for(int k=i;k<=j;k++){
                    System.out.print(array[k]+" ");
                }
                System.out.println();
            }
        }
    }
}