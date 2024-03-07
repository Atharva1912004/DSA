package Recursion;

import java.util.ArrayList;

public class stairsPath{


    public static ArrayList<String> getPaths(int n){
        if(n==0){
            ArrayList<String> ar=new ArrayList<>();
            ar.add("");
            return ar;
        }
        else if (n<0){
            ArrayList<String> ar = new ArrayList<>();
            return ar;
        }
        ArrayList<String> path1=getPaths(n-1);
        ArrayList<String> paths2=getPaths(n-2);
        ArrayList<String> paths3=getPaths(n-3);
        ArrayList<String> list=new ArrayList<>();

        for(String path:path1){
            list.add(1+path);
        }
        for(String path:paths2){
            list.add(2+path);
        }
        for (String path:paths3){
            list.add(3+path);
        }
        return list;


    }
    public static void main(String[] args){

        System.out.println(getPaths(4));
    }
}