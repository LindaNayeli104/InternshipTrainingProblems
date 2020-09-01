//1.3 Arrays and Strings
//Cracking the Coding Interview

public class URLify{
    public static String completeStr(String str, int strSize){
        char[] chars = str.toCharArray();
        String res = "";
        for(int i=0; i<strSize; i++){
            if(chars[i] == ' '){
                res += "%20";
            }else{
                res += chars[i];
            }
        }
        return res;
    }

    public static void main(String[] args) {
        String str = " ";
        int strSize = 1;

        System.out.println(completeStr(str, strSize));
    }
}

//Linda Abundis