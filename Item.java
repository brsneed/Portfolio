package Project_1;

public class Item extends Object {
	private String itemId;
	private String description;
	private double cost1;
	private double cost2;
	private double cost3;

	public Item(String itemId, String description, double cost1, double cost2, double cost3) {
		this.itemId = itemId;
		this.description = description;
		this.cost1 = cost1;
		this.cost2 = cost2;
		this.cost3 = cost3;

	}

	public String getItemId() {
		return itemId;
	}

	public String getDescription() {
		return description;
	}

	public double getCost(int num) {
		if (num > 5) {
			return cost1;
		}

		else if (num > 10) {
			return cost2;
		}

		return cost3;
	}

	@Override
	public String toString() {
		return " itemId=" + itemId + ", description=" + description + ", cost1=" + cost1 + ", cost2=" + cost2
				+ ", cost3=" + cost3 + "]";
	}

}
