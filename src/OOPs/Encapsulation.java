package OOPs;

class Encapsulatio{
    public static  String transform(int data){
        StringBuilder sb=new StringBuilder();
        while(data>0){
            data--;
            char ch= (char)('A'+data%26);
            data=data/26;
            sb.insert(0,ch);
        }
        return sb.toString();
    }
    public static void main(String[] args){
     System.out.println(transform(55));

    }
}