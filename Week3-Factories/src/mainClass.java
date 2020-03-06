import abtractsClasses.CardFactory;
import abtractsClasses.FactoryVisa;
import cards.Card;
import cards.Factory;

public class mainClass {
	private String name;
	private int number;
	private int cvv;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Factory myFactory = new Factory();
		

		Card myCard = myFactory.specificCard(123, "Alejandro", 1234, "Mastercard");
		
		System.out.println(myCard);
		
		Card mySecondCard = CardFactory.getCard(new FactoryVisa(1234, "Facundo", 56));
		
		System.out.println(mySecondCard);
	}

}
