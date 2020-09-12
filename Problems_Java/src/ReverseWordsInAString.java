class Solution {
    public String reverseWords(String s){                     
        String str = "";                                                                                                                                   
        ArrayList <Integer> strs = new ArrayList<>();                   
        String res = "";

        for(int i=0; i< s.length(); i++){
            if(s.charAt(i) != ' '){
                str += s.charAt(i);
            }else{
                if(str != ""){
                    strs.append(str);
                    str = "";
                }
            }


        }//for end

        for(int i=strs.length()-1 ; i >0; i--){
            res += strs[i];
            if( i != 0){
            res += " ";
            }
        }

        return res;

        }

}