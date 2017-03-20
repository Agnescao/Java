import java.util.*;

public class ArrayList1 {

	static int sum(ArrayList list) { // to be completed
		if (list.size() == 0)
			return 0;
		else {
			int first = (Integer) list.get(0);
			list.remove(0);
			return first + sum(list);
		}

	}

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList();
		Collections.addAll(list, 4, 6, 8, 2, 4, 6, 6);
		int res1 = sum(new ArrayList(list));
		System.out.println("Sum of all elements in list=" + res1);

		int target = Console.readInt("enter target");
		int res2 = addGreater(new ArrayList(list), target);
		System.out.println("Sum of greater than target in list=" + res2);

		int target1 = Console.readInt("enter target1");
		int res3 = countGreater(new ArrayList(list), target1);
		System.out.println("count of greater than target1 in list=" + res3);

		boolean res4 = AllEven(new ArrayList(list));
		System.out.println("cotains even num in list=" + res4);

		int res5 = max(new ArrayList(list));
		System.out.println("the maximum number in list=" + res5);

	}

	private static int max(ArrayList list) {
		if (list.size() == 0)
			return 0;
		else {
			int first = (Integer) list.get(0);
			list.remove(0);

			if (first > max(new ArrayList(list))) {

				return first;
			} else
				return max(list);
		}
	}

	private static boolean AllEven(ArrayList list) {
		if (list.size() == 0)
			return true;
		else {
			int first = (Integer) list.get(0);
			list.remove(0);

			if (first % 2 == 0) {

				return AllEven(list);
			} else
				return false;
		}
	}

	static int countGreater(ArrayList list, int target1) {
		// TODO Auto-generated method stub
		if (list.size() == 0)
			return 0;
		else {
			int first = (Integer) list.get(0);
			list.remove(0);
			int count = 0;
			if (first > target1) {
				count++;
				return count + countGreater(list, target1);
			} else
				return 0 + countGreater(list, target1);
		}
	}

	static int addGreater(ArrayList list, int target) {
		// TODO Auto-generated method stub
		if (list.size() == 0)
			return 0;
		else {
			int first = (Integer) list.get(0);
			list.remove(0);
			if (first > target)
				return first + addGreater(list, target);
			else
				return 0 + addGreater(list, target);
		}

	}
}