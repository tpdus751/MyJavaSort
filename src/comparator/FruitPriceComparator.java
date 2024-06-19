package comparator;

import java.util.Comparator;

public class FruitPriceComparator implements Comparator<Fruit> {

	@Override
	public int compare(Fruit fruit1, Fruit fruit2) {
		return Integer.compare(fruit1.price, fruit2.price);
	}

}
