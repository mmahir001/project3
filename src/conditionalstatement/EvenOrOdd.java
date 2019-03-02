package conditionalstatement;

public class EvenOrOdd {
	public static void main(String[] args) {
		
//		int num1 = 10;		
//		if (num1 % 2 == 0) {
//			System.out.println(num1 + " is even.");
//		}else {
//			System.out.println(num1 + " is odd.");
//		}
		
		int num1 = 10;
		int num2 = 15;
		if(num1 > num2) {
			System.out.println(num1 + " is bigger than " + num2);
		}else if (num1 < num2) {
			System.out.println(num2 + " is bigger than " + num1);
		}else if (num1 == num2) {
			System.out.println(num2 + " is equal to " + num1);
		}
		
	}

}
