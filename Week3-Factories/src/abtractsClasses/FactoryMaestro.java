package abtractsClasses;

import cards.Card;
import cards.Maestro;
import cards.Mastercard;

public class FactoryMaestro extends AbstractFactory{

	private int number;
	private String name;
	private int cvv;
	
	public FactoryMaestro(int number, String name, int cvv) {
		this.number = number;
		this.cvv = cvv;
		this.name = name;
	}
	@Override
	public Card createCard() {
		// TODO Auto-generated method stub
		return new Maestro(number, name, cvv);
	}

}
