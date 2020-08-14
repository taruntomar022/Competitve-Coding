class Solution {
     public static  boolean isPowerOfTwo(int n) {
//          int count = 0;
//          while(n>0){
//               n = n&(n-1);
//              count++;
//          }
        
//         if(count == 1){
//             return true;
//         }else{
//             return false;
//         }
          // complexity O(1)
          Long N = (long)n;
         return N>0 && (N&(N-1))==0; 
    }
}
