package StringBuilder;

import java.util.Scanner;

class Atharva{
    public static boolean pali(String name){
        int low=0;
        int high=name.length()-1;
        while(low<=high){
            if(name.charAt(low)<name.charAt(high)){
                low++;
                high--;

            }
            else{
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        String name=sc.nextLine();

        for(int i=0;i<name.length();i++){
            for(int j=i;j<name.length();j++){
                String substring=name.substring(i , j+1);
                if(pali(substring)&&substring.length()>1){
                    System.out.println(substring);
                }
            }
        }
    }
}
