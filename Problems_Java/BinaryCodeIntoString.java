import java.util.*;
import java.lang.Math.*;


class BinaryCodeIntoString {
    public static boolean hasAllCodes(String s, int k) {
        String binary = "";
        for(int i=0; i<Math.pow(k,2); i++){
            binary = Integer.toBinaryString(i);
            
            if(!s.contains(binary)){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(hasAllCodes("0110", 2));
    }
}