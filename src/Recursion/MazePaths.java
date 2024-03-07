package Recursion;

import java.sql.Array;
import java.util.ArrayList;

public class MazePaths {
    public static ArrayList<String> findPaths(int sourceRow,int sourceColumn,int destinationRow,int destinationColumn){
        if(sourceRow==destinationRow&&sourceColumn==destinationColumn){
            ArrayList<String> ar=new ArrayList<>();
            ar.add("");
            return ar;

        }
        ArrayList<String> horizontalPath=new ArrayList<>();
        ArrayList<String> verticalPath=new ArrayList<>();

        if(sourceColumn<destinationColumn){
            horizontalPath=findPaths(sourceRow,sourceColumn+1,destinationRow,destinationColumn);
        }
        if(sourceRow<destinationRow) {
            verticalPath = findPaths(sourceRow + 1, sourceColumn, destinationRow, destinationColumn);
        }

        ArrayList<String> ar=new ArrayList<>();

        for(String path:horizontalPath){
            ar.add("h"+path);
        }
        for(String path:verticalPath){
            ar.add("v"+path);
        }

        return ar;

    }

    public static void main(String[] args){
        System.out.println(findPaths(1,1,2,3));
    }
}
