import java.util.HashMap;
import java.util.Random;

public class Question4to6 {

	public static void main(String[] args) {
		HashMap hashmap = new HashMap();
		hashmap.put(0, 1);
		hashmap.put(1, 3);
		hashmap.put(2, 5);
		hashmap.put(3, 7);
		hashmap.put(4, 9);
		hashmap.put(5, 11);
		
		System.out.println("Contents: " + hashmap);
		addAndSort(hashmap, 6);
		System.out.println("Contents: " + hashmap);
		swapValues(hashmap, 1, 5);
		System.out.println("Contents: " + hashmap);
		System.out.println("Contents: " + randomHashMap());
		
	}
	
	public static void addAndSort(HashMap hashmap, int value) {
		if ((int)hashmap.get(hashmap.size() - 1) < value) {
			hashmap.put(hashmap.size(), value);
		}else {
			int i = 0;
			while ((int)hashmap.get(i) < value) {
				i++;
			}
			int key = (int) hashmap.size();
			for (int j = i + 1; j < hashmap.size(); j++) {
				hashmap.put(key, hashmap.get(key - 1));
				key--;
			}
			hashmap.put(i, value);
		}
	}

	public static void swapValues(HashMap hashmap, int value1, int value2) {
		int temp1 = (int)hashmap.get(value1);
		int temp2 = (int)hashmap.get(value2);
		
		hashmap.remove(value1);
		hashmap.put(value1, temp2);
		hashmap.remove(value2);
		hashmap.put(value2, temp1);
	} 
	
	public static int randomHashMap() {
		Random rand = new Random();
		HashMap map = new HashMap();
		int index = -1;
		
		for (int i = 0; i < 500; i++) {
			map.put(i, rand.nextInt(1000, 10000));
		}
		
		int randomNum = rand.nextInt(1000,10000);
		for (int i = 0; i < 500; i++) {
			if ((int)map.get(i) == randomNum) {
				index = i;
			}
		}
		
		return index;
	}
}
	
