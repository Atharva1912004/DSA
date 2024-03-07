package QUESTIONS;

class FirstOccurrence{
    public static void main(String[] args){
        String hystack="butsad";
        String needle="sad";

        int index=hystack.indexOf(needle);
        String result="the word is at "+index;
        System.out.println(result);
    }
}