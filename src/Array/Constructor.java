package Array;

class Constructor {
    public static void main(String[] args) {
        String[] array = {"A", "B", "C", "D","E","F","G","H","I"};
        int input = 10;
        int index=0;
        String[] array1 = new String[input+1];

        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < array.length; j++) {
                String output = array[i] + array[j];
                if(index<input){
                array1[index]=output;
                index++;}

            }

        }

        for(int i=0;i<input;i++){
            System.out.print(array1[input-1]+" ");
            break;

        }


    }
}