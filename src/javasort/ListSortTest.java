package javasort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class ListSortTest {

	public static void main(String[] args) {
		sortInteger();
		sortString();

	}
	
	static void sortInteger() {
		ArrayList<Integer> dataList = new ArrayList<> (Arrays.asList(40, 15, 34, 21, 66, 53));
		System.out.println("원본 : " + dataList);
		
		dataList.sort(Comparator.naturalOrder());
		System.out.println("오름차순 : " + dataList);
		
		dataList.sort(Comparator.reverseOrder());
		System.out.println("내림차순 : " + dataList);
	}

	static void sortString() {
		ArrayList<String> dataList = new ArrayList<>(Arrays.asList("d", "A", "C", "F", "a"));
		System.out.println("원본 : " + dataList);
		
		dataList.sort(Comparator.naturalOrder());
		System.out.println("오름차순 : " + dataList);
		
		dataList.sort(Comparator.reverseOrder());
		System.out.println("내림차순 : " + dataList);
		
		dataList.sort(String.CASE_INSENSITIVE_ORDER);
		System.out.println("대소문자무시 : " + dataList);
		
		dataList.sort(Collections.reverseOrder(String.CASE_INSENSITIVE_ORDER));
		System.out.println("대소문자무시 내림차순 : " + dataList);
		
	}

}
