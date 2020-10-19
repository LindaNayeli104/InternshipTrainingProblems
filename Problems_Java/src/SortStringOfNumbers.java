import java.util.*;
class SortStringOfNumbers{
    public static String sortS(String word){
        String[] array = word.split("");
        Arrays.sort(array);
        String res = "";
        for(int i=0; i<array.length; i++){
            res += array[i];
        }
        return res;
    }

    public static void main(String[] args) {
        String word = "78419";
        System.out.println(sortS(word));
    }
}