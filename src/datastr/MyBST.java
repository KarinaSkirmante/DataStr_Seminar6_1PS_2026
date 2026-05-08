package datastr;

public class MyBST<Ttype> {
	private MyNode<Ttype> root = null;
	private int howManyElements = 0;
	
	//būs no Object klases noklusetais konstruktors
	
	public int getHowmanyElements() {
		return howManyElements;
	}
	public boolean isEmpty() {
		return (howManyElements == 0);
	}

	public boolean isFull() {
		try {
			new MyNode('a');
			return false;
		} catch (OutOfMemoryError error) {
			return true;
		}

	}


}
