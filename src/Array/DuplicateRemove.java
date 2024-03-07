package Array;

public class DuplicateRemove {
    public static void main(String[] args){
        int[] array={1,2,2,3,4,5,6,7};
        for(int i=0;i<array.length;i++){
            for(int j=i+1;j<array.length-1;j++){
                if(array[i]==array[j]){
                    array[i]=0;

                }
            }
        }
        for(int i=0;i<array.length;i++){
            if(array[i]!=0){
                System.out.print(array[i]+" ");
            }
        }
    }
}
