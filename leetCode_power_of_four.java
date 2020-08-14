public boolean isPowerOfFour(int num) {
        if(num > 0 && (num & (num-1))==0){
            int countZeroes = 0;
            while(num != 1){
                num >>>=1;
                countZeroes++;
            }
            return (countZeroes & 1) ==0;
        }
        return false;
    }
    // different strategy
    class Solution {
    public boolean isPowerOfFour(int num) {
        if(num > 0 && (num & (num-1))==0){
            if((num-1)%3==0){
                return true;
            }
        }
        return false;
    }
}
