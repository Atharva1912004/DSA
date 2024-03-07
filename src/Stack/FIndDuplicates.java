package Stack;

import java.util.Stack;

public class FIndDuplicates {
    public static void main(String[] args){
        String data="((1+4)+(2+5))";
        Stack<Character> sta=new Stack<>();
        for(int i=0;i<data.length();i++){
            char cd=data.charAt(i);
            if(cd == ')'){
                if(sta.peek()=='('){
                    System.out.println(true);
                    return;
                }
                else{
                    while(sta.peek()!='('){
                        sta.pop();
                    }
                    sta.pop();
                }
            }
            else{
                sta.push(cd);
            }

        }
        System.out.println(false);
    }
}
