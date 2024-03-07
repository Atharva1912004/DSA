package Array;

public class IsSubset {
    public static void main(String[] args){
        int[] array={2,65,8,9,6,7,9};
        int[] array2={2,8,9,11};
        int count=0;


        for(int i=0;i<array2.length;i++){
            for(int j=0;j<array.length;j++) {
                if(array2[i]==array[j]){
                    count++;
                    break;
                }
            }
        }
        if (count == array2.length) {

            System.out.println("yes");
        }else{
            System.out.println("no");
        }


    }
}
