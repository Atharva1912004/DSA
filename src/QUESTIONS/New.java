package QUESTIONS;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

class New {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();

        arrayList.add("flower");
        arrayList.add("floy");
        arrayList.add("flight");
        Collections.sort(arrayList);
        String First= arrayList.get(0);
        String Last=arrayList.get(arrayList.size()-1);

        int min=Math.min(First.length(),Last.length());
        for (int c = 0; c <min; c++) {

            if (First.charAt(c) ==Last.charAt(c)) {
                System.out.print(First.charAt(c));
            }


        }
    }
}
