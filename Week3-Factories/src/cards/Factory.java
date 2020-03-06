package cards;

public class Factory {

	public Card specificCard(int number, String name, int cvv, String type) {
		
		if(type.equals("Maestro")) {
			return new Maestro(number, name, cvv);
		}
		if(type.equals("Mastercard"))  {
			return new Mastercard(number, name, cvv);
		}
		if(type.equals("Visa"))  {
			return new Visa(number, name, cvv);
		}
		
		return null;
	}
}
