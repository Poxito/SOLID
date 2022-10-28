package isp;

public class Person implements IEmail, ITelephone{

	String name, address, email, telephone;
	
	public Person() {
		
	}
	
	public Person(String name, String address, String email, String telephone) {
		super();
		this.name = name;
		this.address = address;
		this.email = email;
		this.telephone = telephone;
	}
	
	public void setName(String n) { name = n; }
	public String getName() { return name; }

	public void setAddress(String a) { address = a; }
	public String getAddress() { return address; }

	@Override
	public void setEmail (String ea) { email = ea; }
	
	@Override
	public String getEmail () { return email; }

	@Override
	public void setTelephone(String t) { telephone = t; }
	
	@Override
	public String getTelephone() { return telephone; }
}
