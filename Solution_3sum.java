/*
Given an array S of n integers, are there elements a, b, c in S such that a + b + c = 0? Find all unique triplets in the array which gives the sum of zero.

Note: The solution set must not contain duplicate triplets.
For example, given array S = [-1, 0, 1, 2, -1, -4],
A solution set is:
[
  [-1, 0, 1],
  [-1, -1, 2]
] 
*/


import java.util.LinkedList;
import java.util.List;

public class Solution_3sum{
	public void main(String[] arg){
		//创建主函数，为了便于调试
		int[] array_s = {-1, 0, 1, 2, -1, -4};
				System.out.println(threeSum(array_s));
	}
	//实现方法
    public List<List<Integer>> threeSum(int[] nums) {
    	//返回列表
    	List<List<Integer>> lst_parent = new LinkedList();
    	List<Integer> lst = new LinkedList();
        
    	
    	return null;
    }
}

//第一反应：遍历，选取两个数求和，根据结果查询是否存在第三个数；
//预计时间复杂度： N的3次方
//怎样降低时间复杂度？

//看LeetCode提供的方法中的返回值类型为List
//本题结题关键也为List
//之前想用数组，类似于转存的方式，存一个行数不固定，列数为3的数组，现在再想，有很多劣势

//写代码时候发现，原题中给的代码中写的是双层List,完整代替了二维数组
//可以往外层中多次添加List<>;
//问题：怎样在添加完删除里层List<> 中的值，并更换新值『 外层得到的是原 List的地址，』
//

/*
 * 附上双层List的测试程序
import java.util.LinkedList;
import java.util.List;

public class test_LinkedList {
	public static void main(String[] args) {
		List<List<Integer>> link_parent = new LinkedList();
        List<Integer> link = new LinkedList();
        link.add(3);
        link.add(-1);
        link.add(2);
        link.add(4);
        link_parent.add(link);
        link.add(99);//测试，外层List得到的是 地址
		link_parent.add(link);
		//可以重复添加同一 List
        System.out.println(link_parent);
        link.clear();//指向的也是地址，在上一个输出之前 clear()，则上面一条输出也是空
        System.out.println(link);
   }
}

Output:	
[[3, -1, 2, 4, 99], [3, -1, 2, 4, 99]]
[]
*/
 

//