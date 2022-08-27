package Project_1;
public class ItemTest {

	public static void main(String[] args) {
		testGetCost1();
		testGetCost2();
		testGetCost3();
		test
	}
	
	// Test getCost for all 3 cases of quantity.
	public static void testGetCost1() {
		System.out.println("-->testGetCost()");
		Item it = new Item("123", "bb", 1, 2, 3);
		System.out.print(it.getCost(1));
	}
	public static void testGetCost2() {
		System.out.println("\n-->testGetCost()");
		Item it = new Item("123", "bb", 1, 2, 3);
		System.out.print(it.getCost(9));
	}

	public static void testGetCost3() {
		System.out.println("\n-->testGetCost()");
		Item it = new Item("123", "bb", 1, 2, 3);
		System.out.print(it.getCost(21));
	}
	
	public static void testGetCost() {
		System.out.println("\n-->testGetCost()"b );
	}
}
