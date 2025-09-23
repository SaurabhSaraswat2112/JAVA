public class MaxConsecutiveBits {
    public int findMaximumConsecutive(int nums[]){
        int maxCount = 0;
        int count  = 1;

        for(int i =1;i < nums.length; i++){
            if(nums[i] == nums[i-1]){
                count++;
                maxCount = Math.max(maxCount, count);
            }else{
                count = 1;
            }
        }
        return maxCount;
    }
    public static void main(String[] args) {
        MaxConsecutiveBits obj = new MaxConsecutiveBits();
        int nums[] = {1,1,0,1,1,1};
        System.out.println(obj.findMaximumConsecutive(nums));
    }
    
}
