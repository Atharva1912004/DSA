package Array;

class practice {
    public static void main(String[] args) {
        int[] originalArray = {1, 2, 3, 4, 6, 7, 8, 9, 10};
        for(int low=0;low<originalArray.length;low++){

            for(int j=low+1;j<originalArray.length;j++){
            int c=originalArray[low]+1;
            originalArray[low]=c;
            if(c!=originalArray[j]){
                System.out.println("the missing number is "+c);

            }
            break;
        }
    }
}
}