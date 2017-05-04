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
//Time complexity:O(n*n)
//Space complexity:O(1)
//第一反应就是用 i j 轮询数组中所有的数据的组合
//但是，这样时间复杂度太大，特别是“三个数和”、“四个数和”……复杂度按次方增长
//第二反应是排序，快排、堆排、并归……时间复杂度一般只有 nlogn
//但是，程序要求输出下标，排序时得同时用数组记录下标情况
//**Java中，数组排序，涉及到数组的赋值，注意“传值”与“传地址”的区别
//然后，就算排序完成，依然至少需要遍历一遍整个数组。总时间复杂度：nlogn
//怎样有更低的时间按复杂度？

/*例程#2(Two-pass Hash Table) [Accepted]
public int[] twoSum(int[] nums, int target) {
    Map<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < nums.length; i++) {
        map.put(nums[i], i);
    }
    for (int i = 0; i < nums.length; i++) {
        int complement = target - nums[i];
        if (map.containsKey(complement) && map.get(complement) != i) {
            return new int[] { i, map.get(complement) };
        }
    }
    throw new IllegalArgumentException("No two sum solution");
}
*/
/*例程#3(One-pass Hash Table) [Accepted]
public int[] twoSum(int[] nums, int target) {
    Map<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < nums.length; i++) {
        int complement = target - nums[i];
        if (map.containsKey(complement)) {
            return new int[] { map.get(complement), i };
        }
        map.put(nums[i], i);
    }
    throw new IllegalArgumentException("No two sum solution");
}
*/
//这两个例程，主要用到了 HashMap ；
//##如果没有这个概念则只能自己花死力气。
