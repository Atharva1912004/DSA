package StreamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamApi {
    public static void main(String[] args){
        List<Integer> number=List.of(1,23,5,6,5,6,4,6,46,5);
        List<Integer> streamNum=number.stream().filter(i->i%2==0).collect(Collectors.toList());
        System.out.println(streamNum);
        List<Integer> square=number.stream().map(i->i*i).collect(Collectors.toList());
        System.out.println(square);
        List<String> listOfName=new ArrayList<>();
        listOfName.add("Atharva");
        listOfName.add("Vedant");
        List<String> list=listOfName.stream().filter(i->i.startsWith("A")).collect(Collectors.toList());
        System.out.println(list);

    }

}
