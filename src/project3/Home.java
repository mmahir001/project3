package project3;

public class Home {
	public String address;
	public int num;
	
	//constructor - 1
	public Home() {}
	
	//constructor - 2
	public Home(String address) {
		this.address = address;
		System.out.println(address);
	}
	//constructor - 1
	public Home(int address) {
		this.num = address;
		System.out.println(address);
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public void displayAddress() {
		System.out.println(this.address);
	}
}
