package as.ag;

public class Customer {
			private Integer id;
			private String name;
			
			Address address;
		
			/**
			 * @param id
			 * @param name
			 * @param address
			 */
			public Customer(Integer id, String name, Address address) {
				super();
				this.id = id;
				this.name = name;
				this.address = address;
			}

			/**
			 * @return the id
			 */
			public Integer getId() {
				return id;
			}
		
			/**
			 * @param id the id to set
			 */
			public void setId(Integer id) {
				this.id = id;
			}
			
			/**
			 * @return the name
			 */
			public String getName() {
				return name;
			}

			/**
			 * @param name the name to set
			 */
			public void setName(String name) {
				this.name = name;
			}

			/**
			 * @return the address
			 */
			public Address getAddress() {
				return address;
			}
		
			/**
			 * @param address the address to set
			 */
			public void setAddress(Address address) {
				this.address = address;
			}

			@Override
			public String toString() {
				// TODO Auto-generated method stub
				return " [" + name + "," + address + "]";
			}
			
}
