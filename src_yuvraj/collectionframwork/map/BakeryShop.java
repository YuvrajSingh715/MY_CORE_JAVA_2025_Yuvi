package collectionframwork.map;

import java.util.Objects;

public class BakeryShop {

	private int itemNo;
	private String grocery;

	public BakeryShop(int itemNo, String grocery) {
		super();
		this.itemNo = itemNo;
		this.grocery = grocery;
	}

	public void setItemNo(int itemNo) {
		this.itemNo = itemNo;
	}

	public void setGrocery(String grocery) {
		this.grocery = grocery;
	}

	public int getItemNo() {
		return itemNo;
	}

	public String getGrocery() {
		return grocery;
	}

	@Override
	public String toString() {
		return "Product List >>> [Item no. : " + itemNo + " || Grocery : " + grocery + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(itemNo);
	}

	@Override
	public boolean equals(Object obj) {

		if (this == obj) {
			return true;
		}

		if (obj == null) {
			return false;
		}

		if (this.getClass() != obj.getClass()) {
			return false;
		}

		BakeryShop bakeryShop = (BakeryShop) obj;

		return Objects.equals(itemNo, bakeryShop.itemNo);

	}

}
