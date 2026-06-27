class Solution {
    public int findNumbers(int[] nums) {
        int evencount = 0;
        

        for(int i=0;i<nums.length;i++){
             int digitcount = 0;
            int num = nums[i];

            while(num != 0){

                num = num / 10;
                digitcount +=1;
            }
            if(digitcount%2==0){
                evencount +=1;

            }
                          

        }
        return evencount;
        
    
    }
}