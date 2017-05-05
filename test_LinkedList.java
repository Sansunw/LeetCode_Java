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
//        link.
        link_parent.add(link);
        link.add(99);
        link_parent.add(link);
        System.out.println(link_parent);
        link.clear();
        System.out.println(link);
   }
}
