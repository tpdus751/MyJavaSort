package mysort.sort;

public class InsertionSort<T extends Comparable> extends Sort<T> {

	@Override
	public void sort(T[] dataList) {
		setData(dataList);
		
		for (int i = 1; i < sortedData.length; i++) {
			int loc = findLessFromLast(sortedData, sortedData[i], i-1);
			if (loc != i-1)
				insertData(sortedData, loc+1, i);
		}

	}

	private void insertData(T[] dataList, int target, int source) {
		T temp = dataList[source];
		for (int i = source; i > target; i--) {
			dataList[i] = dataList[i-1];
		}
		dataList[target] = temp;
	}

	private int findLessFromLast(T[] dataList, T data, int last) {
		for (int i = last; i >= 0; i--) {
			if (dataList[i].compareTo(data) <= 0) return i; 
		}
		return -1;
	}
	
	 

}
