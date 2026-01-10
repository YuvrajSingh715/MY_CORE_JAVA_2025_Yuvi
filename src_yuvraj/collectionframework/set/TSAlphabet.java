package collectionframework.set;

import java.util.Comparator;

public class TSAlphabet implements Comparator<TSAlphabet>{

	private char firstLetter;
	private String name;
	private char lastLetter;

	// Constructor()
	public TSAlphabet() {}
	public TSAlphabet(char firstLetter, String name, char lastLetter) {
		this.firstLetter = firstLetter;
		this.name = name;
		this.lastLetter = lastLetter;
	}

	// Getter()
	public char getLastLetter() {
		return lastLetter;
	}

	public char getFirstLetter() {
		return firstLetter;
	}

	public String getName() {
		return name;
	}

	// Setter()
	public void setLastLetter(char lastLetter) {
		this.lastLetter = lastLetter;
	}

	public void setFirstLetter(char firstLetter) {
		this.firstLetter = firstLetter;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override // toString()
	public String toString() {
		return "Alphabet +-> [First Letter : " + firstLetter + " || Name : " 
	            + name + " || Last Letter : " + lastLetter + "]";
	}
	
	@Override
	public int compare(TSAlphabet o1, TSAlphabet o2) {
		
		// Step:1 compare first letter
		int fl = Character.compare(o1.getFirstLetter(), o2.getFirstLetter());
		if(fl != 0) {
			return fl;
		}
		
		// Step:2 compare name
		int n = o1.getName().compareTo(o2.getName());
		if (n != 0) {
			return n;
		}
		
		// Step:3 compare last letter
		return Character.compare(o1.getLastLetter(), o2.getLastLetter());
	}
}
