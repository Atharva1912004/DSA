package StringBuilder;

public class HomeWork {
    public static void main(String[] args) {
        String a = "I have created #web@site with #atharva and @Mohsin";
        String[] array = a.split(" ");
        int length = array.length;
        int count = 0;


        for (int i = 0; i < array.length; i++) {
            StringBuilder sc = new StringBuilder(array[i]);
            if (sc.charAt(0) == '#') {
                count++;

            } else if (sc.charAt(0) == '@') {
                count++;

            }
        }
        String[] newArray = new String[count];
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            StringBuilder sc = new StringBuilder(array[i]);

            if (sc.charAt(0) == '#') {
                newArray[index] = array[i];
                index++;


            } else if (sc.charAt(0) == '@') {
                newArray[index] = array[i];
                index++;


            }



        }
        for (String c : newArray) {


           if(c!=null) {

               StringBuilder scc=new StringBuilder(c);
               int length2=c.length();
               for (int k=1;k<length;k++){
               if(scc.charAt(0)=='#'&&scc.charAt(k)=='@'){
                   System.out.println("@ and # in same word error");
               }
               else if(scc.charAt(0)=='@'&&scc.charAt(k)=='#'){
                   System.out.println("@ and # in same word error");
               }
               else{
                   System.out.print(c+" ");
                   break;
               }
           }

        }
    }
}}