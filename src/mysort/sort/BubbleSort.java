package mysort.sort;

public class BubbleSort<T extends Comparable> extends Sort<T> {

	@Override
	public void sort(T[] dataList) {
		setData(dataList);
		for (int last = sortedData.length - 1; last >= 1; last--) {
			for (int i = 0; i <= last - 1; i++) {
				if (sortedData[i].compareTo(sortedData[i+1]) == 1) {
					swap(sortedData, i, i+1);
				}
			}
		}
	}

}
