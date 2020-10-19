import java.lang.Math;

class PlusOne {
    public static int[] plusOne(int[] digits) {
        int num = 0;
        int iter = 0;
        int powDigit = 0;
        for (int i = digits.length - 1; i >= 0; --i) {
            num += digits[i] * (Math.pow(10,iter));
            //System.out.println(num);
            iter++;
        }
        System.out.println("num before: " + num);
        num++;
        System.out.println("num after: " + num);
        iter--;
        System.out.println("iter: " + iter);
        for (int i = 0; i<digits.length ; i++) {
            
            powDigit = (int)Math.pow(10,iter);
            if((num/powDigit) > 9){
                digits = new int[digits.length +1];
                System.out.println("digits: " + digits);
        
                iter++;
                powDigit = (int)Math.pow(10,iter);
                System.out.println("powDigit: " + powDigit);
            }
            digits[i] = num / powDigit;
            num = num % powDigit;
            iter--;
        }
        return digits;
    }


    public static void main(String[] args) {
        int[] digits = {1,1,1,1,,9,9,9,9,9};
        int[] res = plusOne(digits);
        for(int i=0; i<res.length;i++){
           System.out.println(res[i]);
        }
        
    }
}