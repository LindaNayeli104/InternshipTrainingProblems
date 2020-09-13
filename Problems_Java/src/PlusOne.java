import java.lang.Math;

class PlusOne {
    public static int[] plusOne(int[] digits) {
        int num = 0;
        int iter = 0;
        int powDigit = 0;
        for (int i = digits.length - 1; i >= 0; --i) {
            num += digits[i] * (Math.pow(10,iter));
            System.out.println(num);
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
                iter++;
                powDigit = (int)Math.pow(10,iter);
            }
            digits[i] = num / powDigit;
            num = num % powDigit;
            iter--;
        }
        return digits;
    }


    public static void main(String[] args) {
        int[] digits = {9,8,7,6,5,4,3,2,1,0};
        int[] res = plusOne(digits);
        for(int i=0; i<res.length;i++){
           System.out.println(res[i]);
        }
        
    }
}