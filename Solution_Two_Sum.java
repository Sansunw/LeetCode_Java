public class Solution_Two_Sum {
    public int[] twoSum(int[] nums, int target) {
        int[] nums_traversal = new int[2];
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    nums_traversal[0] = i;
                    nums_traversal[1] = j;
                }
            }
        }
        return nums_traversal;
    }
}
/*
public class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] sum = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if(target - nums[i] == nums[j]) {
                    sum[0] = i;
                    sum[1] = j;
                }
            }
        }
        return sum;
    }
}
public class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] res = new int[2];
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(target-nums[i])) {
                res[0]=i;
                res[1]=map.get(target-nums[i]);
                break;
            }
            else{
                map.put(nums[i],i);
            }
        }
        return res;
    }
}
*/