package Problem1;

public class CustomerMain {

	public static void main(String[] args) {
		Address addr1 = new Address("1000 North 4th St", "Fairfield", "Iowa", "52557");
		Address addr2 = new Address("1001 East 4th St", "Chicago", "Chicago", "52558");
		Address addr3 = new Address("1002 West 4th St", "Chicago", "Chicago", "52559");

		Customer cust1 = new Customer("Misgan", "Asmamaw", "112233");
		Customer cust2 = new Customer("Abel", "Abadi", "112233");
		Customer cust3 = new Customer("Adane", "Nigus", "112233");
		// I assume the address for both billing and shipping address is same
		cust1.setBillingAddress(addr1);
		cust1.setShippingAddress(addr1);
		cust2.setBillingAddress(addr2);
		cust2.setShippingAddress(addr2);
		cust3.setBillingAddress(addr3);
		cust3.setShippingAddress(addr3);

		Customer[] customer1 = new Customer[3];
		customer1[0] = cust1;
		customer1[1] = cust2;
		customer1[2] = cust3;

		System.out.println("Customers whose billing address from Chicago:");
		for (Customer c : customer1) {
			if (c.getBillingAddress().city == "Chicago")
				System.out.println(c.toString());

		}

	}
}
