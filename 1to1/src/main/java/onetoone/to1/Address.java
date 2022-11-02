package onetoone.to1;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="address1")
public class Address {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int addressId;
	private String addressLine,city,state,country;
	private int pincode;
	public int getAddressId() {
		return addressId;
	}
	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}
	public String getAddressLine() {
		return addressLine;
	}
	public void setAddressLine(String addressLine) {
		this.addressLine = addressLine;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public Address(int addressId, String addressLine, String city, String state, String country, int pincode) {
		super();
		this.addressId = addressId;
		this.addressLine = addressLine;
		this.city = city;
		this.state = state;
		this.country = country;
		this.pincode = pincode;
	}
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Address [addressId=" + addressId + ", addressLine=" + addressLine + ", city=" + city + ", state="
				+ state + ", country=" + country + ", pincode=" + pincode + "]";
	}
	public void setEmployee(Employee e1) {
		// TODO Auto-generated method stub
		
	}
	

}

