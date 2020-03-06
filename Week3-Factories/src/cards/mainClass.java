package cards;

public class mainClass {
	private String name;
	private int number;
	private int cvv;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Factory myFactory = new Factory();
		

		Card myCard = myFactory.specificCard(123, "Alejandro", 1234, "Mastercard");
		
		System.out.println(myCard);
	}

}
