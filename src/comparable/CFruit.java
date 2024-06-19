package comparable;

public class CFruit implements Comparable<CFruit> {
	private String name;
	private int price;
	
	public CFruit(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	@Override
	public int compareTo(CFruit anotherFruit) {
//		if (this.price > anotherFruit.price) return 1;
//		if (this.price == anotherFruit.price) return 0;
//		return -1;
		return Integer.compare(this.price, anotherFruit.price);
	}

	@Override
	public String toString() {
		return  name + ":" + price;
	}
	
}