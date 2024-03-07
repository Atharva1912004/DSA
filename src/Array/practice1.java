package Array;

class practice1{
    public static void main(String[] args){
        int[] array={1,2,44,55,62,72,77};
        int data=65;
        for(int i=0;i<array.length;i++){
            if(array[i]==data){
                System.out.println(i);
            }
            else if (array[i]!=data){
                System.out.println("the value does not found");
            }
        }
    }
}