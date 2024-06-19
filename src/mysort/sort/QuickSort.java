package mysort.sort;

public class QuickSort <T extends Comparable> extends Sort<T> {

	@Override
	public void sort(T[] dataList) {
		setData(dataList);
		quickSort(sortedData, 0, sortedData.length-1);
	}
	
	void quickSort(T[] dataList, int start, int end) {
		if (start >= end) return;
		int p = partition(dataList, start, end);
		
		quickSort(dataList, start,  p-1);
		quickSort(dataList, p+1, end);
	}
	
	
	int partition(T[] dataList, int start, int end) {
		T pivot = dataList[end];
		int leftEnd = start - 1;	// left
		for (int i = start; i <= end - 1; i++) {
			if (dataList[i].compareTo(pivot) == -1) {
				swap(dataList, ++leftEnd, i);
			}
		}
		swap(dataList, leftEnd + 1, end);
		return leftEnd + 1; 
	}

}
