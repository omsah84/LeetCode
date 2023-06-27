class Solution {
    public int[] plusOne(int[] digits) {

        int len = digits.length;
        int carry = 1;

        for(int i = len-1;i>=0;i--){

            int sum = digits[i] + carry;

            digits[i] = sum %10;

            carry = sum /10;

            if(carry == 0){
                return digits;
            }

        }

        int[] arr = new int[len+1];
        arr[0] = 1;
        return arr;
        
    }
}
