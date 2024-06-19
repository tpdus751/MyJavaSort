package javasort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

import comparable.CFruit;
import comparator.Fruit;
import comparator.FruitNameComparator;
import comparator.FruitPriceComparator;

public class CollectionsSortTest {

	public static void main(String[] args) {
		sortInteger();
		sortString();
		sortComparableFruit();
		sortFruit();
	}
	
	private static void sortFruit() {
		System.out.println("====  Sort Fruit ====");
		ArrayList<Fruit> dataList = new ArrayList<>(Arrays.asList(new Fruit("apple", 1000), 
												new Fruit("tomato", 5000), new Fruit("banana", 8000)));
		System.out.println("원본 : " + dataList);
		
		Collections.sort(dataList, new FruitPriceComparator());
		System.out.println("오름차순 : " + dataList);
		
		Collections.sort(dataList, new FruitPriceComparator().reversed());
		System.out.println("내림차순 : " +dataList);
		
		Collections.sort(dataList, new FruitNameComparator());
		System.out.println("오름차순 : " + dataList);
		
		Collections.sort(dataList, new FruitNameComparator().reversed());
		System.out.println("내림차순 : " +dataList);
		
	}

	private static void sortComparableFruit() {
		System.out.println("====  Sort Comparable Fruit ====");
		ArrayList<CFruit> dataList = new ArrayList<>(Arrays.asList(new CFruit("apple", 1000), 
												new CFruit("tomato", 4000), new CFruit("banana", 3000)));
		System.out.println("원본 : " + dataList);
		
		Collections.sort(dataList);
		System.out.println("오름차순 : " + dataList);
		
		Collections.sort(dataList, Comparator.reverseOrder());
		System.out.println("내림차순 : " +dataList);
	}

	static void sortInteger() {
		ArrayList<Integer> dataList = new ArrayList<> (Arrays.asList(40, 15, 34, 21, 66, 53));
		System.out.println("원본 : " + dataList);
		
		Collections.sort(dataList);
		System.out.println("오름차순 : " + dataList);
		
		Collections.sort(dataList, Comparator.reverseOrder());
		System.out.println("내림차순 : " + dataList);
	}

	static void sortString() {
		ArrayList<String> dataList = new ArrayList<>(Arrays.asList("d", "A", "C", "F", "a"));
		System.out.println("원본 : " + dataList);
		
		Collections.sort(dataList);
		System.out.println("오름차순 : " + dataList);
		
		Collections.sort(dataList, Comparator.reverseOrder());
		System.out.println("내림차순 : " + dataList);
		
		Collections.sort(dataList, String.CASE_INSENSITIVE_ORDER);
		System.out.println("대소문자무시 : " + dataList);
		
		Collections.sort(dataList, Collections.reverseOrder(String.CASE_INSENSITIVE_ORDER));
		System.out.println("대소문자무시 내림차순 : " + dataList);
		
	}

}
