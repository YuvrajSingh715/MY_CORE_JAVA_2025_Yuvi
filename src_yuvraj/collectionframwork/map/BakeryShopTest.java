package collectionframwork.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class BakeryShopTest {

	public static void main(String[] args) {

		Map<BakeryShop, String> map = new HashMap<>();

		BakeryShop bakeryShop1 = new BakeryShop(1, "Brown Bread");
		BakeryShop bakeryShop2 = new BakeryShop(2, "Butter Cookies");
		BakeryShop bakeryShop3 = new BakeryShop(3, "Brownies");
		BakeryShop bakeryShop4 = new BakeryShop(4, "Maggie");
		BakeryShop bakeryShop7 = new BakeryShop(7, "Patties");
		BakeryShop bakeryShop5 = new BakeryShop(5, "TurTure");
		BakeryShop bakeryShop6 = new BakeryShop(6, "Sandwiches");
		BakeryShop bakeryShop8 = new BakeryShop(8, null);

		map.put(bakeryShop2, "Out of Stock");
		map.put(bakeryShop7, "Come Tomorrow");
		map.put(bakeryShop5, "Available");
		map.put(bakeryShop3, "Sold Out");
		map.put(bakeryShop4, "Not Available");
		map.put(bakeryShop1, "Available");
		map.put(bakeryShop6, "Not Available");
		map.put(bakeryShop8, "Nothing");

		map.put(bakeryShop3, "Sorry For That");
		map.put(bakeryShop4, "Available");
		map.put(bakeryShop2, "Stock Replaced");

		
		// both are duplicate (key & value)
		map.put(null, null);
//		map.put(null, null);

		// null key
		map.put(null, "the new shop");

		// duplicate null key (overides first one key)
		map.put(null, "Shop Status: Still the shop is new");

		
		Iterator<Map.Entry<BakeryShop, String>> itr = map.entrySet().iterator();
		while (itr.hasNext()) {
			Map.Entry<BakeryShop, String> entry = itr.next();
			System.out.println(entry.getKey() + " >->-> " + entry.getValue());
		}

	}

}
