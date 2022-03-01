import java.util.LinkedList;
import java.util.Random;

public class Question1to3 {
	
	public static void main(String[] args) {
		LinkedList linkedList = new LinkedList();
		
		linkedList.add(1);
		linkedList.add(3);
		linkedList.add(5);
		linkedList.add(7);
		linkedList.add(9);
		linkedList.add(11);
		
		System.out.println("Contents: " + linkedList);
		addAndSort(linkedList, 6);
		System.out.println("Contents: " + linkedList);
		swapValues(linkedList, 1, 5);
		System.out.println("Contents: " + linkedList);
		System.out.println("Contents: " + randomLinkedList());
	}

	public static void addAndSort(LinkedList linkedList, int value) {
		if ((int)linkedList.get(linkedList.size()-1) < value) {
			linkedList.add(linkedList.size(), value);
		}else {
			int i = 0;
			while((int)linkedList.get(i) < value) {
				i++;
			}
			linkedList.add(i, value);
		}
	}
	
	public static void swapValues(LinkedList linkedList, int value1, int value2) {
		int temp1 = (int)linkedList.get(value1);
		int temp2 = (int)linkedList.get(value2);
		
		linkedList.remove(value1);
		linkedList.add(value1, temp2);
		linkedList.remove(value2);
		linkedList.add(value2, temp1);
	}
	
	public static int randomLinkedList() {
		Random rand = new Random();
		LinkedList linkedList = new LinkedList();
		int index = -1;
		
		for (int i = 0; i < 500; i++) {
			linkedList.add(rand.nextInt(1000, 10000));
		}
		
		int randomNum = rand.nextInt(1000,10000);
		for (int i = 0; i < 500; i++) {
			if ((int)linkedList.get(i) == randomNum) {
				index = i;
			}
		}
		
		return index;
	}
}
