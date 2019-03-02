package project3;

public class TestHome {
	public static void main(String[] args) {
		Home home1 = new Home();
		home1.setAddress("425 pine");
		home1.displayAddress();
		
		Home home2 = new Home("506 pacific");
		Home home3= new Home(25);
		
}
}
