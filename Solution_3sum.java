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
		//������������Ϊ�˱��ڵ���
		int[] array_s = {-1, 0, 1, 2, -1, -4};
				System.out.println(threeSum(array_s));
	}
	//ʵ�ַ���
    public List<List<Integer>> threeSum(int[] nums) {
    	//�����б�
    	List<List<Integer>> lst_parent = new LinkedList();
    	List<Integer> lst = new LinkedList();
        
    	
    	return null;
    }
}

//��һ��Ӧ��������ѡȡ��������ͣ����ݽ����ѯ�Ƿ���ڵ���������
//Ԥ��ʱ�临�Ӷȣ� N��3�η�
//��������ʱ�临�Ӷȣ�

//��LeetCode�ṩ�ķ����еķ���ֵ����ΪList
//�������ؼ�ҲΪList
//֮ǰ�������飬������ת��ķ�ʽ����һ���������̶�������Ϊ3�����飬�������룬�кܶ�����

//д����ʱ���֣�ԭ���и��Ĵ�����д����˫��List,���������˶�ά����
//����������ж�����List<>;
//���⣺�����������ɾ�����List<> �е�ֵ����������ֵ�� ���õ�����ԭ List�ĵ�ַ����
//

/*
 * ����˫��List�Ĳ��Գ���
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
        link.add(99);//���ԣ����List�õ����� ��ַ
		link_parent.add(link);
		//�����ظ����ͬһ List
        System.out.println(link_parent);
        link.clear();//ָ���Ҳ�ǵ�ַ������һ�����֮ǰ clear()��������һ�����Ҳ�ǿ�
        System.out.println(link);
   }
}

Output:	
[[3, -1, 2, 4, 99], [3, -1, 2, 4, 99]]
[]
*/
 

//