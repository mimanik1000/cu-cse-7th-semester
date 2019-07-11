package as.ag;

public class Address {
		private Integer id;
		private String address;
		private String city;
		private String country;
		
		public Address(Integer id, String address, String city, String country) {
			this.id = id;
			this.address = address;
			this.city = city;
			this.country = country;
		}

		public Integer getId() {
			return id;
		}

		public void setId(Integer id) {
			this.id = id;
		}

		public String getAddress() {
			return address;
		}

		public void setAddress(String address) {
			this.address = address;
		}

		public String getCity() {
			return city;
		}

		public void setCity(String city) {
			this.city = city;
		}

		public String getCountry() {
			return country;
		}

		public void setCountry(String country) {
			this.country = country;
		}

		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return " [" + address + "," + city + "," + country + "]";
		}
		
		
}
