package mysort.sort;

public class SelectionSort<T extends Comparable> extends Sort<T> {
	
	@Override
	public void sort(T[] dataList) {
		setData(dataList);
		for (int last = sortedData.length-1; last >= 1; last--) {
			int maxIndex = selectMax(sortedData, last);
			if (maxIndex != last)
				swap(sortedData, maxIndex, last);
		}
	}
	
	int selectMax(T[] dataList, int last) {
		T max = dataList[0];
		int maxIndex = 0;
		
		for (int i = 1 ; i <= last; i++) {
//			if (dataList[i] > max) {
			if (dataList[i].compareTo(max) >= 1) {
				max = dataList[i];
				maxIndex = i;
			}
		}
		return maxIndex;
	}

	
}
